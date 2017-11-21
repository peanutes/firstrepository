package cn.tarena.ht.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.service.RoleService;

@Controller
@RequestMapping("/sysadmin/role")
public class RoleController {
	@Resource
	private RoleService roleService;

	@RequestMapping("/list")
	public String list(Model model){
		List<Role> roleLists = roleService.findAll();
		model.addAttribute("roleLists",roleLists);
		return "/sysadmin/role/jRoleList";
	}
	@RequestMapping("/delete")
	public String deletes(@RequestParam(value="roletId")String[] roleIds){
		roleService.delete(roleIds);
		return "redirect:/sysadmin/role/list";
	}
}
