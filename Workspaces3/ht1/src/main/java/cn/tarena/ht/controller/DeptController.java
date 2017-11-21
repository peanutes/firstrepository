package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.service.DeptService;

@Controller
@RequestMapping("/sysadmin/dept")
public class DeptController {

	@Autowired
	private DeptService deptService;
	@RequestMapping("/list")
	public String deptList(Model model){
		List<Dept> deptList = deptService.findAll();
		model.addAttribute("deptList",deptList);
		
		return "/sysadmin/dept/jDeptList";
	}
	@RequestMapping("/stop")
	public String startAction(@RequestParam(value="deptId",required=false)String[] deptIds){
		if (deptIds!=null) {
			
			deptService.changeState(0,deptIds);
		}
		
		return "redirect:/sysadmin/dept/list";
	}
	@RequestMapping("/start")
	public String stopAction(@RequestParam(value="deptId",required=false)String[] deptIds){
		if (deptIds!=null) {
			
			deptService.changeState(1,deptIds);
		}
		return "redirect:/sysadmin/dept/list";
	}
	//部门的删除
	@RequestMapping("/delete")
	public String delAction(@RequestParam(value="deptId",required=false)String[] deptIds){
		if(deptIds!=null){
			deptService.deleteDept(deptIds);
		}
		return "redirect:/sysadmin/dept/list";
	}
	//为部门新增添加上级部门信息
	@RequestMapping("/tocreate")
	public String createDept(Model model){
		List<Dept> lists = deptService.findAll();
		model.addAttribute("depts", lists);
		return "/sysadmin/dept/jDeptCreate";
	}
	//新增部门并保存
	@RequestMapping("/tosave")
	public String save(Dept dept){
		deptService.saveDept(dept);
		return "redirect:/sysadmin/dept/list";
		
	}
	//查找单个部门信息
	@RequestMapping("/toview")
	public String findOne(String deptId,Model model){
		Dept dept=deptService.findOne(deptId);
		model.addAttribute("dept", dept);
		return "/sysadmin/dept/jDeptView";
	}
	//为修改页面提供部门信息
	@RequestMapping("/toupdate")
	public String toupdate(String deptId,Model model){
		Dept dept = deptService.findOne(deptId);
		model.addAttribute("dept",dept);
		List<Dept> lists = deptService.findAll();
		model.addAttribute("deptList", lists);
		return "/sysadmin/dept/jDeptUpdate";
	}
	//修改保存并跳转页面
	@RequestMapping("/update")
	public String update(Dept dept){
		deptService.updateDept(dept);
		return "redirect:/sysadmin/dept/list";
	}
}
