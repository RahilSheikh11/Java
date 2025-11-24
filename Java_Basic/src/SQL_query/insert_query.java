package SQL_query;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

import database.db_connection;

public class insert_query
{
	Connection con;
	db_connection c = new db_connection();

	public void insert() {
		con = c.gConnection();
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
	
	public  void update() {
		con=c.gConnection();
		
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
		con=c.gConnection();
		try {
			PreparedStatement psmt=con.prepareStatement("Delete from student where id=?");
			psmt.setInt(1, 2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void select() {
		con=c.gConnection();
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
		insert_query i=new insert_query();
		i.select();
	}
}


	
	
