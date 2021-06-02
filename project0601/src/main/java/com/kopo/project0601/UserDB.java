package com.kopo.project0601;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

import com.kopo.project0301.Customer;

public class UserDB {
	// 테이블 생성
	public void createTable() {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/personnel.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE personnel (idx INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, name TEXT, gender TEXT, address TEXT, depart TEXT)";
			// sqlite는 정수는 INTEGER, 실수는 REAL, 문자열 TEXT
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
	}

	public String selectData() {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/personnel.db",
					config.toProperties());

			String query = "SELECT * FROM personnel";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String gender = resultSet.getString("gender");
				String address = resultSet.getString("address");
				String depart = resultSet.getString("depart");
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" + name + "</td><td>" + gender + "</td><td>"
						+ address + "</td><td>" + depart + "</td><td><a href='update?idx=" + idx + "'>수정하기</a></td>";
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
		return resultString;
	}

//데이터 입력 
	public void insertData(String id,String pwd, String name, String birthday, String address) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/personnel.db",
					config.toProperties());

			String query = "INSERT INTO personnel (name, gender, address, depart) VALUES ('" + name + "', '" + gender + "','" + address + "', '" + depart + "')" ;
												
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
	}
	public Customer detailsData(int idx) {
		Customer resultData = new Customer();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/personnel.db",
					config.toProperties());

			String query = "SELECT * FROM personnel WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.gender = resultSet.getString("gender");
				resultData.address = resultSet.getString("address");
				resultData.depart = resultSet.getString("depart");
			}
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
		return resultData;
	}

	public void updateData(int idx,String id,String pwd, String name, String birthday, String address) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/personnel.db",
					config.toProperties());

			String query = "UPDATE personnel SET name=?, gender=?, address=?, depart =? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, gender);
			preparedStatement.setString(3, address);
			preparedStatement.setString(4, depart);
			preparedStatement.setInt(5, idx);
			int result = preparedStatement.executeUpdate();
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
