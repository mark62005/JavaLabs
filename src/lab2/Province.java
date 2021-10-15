package lab2;

import java.util.Locale;

public class Province {

    // constant variables
    private final String[] PROVINCES = {"ontario", "quebec", "british columbia", "alberta", "manitoba",
            "saskatchewan", "nova scotia", "new brunswick", "newfoundland and labrador",
            "prince edward island", "northwest territories", "nunavut", "yukon"};
    private final String[] CAPITALS = {"toronto", "quebec", "victoria", "edmonton", "winnipeg",
            "regina", "halifax", "fredericton", "st. john's",
            "charlottetown", "yellowknife", "iqaluit", "whitehorse"};
    private final String DEFAULT_PROVINCE = "British Columbia";
    private final String DEFAULT_CAPITAL = "Victoria";
    private final long DEFAULT_POPULATION = 4_648_055;

    private String name;        // e.g. “British Columbia”
    private String capital;     // e.g. “Victoria”
    private long population;    // e.g. 2264823

    // default constructor
    public Province() {
        this(null,null,0);
    }

    public Province(String name, String capital, long population) {
        setName(name);
        setCapital(capital);
        setPopulation(population);
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
    private boolean isValidPopulation(long population) {
        return population > 30_000 && population < 15_000_000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isValidProvince(name)) {
            this.name = name;
        } else {
            this.name = DEFAULT_PROVINCE;
        }
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        if (isValidCapitalCity(capital)) {
            this.capital = capital;
        } else {
            this.capital = DEFAULT_CAPITAL;
        }
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (isValidPopulation(population)) {
            this.population = population;
        } else {
            this.population = DEFAULT_POPULATION;
        }
    }

    public String getDetails() {
        return String.format("The capital of %s (population. %d) is %s.", name, population, capital);
    }

}
