package com.example.calculatevacation.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CalculateVacationController {

public double calculate(
        @RequestParam("salary") double salary;
        @RequestParam("vacation") int vacation;
 ){
    return salary / 29.3 * vacation;
}
}
