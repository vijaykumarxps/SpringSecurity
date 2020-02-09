package com.example.demo.web;

import com.example.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccessDeniedController {

    @GetMapping("/accessDenied")
    public String accessDenied(Model model) {

        return "accessDenied";
    }
}
