package com.carpricing.strategy;

public interface PricingStrategy {
    double calculatePrice(double basePrice);
    double calculateTax(double basePrice);
}
