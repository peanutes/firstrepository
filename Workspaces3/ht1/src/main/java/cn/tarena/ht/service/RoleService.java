package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Role;

public interface RoleService {

	List<Role> findAll();

	void delete(String[] roleIds);

	
}
