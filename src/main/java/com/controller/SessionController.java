package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

@Controller
public class SessionController {

	@GetMapping("/signup")
	public String signup() {
		return "Signup";// jsp name
	}

	@PostMapping("/saveuser")
	public String saveUser(UserBean userBean) {
		// signup data input -> logic

		// read
		System.out.println(userBean.getFirstName());
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());

		// validate

		// db save

		return "Login";// jsp
	}

	@GetMapping("/login")
	public String login() {
		return "Login";
	}

	// if you want to create new bean for login you can create and
	// read data using that new bean but we can reuse existing bean
	// if our variables are already present in existing bean
	@PostMapping("/authenticate")
	public String authentiacte(UserBean userBean) {
		System.out.println(userBean.getEmail());
		System.out.println(userBean.getPassword());
		return "Home";
	}

	@GetMapping("logout")
	public String logout() {

		return "Login";
	}
}

//spring.xml 
//boot -> zero configuration --> annotation 
