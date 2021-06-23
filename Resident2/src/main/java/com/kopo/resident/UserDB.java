package com.kopo.resident;

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

	public boolean insertDB(People people)  {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "c:/tomcat/users.db",
					config.toProperties());

			
			
			String query = "INSERT INTO users ( name, age, gender, created, updated) "
					+ "VALUES (?,?,?,?,?)";
			
			
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(3, people.name);
			preparedStatement.setString(4, people.age);
			preparedStatement.setString(5, people.gender);
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
//
//	public String sha256(String msg) {
//		try {
//			MessageDigest md = MessageDigest.getInstance("SHA-256");
//			md.update(msg.getBytes());
//
//			StringBuilder builder = new StringBuilder();
//			for (byte b : md.digest()) {
//				builder.append(String.format("%02x", b));
//			}
//			return builder.toString();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return "";
//		}
//	}
	
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
				String name = resultSet.getString("name");
				String age = resultSet.getString("age");
				String gender = resultSet.getString("gender");
		
				
				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td>" 
													+ name + "</td><td>" 
													+ age + "</td><td>" 
									
													+ gender + "</td><td><a href='update?idx=" + idx + "'>수정하기</a></td>";
													
				resultString = resultString + "</tr>";
			}
			preparedStatement.close();

			// close
			connection.close();
		} catch (Exception e) {
		}
		return resultString;
	}

}
