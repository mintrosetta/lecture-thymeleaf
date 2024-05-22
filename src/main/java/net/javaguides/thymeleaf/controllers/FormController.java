package net.javaguides.thymeleaf.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.thymeleaf.dto.UserRegisterFormDTO;

@Controller
@RequestMapping("form")
public class FormController {
	
	public FormController() {
		// TODO Auto-generated constructor stub
	}
	
	// handler methid to handler user registration page request
	@GetMapping("/register")
	public String userRegisterPage(Model model) {
		UserRegisterFormDTO user = new UserRegisterFormDTO();
		model.addAttribute("user", user);
		
		List<String> professions = Arrays.asList("Developer", "Engineer", "Tester", "Architech");
		model.addAttribute("professions", professions);
		
		return "register";
	}
}
