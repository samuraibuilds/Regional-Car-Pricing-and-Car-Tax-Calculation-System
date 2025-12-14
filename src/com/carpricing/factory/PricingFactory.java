package com.carpricing.factory;

import com.carpricing.model.Region;
import com.carpricing.strategy.*;

public class PricingFactory {

    public static PricingStrategy getStrategy(Region region) {

        switch (region) {
            case R1: return new USARegion();
            case R2: return new EuropeRegion();
            case R3: return new AsiaRegion();
            case R4: return new AfricaRegion();
            default: throw new IllegalArgumentException("Invalid Region");
        }
    }
}
