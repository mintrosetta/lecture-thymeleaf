package net.javaguides.thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.thymeleaf.model.User;

@Controller
@RequestMapping("users")
public class UserController {

	// handler method to handle variable-expression request
	@GetMapping("variable-expression")
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

	// handler method to handler message expression
	// http://localhost:8080/users/message-expression
	@GetMapping("message-expression")
	public String messageExpression(Model model) {
		return "message-expression";
	}

	// handler method to handler link expression
	// http://localhost:8080/users/link-expression
	@GetMapping("link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 1);
		return "link-expression";
	}

	// handler method to handler fragment expression
	@GetMapping("fragment-expression")
	public String fragmentExpression(Model model) {
		return "fragment-expression";
	}
	
	@GetMapping("")
	public String getUsers(Model model) {
		User admin1 = new User("Admin 01", "admin@gmail.com", "ADMIN", "Female");
		User admin2 = new User("Admin 02", "admin@gmail.com", "ADMIN", "Female");
		User admin3 = new User("Admin 03", "admin@gmail.com", "ADMIN", "Female");
		
		List<User> users = new ArrayList<>();
		users.add(admin1);
		users.add(admin2);
		users.add(admin3);
		
		model.addAttribute("users", users);
		
		return "users";
	}
}
