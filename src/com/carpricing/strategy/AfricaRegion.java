package com.carpricing.strategy;

public class AfricaRegion implements PricingStrategy {

    public double calculatePrice(double basePrice) {
        return basePrice + 1500;
    }

    public double calculateTax(double basePrice) {
        return basePrice * 0.05;
    }
}
