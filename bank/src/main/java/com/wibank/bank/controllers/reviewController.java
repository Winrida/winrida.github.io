package com.wibank.bank.controllers;

import com.wibank.bank.models.Reviews;
import com.wibank.bank.repo.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class reviewController {

    @Autowired
    private ReviewsRepository reviewsRepository;

    @GetMapping("/review")
    public String ReviewMain(Model model) {
        Iterable<Reviews> reviews = reviewsRepository.findAll();
        model.addAttribute("reviews", reviews);
        return "review";
    }

    @GetMapping("/review/add")
    public String ReviewAdd(Model model) {
        return "review-add";
    }

    @PostMapping("/review/add")
    public String reviewPostAdd(@RequestParam String name, @RequestParam String full_text, Model model) {
        Reviews reviews = new Reviews(name, full_text);
        reviewsRepository.save(reviews);
        return "redirect:/review";
    }
}
