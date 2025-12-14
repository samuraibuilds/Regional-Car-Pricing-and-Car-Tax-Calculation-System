package com.carpricing.util;

import com.carpricing.model.Region;

public class RegionMapper {

    public static Region getRegionByCountry(String country) {

        switch (country.toLowerCase()) {
            case "usa": return Region.R1;
            case "germany":
            case "france": return Region.R2;
            case "india":
            case "china": return Region.R3;
            case "kenya":
            case "nigeria": return Region.R4;
            default: throw new IllegalArgumentException("Country not supported");
        }
    }
}
