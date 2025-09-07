package com.example.currencyconverter.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class CurrencyConversionService {

    // Sample static exchange rates relative to USD for demo purpose
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("EUR", 0.91);
        exchangeRates.put("INR", 82.0);
        exchangeRates.put("JPY", 145.0);
        exchangeRates.put("GBP", 0.78);
        // Add more currencies as needed
    }

    public double convert(String fromCurrency, String toCurrency, double amount) {
        Double fromRate = exchangeRates.get(fromCurrency.toUpperCase());
        Double toRate = exchangeRates.get(toCurrency.toUpperCase());

        if (fromRate == null || toRate == null) {
            throw new IllegalArgumentException("Unsupported currency code");
        }

        // Convert amount to USD first, then to target currency
        double amountInUsd = amount / fromRate;
        return amountInUsd * toRate;
    }
}
