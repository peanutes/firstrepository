package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.User;

public interface UserMapper {

	public List<User> findAll();

	public void deleteUser(String[] userIds);

}
