package cn.tarena.ht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.service.DeptService;
import cn.tarena.ht.service.UserInfoService;
import cn.tarena.ht.service.UserService;

@Controller
@RequestMapping("/sysadmin/user")
public class UserController {

	@Autowired
	private UserService userService;
	/*@Autowired
	private DeptService deptService;
	@Autowired
	private UserInfoService userInfoService;*/
	//查找用户
	@RequestMapping("/list")
	public String find(Model model){
		List<User> lists = userService.findAll();
		model.addAttribute("userList",lists);
		return "/sysadmin/user/jUserList";
	}
	//批量停用或启用用户
	@RequestMapping("/stop")
	public String starAction(@RequestParam(value="userId",required=false)String[] userIds){
		
		return "redirect:/sysadmin/user/list";
	}
	//删除用户
	@RequestMapping("/delete")
	public String delete(String[] userIds){
		if(userIds!=null){
			userService.deleteUser(userIds);
		}
	
		return "redirect:/sysadmin/user/list";
	}

}
