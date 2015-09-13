package com.slokh.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slokh.form.LoginForm;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping(method = RequestMethod.GET)
    public String showLoginPage(Map<String, Object> model) {
        LoginForm loginForm	= new LoginForm();
        model.put("loginForm", loginForm);
		return "loginPage";
    }
	@RequestMapping(method = RequestMethod.POST)
    public String getUserInformation(Map<String, Object> model) {
        		return "dashboard";
    }
}
