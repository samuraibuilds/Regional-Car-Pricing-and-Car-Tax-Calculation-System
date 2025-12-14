package com.carpricing;

import java.util.Scanner;

import com.carpricing.factory.PricingFactory;
import com.carpricing.model.Region;
import com.carpricing.strategy.PricingStrategy;
import com.carpricing.util.RegionMapper;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter country: ");
        String country = sc.nextLine();

        System.out.print("Enter base price of car: ");
        double basePrice = sc.nextDouble();

        Region region = RegionMapper.getRegionByCountry(country);
        PricingStrategy strategy = PricingFactory.getStrategy(region);

        double finalPrice = strategy.calculatePrice(basePrice);
        double tax = strategy.calculateTax(basePrice);

        System.out.println("\n--- Car Pricing Details ---");
        System.out.println("Country: " + country);
        System.out.println("Region: " + region);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Tax: " + tax);

        sc.close();
    }
}
