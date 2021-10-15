package lab2;

import java.util.Arrays;

public class Canada {

    private Province[] provinces;

    public Canada() {
        this.provinces = new Province[] {
                new Province("Ontario", "Toronto", 13_448_494),
                new Province("Quebec", "Quebec", 8_164_361),
                new Province("Newfoundland and Labrador","St. John's",  519_716),
                new Province("Nova Scotia", "Halifax", 923_598),
                new Province("New Brunswick", "Fredericton", 747_101),
                new Province("Prince Edward Island","Charlottetown", 142_907),
                new Province("Manitoba", "Winnipeg", 1_278_365),
                new Province("Saskatchewan", "Regina", 1_098_352),
                new Province("Alberta", "Edmonton", 4_067_175),
                new Province("British Columbia", "Victoria", 4_648_055),
                new Province("Northwest Territories", "Yellowknife", 41_786),
                new Province("Yukon", "Whitehorse", 35_874),
                new Province("Nunavut", "Iqaluit", 35_944)
        };
    }

    public void displayAllProvinces() {
        for (Province province : provinces) {
            System.out.println(province.getDetails());
        }
    }

    public int getNumOfProvincesBetween(int min, int max) {

//        // stream API
//        return (int) Arrays.stream(provinces)
//                .filter(p -> p.getPopulation() / 1_000_000 >= min && p.getPopulation() / 1_000_000 <= max)
//                .count();

        // for-each loop
        int count = 0;
        for (Province province : provinces) {
            if (province.getPopulation() / 1_000_000 >= min && province.getPopulation() / 1_000_000 <= max) {
                count++;
            }
        }
        return count;

    }

}
