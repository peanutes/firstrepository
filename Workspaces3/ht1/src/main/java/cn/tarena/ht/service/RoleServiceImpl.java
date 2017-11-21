package cn.tarena.ht.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.RoleMapper;
import cn.tarena.ht.pojo.Role;
@Service
public class RoleServiceImpl implements RoleService{

	@Resource
	private RoleMapper roleMapper;
	@Override
	public List<Role> findAll() {
		return roleMapper.findAll();
	}
	@Override
	public void delete(String[] roleIds) {
		roleMapper.delete(roleIds);
		
	}
	

}
