package com.sample.springmvc.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
    @RequestMapping("/home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "SpringMVC with Gradle.aaaaaaa");
        return "home";
    }
}
