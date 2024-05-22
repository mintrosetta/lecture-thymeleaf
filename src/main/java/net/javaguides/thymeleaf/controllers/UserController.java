package net.javaguides.thymeleaf.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.javaguides.thymeleaf.model.User;

@Controller
@RequestMapping("users")
public class UserController {
	
	private List<User> users = new ArrayList<>();
	
	public UserController() {
		this.users.add(new User("mint.rosetta", "mint.rosetta@gmail.com", "ADMIN", "Male"));
		this.users.add(new User("mint.colorfuls", "mint.colorfuls@gmail.com", "MEMBER", "Male"));
		this.users.add(new User("bike.chanokchon", "bike.chanokchon@gmail.com", "STAFF", "Male"));
	}

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
		model.addAttribute("users", this.users);
		
		return "users";
	}
	
	@GetMapping("if-unless")
	public String ifUnless(Model model) {
		model.addAttribute("users", this.users);
		
		return "if-unless";
	}
	
	@GetMapping("switch-case")
	public String switchCase(Model model) {
		model.addAttribute("user", this.users.get(0));
		
		return "switch-case";
	}
}
