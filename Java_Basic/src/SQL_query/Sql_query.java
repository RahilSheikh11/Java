package SQL_query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.db_connection;

public class Sql_query {
	Connection con;
	db_connection db=new db_connection();
	public void insert() {
		con = db.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("insert into student (name,password) values(?,?)");
			psmt.setString(1,"Lalala");
			psmt.setString(2,"passwordlalala");
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("Data inserted");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void login_check() {
		con=db.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("select * from student where name=? and password=?");
			psmt.setString(1, "Tops");
			psmt.setString(2, "Topspassword");
			ResultSet rs=  psmt.executeQuery();
			boolean b=rs.next();
			if(b==true) {
				System.out.println("Login successful");
			}
			else {
				System.out.println("Error");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public  void update() {
		con=db.gConnection();
		
		try {
			PreparedStatement psmt=con.prepareCall("update student set name=?, password=? where id=?");
			psmt.setString(1, "Tops");
			psmt.setString(2, "Topspassword");
			psmt.setInt(3, 1);
			int i = psmt.executeUpdate();
			if(i>0) {
				System.out.println("Data updated");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete() {
		con=db.gConnection();
		try {
			PreparedStatement psmt=con.prepareStatement("Delete from student where id=?");
			psmt.setInt(1, 2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void select() {
		con=db.gConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("select * from student");
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+" " +rs.getString("name")+" " + rs.getString("password"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
public static void main(String[] args) {
	Sql_query sql=new Sql_query();
	sql.select();
	sql.login_check();
}
}
