package com.example.calculatevacation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController
@RequestMapping("/")
public class CalculateVacationController {

    @GetMapping("/calculate")
public double calculate(
        @RequestParam("salary") double salary,
        @RequestParam("vacation") int vacation
 ){
    return salary / 29.3 * vacation;
}
}
