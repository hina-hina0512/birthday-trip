package com.example.birthdaytrip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";

    }

    @GetMapping("/quiz")
    public String quiz() {
        return "quiz";
    }

    @GetMapping("/answer")
    public String answer(@RequestParam String choice, Model model) {
        boolean isCorrect = choice.equals("gifu");

        model.addAttribute("isCorrect", isCorrect);
        return "answer";
    }
    @GetMapping("/plan")
    public String plan() {
        return "plan";
    }
}


