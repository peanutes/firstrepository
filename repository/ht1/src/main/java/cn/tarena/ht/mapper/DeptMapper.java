package cn.tarena.ht.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tarena.ht.pojo.Dept;

public interface DeptMapper {

	//查询所有部门
	public List<Dept> findAll();
	//启用和停用部门
	public void changeState(@Param("state")int i,@Param("deptIds")String[] deptIds);
	//删除部门
	public void deleteDept(String[] deptIds);
	//新增部门
	public void saveDept(Dept dept);
	//修改部门
	public void updateDept(Dept dept);
	//查看一个部门信息
	public Dept findOne(String deptId);
}
