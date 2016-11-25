package org.myself.demo.springboot.controller;

import org.myself.demo.springboot.dto.RespInfo;
import org.myself.demo.springboot.entry.Account;
import org.myself.demo.springboot.exception.JsonException;
import org.myself.demo.springboot.exception.ViewException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import springfox.documentation.annotations.ApiIgnore;

@Controller
public class IndexController {
	
	@Value("${index_controller_rdm}")
	private int rdm = 0;
	
	@ApiIgnore
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model) {
		if(rdm > 15){
			throw new ViewException(999, "页面错误rdm="+rdm);
		}
		
		model.addAttribute("rdm", rdm);
		model.addAttribute("host", "http://u.jointwisdom.cn/university");
		
		return "index";
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	@ResponseBody
	public RespInfo<String> hello() {
		return new RespInfo<String>("Hello World!");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	@ResponseBody
	public RespInfo<Account> login(@RequestBody Account param) {
		RespInfo<Account> resp = new RespInfo<Account>();
		
		if(param != null && "admin".equals(param.getUsername()) 
				&& "admin".equals(param.getPassword())){
			resp.setData(param);
		} else {
			throw new JsonException(999, "帐号或密码错误 ");
		}
		
		return resp;
	}
	
}