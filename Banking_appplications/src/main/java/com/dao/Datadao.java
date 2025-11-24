package com.dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.conn.DbConn;
import com.model.User;

public class Datadao implements DatadaoI{

	DbConn db = new DbConn();
	Connection con = db.gConnection();
	
	
	@Override
	public String Inserrtdata(User user) {
	try {
		PreparedStatement psmt = con.prepareStatement("insert into bank_app (username,phone,email,password,image) values(?,?,?,?,?)");
		psmt.setString(1, user.getUsername());
		psmt.setString(2, user.getPhone());
		psmt.setString(3, user.getEmail());
		psmt.setString(4, user.getPassword());
		psmt.setBytes(5, user.getImage());
		
		int i = psmt.executeUpdate();
		
		if(i>0) {
			return "success";
		}
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		return null;
	}

@Override
	public List<User> showalldata()
{
		ArrayList<User> list = new ArrayList<User>();
		
		try {
			PreparedStatement psmt=con.prepareStatement("select id, email, phone, password, username from bank_app");
			ResultSet rs=psmt.executeQuery();
			
			User u;
			while(rs.next()) {
				 u= new User();				
				u.setId(rs.getInt("id"));
				u.setEmail(rs.getString("email"));
				u.setPhone(rs.getString("phone"));
				u.setPassword(rs.getString("password"));
				u.setUsername(rs.getString("username"));
				list.add(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

@Override
public User getId(int id) {
			User u=null;
	try {
		PreparedStatement psmt = con.prepareStatement("select * from bank_app where id=?");
		psmt.setInt(1, id);
		ResultSet rs = psmt.executeQuery();
		while(rs.next()) {
			u=new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setEmail(rs.getString("email"));
			u.setPassword(rs.getString("email"));
			u.setPhone(rs.getString("phone"));
			u.setImage(rs.getBytes("image"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return u;
}

@Override
public String update(User u) {
	
	try {
		PreparedStatement psmt = con.prepareStatement("update bank_app set username=?,phone=?,email=?,password=?,image=? where id=?");
		psmt.setString(1, u.getUsername());
		psmt.setString(2, u.getPhone());
		psmt.setString(3, u.getEmail());
		psmt.setString(4, u.getPassword());
		psmt.setBytes(5, u.getImage());
		psmt.setInt(6, u.getId());
		
		
		
		int i = psmt.executeUpdate();
		if(i>0) {
			return "Success";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

@Override
public String delete_data(int id) {
	try {
		PreparedStatement psmt = con.prepareStatement("delete from bank_app where id=?");
		psmt.setInt(1, id);
		int i = psmt.executeUpdate();
		if(i>0) {
			return "Success";
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}

@Override
public String login(String username, String password) {
	try {
		PreparedStatement psmt = con.prepareStatement("select * from bank_app where username=? and  password=?");
		psmt.setString(1, username);
		psmt.setString(2, password);
		ResultSet rs = psmt.executeQuery();
		boolean s = rs.next();
		if(s==true) {
			return "success";
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return "Invald Username or Password!";
	
}

@Override
public byte[] getimagebyid(int id) {
	byte[] image=null;
	try {
		PreparedStatement psmt = con.prepareStatement("select image from bank_app where id=?");
		psmt.setInt(1, id);
		ResultSet rs = psmt.executeQuery();
		if(rs.next()) {
		image=rs.getBytes("image");
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return image;
}

}
