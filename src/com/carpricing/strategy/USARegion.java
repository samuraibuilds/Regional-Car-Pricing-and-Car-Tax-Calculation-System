package com.carpricing.strategy;

public class USARegion implements PricingStrategy {

    public double calculatePrice(double basePrice) {
        return basePrice + 2000;
    }

    public double calculateTax(double basePrice) {
        return basePrice * 0.10;
    }
}
