package cn.tarena.ht.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tarena.ht.mapper.DeptMapper;
import cn.tarena.ht.pojo.Dept;
@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	@Override
	public List<Dept> findAll() {
		
		return deptMapper.findAll();
	}
	@Override
	public void changeState(int i, String[] deptId) {
		deptMapper.changeState(i,deptId);
		
	}
	@Override
	public void deleteDept(String[] deptIds) {
		deptMapper.deleteDept(deptIds);
		
	}
	@Override
	public void saveDept(Dept dept) {
		deptMapper.saveDept(dept);
		
	}
	@Override
	public void updateDept(Dept dept) {
		deptMapper.updateDept(dept);
		
	}
	@Override
	public Dept findOne(String deptId) {
		
		return deptMapper.findOne(deptId);
	}
	

	
}
