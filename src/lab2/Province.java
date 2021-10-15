package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;

public class Province {

    private final String[] PROVINCES = {"ontario", "quebec", "british columbia", "alberta", "manitoba",
            "saskatchewan", "nova scotia", "new brunswick", "newfoundland and labrador",
            "prince edward island", "northwest territories", "nunavut", "yukon"};
    private final String[] CAPITALS = {"toronto", "quebec", "victoria", "edmonton", "winnipeg",
            "regina", "halifax", "fredericton", "st. john's",
            "charlottetown", "yellowknife", "iqaluit", "whitehorse"};

    private String name;        // e.g. “British Columbia”
    private String capital;     // e.g. “Victoria”
    private long population;    // e.g. 2264823

    // default constructor
    public Province() {
        this.name = "British Columbia";
        this.capital = "Victoria";
        this.population = 4_648_055;
    }

    public Province(String name, String capital, long population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    /**
     * Check if the province name input belongs to one of the province in Canada.
     *
     * @param province province name
     * @return true if it is one of the Canadian provinces
     */
    private boolean isValidProvince(String province) {

        for (String p : PROVINCES) {
            if (province.toLowerCase(Locale.ROOT).equals(p)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Check if the capital input is one of the capital city of Canadian provinces
     *
     * @param capital name of capital city
     * @return true if it is one of the capital city of Canadian provinces
     */
    private boolean isValidCapitalCity(String capital) {

        for (String c : CAPITALS) {
            if (capital.toLowerCase(Locale.ROOT).equals(c)) {
                return true;
            }
        }
        return false;

    }

    /**
     * Return true if the population is between 30,000 and 15,000,000, else return false
     *
     * @param population population of that capital city
     * @return if the population is between 30,000 and 15,000,000
     */
    private boolean isValidPopulation(int population) {
        return population > 30_000 && population < 15_000_000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
