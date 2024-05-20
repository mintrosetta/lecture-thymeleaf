package net.javaguides.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class HelloWorldController {

    // handler method to handle / request
    // http://localhost:8080/helloworld
    @GetMapping
    public String getHelloWorld(Model model) {
        model.addAttribute("message", "Hello World !");
        return "hello-world";
    }

}
