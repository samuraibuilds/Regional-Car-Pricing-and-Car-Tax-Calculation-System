package com.carpricing.strategy;

public class EuropeRegion implements PricingStrategy {

    public double calculatePrice(double basePrice) {
        return basePrice + 3000;
    }

    public double calculateTax(double basePrice) {
        return basePrice * 0.15;
    }
}
