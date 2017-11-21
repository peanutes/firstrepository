package cn.tarena.ht.mapper;

import java.util.List;

import cn.tarena.ht.pojo.Role;

public interface RoleMapper {

	public List<Role> findAll();

	public void delete(String[] roleIds);

	
}
