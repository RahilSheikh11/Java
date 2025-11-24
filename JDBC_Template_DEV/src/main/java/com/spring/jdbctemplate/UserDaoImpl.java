package com.spring.jdbctemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void register(User user) {
	String sql = "insert into cafe_app (Username, Password) values(?,?)";
	jdbcTemplate.update(sql, new Object[] {user.getUsername(), user.getPassword()});
		
	}

	@Override
	public List<User> getallusers() {
		String sql ="select * from cafe_app";
		return jdbcTemplate.query(sql, (rs, rowNum) -> {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setUsername(rs.getString("Username"));
			user.setPassword(rs.getString("Password"));
		return user;
	});
	}

	@Override
	public User getUserById(int id) {
		String sql="select * from cafe_app where id="+id;
		return jdbcTemplate.queryForObject(sql,(rs, rowNum) ->{
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setPassword(rs.getString("Password"));
		user.setUsername(rs.getString("Username"));
		return user;
		});
	}

	@Override
	public void updateuser(User user) {
		String sql = "update cafe_app set username=?, password=? where id=?";
		jdbcTemplate.update(sql,new Object[] {user.getUsername(), user.getPassword(), user.getId()});
		
	}
}
