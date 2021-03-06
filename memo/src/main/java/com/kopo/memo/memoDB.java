package com.kopo.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.sqlite.SQLiteConfig;

public class memoDB {

	// db생성
	public boolean createdDB() {
		boolean isSuccess = false;

		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			// memo table query
			String query = "CREATE TABLE memo(idx INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, content TEXT, created TEXT, updated TEXT, userIdx INTEGER)";
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(query);

			// user table 생성 query
			String query2 = "CREATE TABLE memoUser(idx INTEGER PRIMARY KEY AUTOINCREMENT, id TEXT, pwd TEXT, name TEXT, birthday TEXT, address TEXT, joindate TEXT)";
			Statement statement2 = connection.createStatement();
			int result2 = statement2.executeUpdate(query2);

			statement.close();
			statement2.close();
			connection.close();

			// close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean insertDB(Memo memoData) {
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String fieldString = "title, content, created, updated, userIdx";
			String query = "INSERT INTO memo (" + fieldString + ") VALUES (?, ?, ?, ?, ?);";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memoData.title);
			preparedStatement.setString(2, memoData.content);
			preparedStatement.setString(3, memoData.created);
			preparedStatement.setString(4, memoData.updated);
			preparedStatement.setInt(5, memoData.userIdx);

			int finalResult = preparedStatement.executeUpdate();

			if (finalResult < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			}
			preparedStatement.close();
			connection.close();
			return true;
			// close
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public String selectData() {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM memo;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");
//				String id = resultSet.getString("id");
//				id 없애놓고 idx  추가한거 

				resultString = resultString + "<tr>";

				resultString = resultString + "<td>" + idx + "</td><td class='content_sort'>" + title
						+ "</td><td class='content_sort'>" + content + "</td><td>" + created + "</td><td>" + "</td>";

				resultString = resultString + "</tr>";
			}

			// close
			preparedStatement.close();
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultString;
	}

	// 데이터를 가져오기
	public Memo detailData(int idx) {
		Memo resultData = new Memo();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());
			String query = "SELECT * FROM memo WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, idx); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.title = resultSet.getString("title");
				resultData.content = resultSet.getString("content");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
				resultData.userIdx = resultSet.getInt("userIdx");
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

	// 데이터 업데이트
	public boolean updateData(Memo memo) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			// update query 적기
			String query = "UPDATE memo SET title=?, content=?, created=?, updated=? WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, memo.title);
			preparedStatement.setString(2, memo.content);
			preparedStatement.setString(3, memo.created);
			preparedStatement.setString(4, memo.updated);
			preparedStatement.setInt(5, memo.idx);
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

	// 데이터 삭제
	public boolean deleteData(int userIdx) {
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String query = "DELETE FROM memo WHERE idx=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setInt(1, userIdx);
			int finalResult = preparedStatement.executeUpdate();

			if (finalResult < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			}
			preparedStatement.close();
			connection.close();
			return true;

			// close
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

////////////////////////// USER 

	public boolean signup(User user) {
		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String query2 = "SELECT * FROM memoUser WHERE id = ?";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setString(1, user.id);
			ResultSet resultSet = preparedStatement2.executeQuery();
			if (resultSet.next()) {
				// next가 된다는건 조회가 됐다는것 => 중복 데이터가 존재한는 것

				preparedStatement2.close();
				connection.close();
				return false;
			}
			preparedStatement2.close();

			String fieldString = " id, pwd, name, birthday, address, joindate";
			String query = " INSERT INTO memoUser (" + fieldString + ") VALUES (? ,?,?,?,?,? );";

			PreparedStatement preparedStatement = connection.prepareStatement(query);

			preparedStatement.setString(1, user.id);
			preparedStatement.setString(2, user.pwd);
			preparedStatement.setString(3, user.name);
			preparedStatement.setString(4, user.birthday);
			preparedStatement.setString(5, user.address);
			preparedStatement.setString(6, user.joindate);

			int finalResult = preparedStatement.executeUpdate();

			if (finalResult < 1) {
				preparedStatement.close();
				connection.close();
				return false;
			}
			preparedStatement.close();
			connection.close();
			return true;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public int loginDB(User user) {

		// open
		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String query2 = "SELECT * FROM memoUser WHERE id = ? AND pwd = ?";
			PreparedStatement preparedStatement2 = connection.prepareStatement(query2);
			preparedStatement2.setString(1, user.id);
			preparedStatement2.setString(2, user.pwd);

			ResultSet resultSet = preparedStatement2.executeQuery();
			if (resultSet.next()) {
				// next가 된다는건 조회가 됐다는것 => 중복 데이터가 존재한는 것
				// 여기서는 있어야 로그인이 완료되는 것
				preparedStatement2.close();
				connection.close();

				return 1;
			} else {
				return -1;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -2;
	}

	public String loginUserMemoList(User user) {
		String resultString = "";

		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			// use
			String query = "SELECT * FROM memo WHERE id = ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, user.id);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int idx = resultSet.getInt("idx");
				String title = resultSet.getString("title");
				String content = resultSet.getString("content");
				String created = resultSet.getString("created");
				String updated = resultSet.getString("updated");
				String id = resultSet.getString("id");

				resultString = resultString + "<tr>";
				resultString = resultString + "<td>" + idx + "</td><td class='content_sort'>" + title
						+ "</td><td class='content_sort'>" + content + "</td><td>" + created + "</td><td>" + updated
						+ "</td><td>" + id + "</td>" + "<td><a href = 'update?id=" + id + "'>수정</a></td>"
						+ "<td><a href = 'delete?idx=" + idx + "'>삭제</a></td>" + "";
				resultString = resultString + "</tr>";
			}

			// close
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultString;

	}

	public Memo loginDetailsData(String id) {
		Memo resultData = new Memo();
		try {
			// open
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());
			String query = "SELECT * FROM memo WHERE id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id); // index 번호 지정해서 리스트 가져오기(그럼 query에 where name LIKE ? 절 추가)
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				resultData.idx = resultSet.getInt("idx");
				resultData.title = resultSet.getString("title");
				resultData.content = resultSet.getString("content");
				resultData.created = resultSet.getString("created");
				resultData.updated = resultSet.getString("updated");
				resultData.userIdx = resultSet.getInt("userIdx");
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

	public User selectingLoginUser(String userId) {
		User resultData = new User();

		try {
			Class.forName("org.sqlite.JDBC");
			SQLiteConfig config = new SQLiteConfig();
			Connection connection = DriverManager.getConnection("jdbc:sqlite:/" + "C:/tomcat/memo.db",
					config.toProperties());

			String query = "SELECT * FROM memoUser WHERE id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, userId);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				// next가 된다는건 조회가 됐다는것 => 중복 데이터가 존재한는 것
				// 여기서는 있어야 로그인이 완료되는 것
				resultData.id = resultSet.getString("id");
				resultData.pwd = resultSet.getString("pwd");
//				resultdata.name = resultSet.getString("name");
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
}
