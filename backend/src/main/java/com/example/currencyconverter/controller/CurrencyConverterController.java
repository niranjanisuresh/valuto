package com.example.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.currencyconverter.service.CurrencyConversionService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3001")  // Allow React app calls
public class CurrencyConverterController {

    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/convert")
    public double convertCurrency(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam double amount) {
        return currencyConversionService.convert(from, to, amount);
    }
}
