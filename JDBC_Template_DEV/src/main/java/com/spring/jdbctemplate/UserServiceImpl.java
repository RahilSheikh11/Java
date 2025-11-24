package com.spring.jdbctemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void register(User user) {
		userDao.register(user);
		
	}

	@Override
	public List<User> getallusers() {
		return userDao.getallusers();
	}

	@Override
	public User getUserById(int id) {
		return userDao.getUserById(id);
	}

	@Override
	public void updateuser(User user) {
	userDao.updateuser(user);
	}

}
