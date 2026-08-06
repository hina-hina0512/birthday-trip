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

    @GetMapping("/trivia1")
    public String trivia1() {
        return "trivia1" ;
    }

    @GetMapping("/quiz2")
    public String quiz2() {
        return "quiz2";
    }

    @GetMapping("/trivia2")
    public String trivia2() {
        return "trivia2";
    }

    @GetMapping("/quiz3")
    public String quiz3() {
        return "quiz3" ;
    }

    @GetMapping("/trivia3")
    public String trivia3() {
        return "trivia3" ;
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


