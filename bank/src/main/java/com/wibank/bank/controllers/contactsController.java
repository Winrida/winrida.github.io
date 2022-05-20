package com.wibank.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class contactsController {
    @GetMapping("/contacts")
    public String ContactsMain(Model model) {
        return "contacts";
    }
}
