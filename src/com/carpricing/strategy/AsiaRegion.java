package com.carpricing.strategy;

public class AsiaRegion implements PricingStrategy {

    public double calculatePrice(double basePrice) {
        return basePrice + 1000;
    }

    public double calculateTax(double basePrice) {
        return basePrice * 0.08;
    }
}
