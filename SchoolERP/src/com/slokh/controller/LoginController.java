package com.slokh.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String doLogin(@Valid @ModelAttribute("loginForm") LoginForm loginForm,
			BindingResult result, Map<String, Object> model) {
		if (result.hasErrors()) {
			return "loginPage";
		}
        		return "dashboard";
    }
}
