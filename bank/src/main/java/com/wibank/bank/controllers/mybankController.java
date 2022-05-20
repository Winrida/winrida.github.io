package com.wibank.bank.controllers;

import com.wibank.bank.models.Amount;
import com.wibank.bank.repo.AmountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class mybankController {

    @Autowired
    private AmountRepository amountRepository;

    @GetMapping("/mybank")
    public String MybankMain(Model model) {
        Iterable<Amount> amounts = amountRepository.findAll();
        model.addAttribute("amounts", amounts);
        return "mybank";
    }
}
