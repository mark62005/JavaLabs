package lab1;

public class Model {

    // data fields
    private String firstName;
    private String lastName;
    private int height; // inches
    private int weight; // pounds
    private boolean canTravel;
    private boolean smokes;

    /**
     * default constructor: does nothing
     */
    public Model() {}

    /**
     * designated constructor
     */
    public Model(String firstName, String lastName, int height, int weight, boolean canTravel, boolean smokes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.canTravel = canTravel;
        this.smokes = smokes;
    }

    /**
     * third constructor: takes parameters for only the first name, last name, height in
     * inches, and weight in pounds, and set canTravel and smokes to false
     *
     * @param firstName first name
     * @param lastName last name
     * @param height height in inches
     * @param weight weight in pounds
     */
    public Model(String firstName, String lastName, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.canTravel = false;
        this.smokes = false;
    }

    /**
     * Check if First name and Last name is between 3 and 20 characters,
     * if it fails to meet the criteria, throws an IllegalArgumentException
     *
     * @param name first name or last name
     */
    public static void checkName(String name) {
        if (name.length() < 3 || name.length() > 20) {
            throw new IllegalArgumentException("Invalid input. First name and Last name must be 3 to 20 characters.");
        }
    }

    /**
     * Check if height is between 24 and 84 inches,
     * if it fails to meet the criteria, throws an IllegalArgumentException
     *
     * @param height height in inches
     */
    public static void checkHeight(int height) {
        if (height < 24 || height > 84) {
            throw new IllegalArgumentException("Invalid input. Height must be 24 to 84 inches.");
        }
    }

    /**
     * Check if weight is between 80 and 280 pounds,
     * if it fails to meet the criteria, throws an IllegalArgumentException
     *
     * @param weight weight in pounds
     */
    public static void checkWeight(int weight) {
        if (weight < 80 || weight > 280) {
            throw new IllegalArgumentException("Invalid input. Weight must be 80 to 280 pounds.");
        }
    }

}
