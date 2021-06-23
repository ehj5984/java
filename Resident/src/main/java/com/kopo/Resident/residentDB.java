package com.kopo.Resident;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class residentDB {
	public boolean creatdDB() {

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/resident.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE resident (idx INTEGER PRIMARY KEY AUTOINCREMENT"
					+ ", name TEXT, age TEXT, gender TEXT, created TEXT, updated TEXT)";
			// sqlite는 정수는 INTEGER, 실수는 REAL, 문자열 TEXT
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);
			statement.close();

			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean insertDb(Resident resident) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/resident.db",
					config.toProperties());

			String query = "INSERT INTO resident (name, age, gender, created, updated ) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, resident.name);
			preparedStatement.setString(2, resident.age);
			preparedStatement.setString(3, resident.gender);
			preparedStatement.setString(4, resident.created);
			preparedStatement.setString(5, resident.updated);

			int finalResult = preparedStatement.executeUpdate();

			if (finalResult == 1) {
				return false;
			}

			if (finalResult == 0) {

			}
			preparedStatement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public String selectData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/resident.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM resident ";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");

				resultString = resultString + "<tr>" + "<td>" + idx + "</td>" + "<td>" + name + "</td>" + "<td>" + age
						+ "</td>" + "<td>" + gender + "</td>" + "<td>" + created + "</td>" + "<td>" + updated + "</td>"
						+ "<td><a href='delete?idx=" + idx + "'>삭제하기</a></td>" + "</tr>";
			}
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultString;
	}

	public Resident detailsData(int idx) {
		Resident resultData = new Resident();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/resident.db",
					config.toProperties());
			String query = "SELECT * FROM resident WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.name = resultSet.getString("name");
				resultData.age = resultSet.getString("age");
				resultData.gender = resultSet.getString("gender");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");

			}
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultData;
	}

	public boolean updateData(String name, String age, String gender, String updated, int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/resident.db",
					config.toProperties());
			String query = "UPDATE resident SET name=?, age=?, gender=?, updated=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, age);
			preparedStatement.setString(3, gender);
			preparedStatement.setString(5, updated);
			preparedStatement.setInt(6, idx);

			int result = preparedStatement.executeUpdate();
			if (result < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			} else {
				preparedStatement.close();
				connection.close();
				return true;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteData(int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/resident.db",
					config.toProperties());

			String query = "DELETE FROM resident WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, idx);
			int finalResult = preparedStatement.executeUpdate();

			preparedStatement.close();
			connection.close();
			if (finalResult == 1) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
