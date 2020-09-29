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
