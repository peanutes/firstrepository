package cn.tarena.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.UserMapper;
import cn.tarena.ht.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findAll() {
		
		return userMapper.findAll();
	}
	@Override
	public void deleteUser(String[] userIds) {
		userMapper.deleteUser(userIds);
		
	}
	

}
