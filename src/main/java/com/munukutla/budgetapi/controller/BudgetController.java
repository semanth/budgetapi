package com.munukutla.budgetapi.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BudgetController {
    @GetMapping("/")
    public String getGreeting() {
        return "Budget API";
    }
    
}
