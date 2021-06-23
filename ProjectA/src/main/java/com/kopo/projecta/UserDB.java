package com.kopo.projecta;

import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class UserDB {
	public boolean createDB() {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/users.db",
					config.toProperties());
			// use
			String query = "CREATE TABLE users (idx INTEGER PRIMARY KEY AUTOINCREMENT"
					+ ", id TEXT, pwd TEXT, name TEXT, birthday TEXT, address TEXT, created TEXT, updated TEXT)";
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

	public boolean insertDB(People people)  {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/users.db",
					config.toProperties());

//			String query = "INSERT INTO users (id, pwd, name, birthday, address, created, updated) VALUES ('"
//					+ people.id + "', '"
//					+ people.pwd + "', '"
//					+ people.name + "', '"
//					+ people.birthday + "', '"
//					+ people.address + "', '"
//					+ people.created + "', '"
//					+ people.updated + "'"
//					+ ")";
//			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate(query);
			
			people.pwd = sha256(people.pwd);
			
			String query = "INSERT INTO users (id, pwd, name, birthday, address, created, updated) "
					+ "VALUES (?,?,?,?,?,?,?)";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, people.id);
			preparedStatement.setString(2, people.pwd);
			preparedStatement.setString(3, people.name);
			preparedStatement.setString(4, people.birthday);
			preparedStatement.setString(5, people.address);
			preparedStatement.setString(6, people.created);
			preparedStatement.setString(7, people.updated);

			int result = preparedStatement.executeUpdate();
			System.out.println(result);
			if (result < 1) {
				return false;
			}
			
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public String sha256(String msg) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(msg.getBytes());

			StringBuilder builder = new StringBuilder();
			for (byte b : md.digest()) {
				builder.append(String.format("%02x", b));
			}
			return builder.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public String selectData() {
		String resultString = "";
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/users.db",
					config.toProperties());

			String query = "SELECT * FROM users";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String id = resultSet.getString("id");
				String pwd = resultSet.getString("pwd");
				String name = resultSet.getString("name");
				String birthday = resultSet.getString("birthday");
				String address = resultSet.getString("address");
				
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" 
													+ id + "</td><td>" 
													+ pwd + "</td><td>" 
													+ name + "</td><td>" 
													+ birthday + "</td><td>"
													+ address + "</td><td><a href='update?idx=" + idx + "'>수정하기</a></td>";
													
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
		return resultString;
	}
	
	public boolean deleteData(int idx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/users.db",
					config.toProperties());

			String query = "DELETE FROM users WHERE idx=?";
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
