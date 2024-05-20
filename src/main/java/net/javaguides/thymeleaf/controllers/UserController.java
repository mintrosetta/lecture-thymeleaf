package net.javaguides.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.thymeleaf.model.User;

@Controller
@RequestMapping("users")
public class UserController {

	// handler method to handle variable-expression request
	@GetMapping("variable")
	public String variableExpression(Model model) {
		User user = new User("mint.rosetta", "mint.rosetta2001@gmail.com", "ADMIN", "Male");

		model.addAttribute("user", user);

		return "variable-expression";
	}

	// handler method to handler selection expression
	// http://localhost:8080/users/selection-expression
	@GetMapping("selection-expression")
	public String selectionExpression(Model model) {
		User user = new User("mint.rosetta", "mint.rosetta2001@gmail.com", "ADMIN", "Male");

		model.addAttribute("user", user);

		return "selection-expression";
	}
}
