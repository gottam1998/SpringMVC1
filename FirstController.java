package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.model.Employee;
import com.pack.model.Login;
import com.pack.model.Registration;

@Controller
public class FirstController {
	@RequestMapping(value="/first")
	public String first() {
		
		
		return "static-page";
		//return "register";
		
	}
	
	@RequestMapping(value="/reg")
	public String regs(ModelMap m) {
		
		Employee e=new Employee();
		m.addAttribute("emp", e);
		
		return "register";
		
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveData(@Validated @ModelAttribute("emp") Employee e1, BindingResult result, ModelMap m1) {
		
		String finalRsesult;
		if(result.hasErrors()) {
			finalRsesult="register";
		}
		else {
		m1.addAttribute("empl", e1);
		finalRsesult= "success";
		}
		return finalRsesult;
		
	}
	@RequestMapping(value="/dynamic")
	public String dynamic(@RequestParam("name") String n1, @RequestParam("age") Integer a1, ModelMap m1) {
		
		m1.addAttribute("myName", n1);
		m1.addAttribute("myAge", a1);
		return "param";
		
	}
	@RequestMapping(value="/fetch/{name}/{id}")
	public String fetch(@PathVariable("name") String name1, @PathVariable("id") Integer id1, ModelMap m2) {
		m2.addAttribute("myName1", name1);
		m2.addAttribute("empId", id1);
		return "pathParam";
		
	}
	@RequestMapping(value="/login")
	public String login(ModelMap m) {
        Login l= new Login();
        m.addAttribute("login", l);
        return "login";
    }
	
	@RequestMapping(value="/check")
	public String loginCheck(@Validated @ModelAttribute("login") Login l1, BindingResult result) {
		String res1;
		if(result.hasErrors()) {
			res1="login";
		}
		else {
			res1="success1";
		}
		
		return res1;
	}
	
	
	@RequestMapping(value="/reg1")
	public String registration(ModelMap m) {
        Registration r= new Registration();
        m.addAttribute("registration", r);
        return "registration";
    }
	
	@RequestMapping(value="/registration")
	public String registartionData(@Validated @ModelAttribute("registration") Registration r1, BindingResult result, ModelMap m1) {
		
		String finalResult="";
		if(result.hasErrors()) {
			finalResult="registration";
		}
		else {
		m1.addAttribute("registration", r1);
		finalResult= "registrationSuccess";
		}
		return finalResult;
		
	}
}
