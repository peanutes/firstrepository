package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.User;

public interface UserService {

	public List<User> findAll();

	public void deleteUser(String[] userIds);

}
