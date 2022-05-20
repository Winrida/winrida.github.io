package com.wibank.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class newsController {
    @GetMapping("/news")
    public String NewsMain(Model model) {
        return "news";
    }
}
