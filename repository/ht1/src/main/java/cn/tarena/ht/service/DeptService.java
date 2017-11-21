package cn.tarena.ht.service;

import java.util.List;

import cn.tarena.ht.pojo.Dept;

public interface DeptService {

	public List<Dept> findAll();

	public void changeState(int i, String[] deptId);

	public void deleteDept(String[] deptIds);

	public void saveDept(Dept dept);

	public void updateDept(Dept dept);

	public Dept findOne(String deptId);

	

	
}
