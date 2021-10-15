package lab2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class Province {

    private final String[] PROVINCES = {"ontario", "quebec", "british columbia", "alberta", "manitoba",
            "saskatchewan", "nova scotia", "new brunswick", "newfoundland and labrador",
            "prince edward island", "northwest territories", "nunavut", "yukon"};

    private String name;        // e.g. “British Columbia”
    private String capital;     // e.g. “Victoria”
    private long population;    // e.g. 2264823

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
        return (Arrays.asList(PROVINCES).contains(province.toLowerCase(Locale.ROOT)));
    }

}
