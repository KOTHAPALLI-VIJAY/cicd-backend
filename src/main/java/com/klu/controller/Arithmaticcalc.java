package com.klu.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")   // base path
@CrossOrigin
public class Arithmaticcalc {

    @GetMapping("sub/{A}/{B}")
    public String sub(@PathVariable("A") int a, @PathVariable("B") int b) {
        return "Subtraction = " + (a - b);
    }

    @GetMapping("add/{A}/{B}")
    public String add(@PathVariable("A") int a, @PathVariable("B") int b) {
        return "Addition = " + (a + b);
    }

    @GetMapping("mul/{A}/{B}")
    public String mul(@PathVariable("A") int a, @PathVariable("B") int b) {
        return "Multiplication = " + (a * b);
    }

    @GetMapping("div/{A}/{B}")
    public String div(@PathVariable("A") int a, @PathVariable("B") int b) {
        if (b == 0) return "Division by zero not allowed!";
        return "Division = " + (a / b);
    }
}
