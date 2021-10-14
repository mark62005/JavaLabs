package lab1;

public class Model {

    // constant variables
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;

    // data fields
    private String firstName;
    private String lastName;
    private int height; // inches
    private double weight; // pounds
    private boolean canTravel = false;
    private boolean smokes = false;

    /**
     * default constructor: does nothing
     */
    public Model() {}

    /**
     * designated constructor
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(canTravel);
        setSmokes(smokes);
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
    public Model(String firstName, String lastName, int height, double weight) {
        setFirstName(firstName);
        setLastName(lastName);
        setHeight(height);
        setWeight(weight);
        setCanTravel(false);
        setSmokes(false);
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
    public static void checkWeight(double weight) {
        if (weight < 80 || weight > 280) {
            throw new IllegalArgumentException("Invalid input. Weight must be 80 to 280 pounds.");
        }
    }

    /**
     * Return the value of first name
     *
     * @return the value of first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the value of first name
     *
     * @param firstName must be from 3 to 20 characters long
     */
    public void setFirstName(String firstName) {
        checkName(firstName);
        this.firstName = firstName;
    }

    /**
     * Return the value of last name
     *
     * @return the value of last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the value of last name
     *
     * @param lastName must be from 3 to 20 characters long
     */
    public void setLastName(String lastName) {
        checkName(lastName);
        this.lastName = lastName;
    }

    /**
     * Return the value of height in inches
     *
     * @return the value of height in inches
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the value of height in inches
     *
     * @param inches must be from 24 to 84 inches
     */
    public void setHeight(int inches) {
        checkHeight(inches);
        this.height = inches;
    }

    /**
     * Set the value of height in inches
     *
     * @param feet 1 feet equals to 12 inches
     * @param inches inches
     */
    public void setHeight(int feet, int inches) {
        inches += feet * INCHES_PER_FOOT;
        checkHeight(inches);
        this.height = inches;
    }

    /**
     * Return the value of weight in pounds
     *
     * @return the value of weight in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the value of weight in pounds
     *
     * @param pound must be from 80 to 280 pounds
     */
    public void setWeight(double pound) {
        checkWeight(pound);
        this.weight = pound;
    }

    /**
     * Set the value of weight in pounds
     *
     * @param kilograms weight in kg
     */
    public void setWeight(long kilograms) {
        double weightInPounds = kilograms * POUNDS_PER_KG;
        checkWeight(weightInPounds);
        this.weight = weightInPounds;
    }

    /**
     * Return the value of canTravel
     *
     * @return return the value of canTravel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Set the value of canTravel
     *
     * @param canTravel true or false
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Return the value of smokes
     *
     * @return return the value of smokes
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Set the value of smokes
     *
     * @param smokes true or false
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Convert the height into feet and inches, and return it as a string.
     * e.g. "5 feet", or "5 feet 1 inch", or "5 feet 6 inches"
     *
     * @return a string which the height is converted into feet and inches
     */
    public String getHeightInFeetAndInches() {

        int feet = height / INCHES_PER_FOOT;
        int inches = height % INCHES_PER_FOOT;

        return (height % INCHES_PER_FOOT == 0) ? String.format("%d feet", feet) :
                (height % INCHES_PER_FOOT == 1) ? String.format("%d feet %d inch", feet, inches) :
                        String.format("%d feet %d inches", feet, inches);

    }

    /**
     * Convert the unit of weight to kg, and return it as a long.
     *
     * @return a long of weight in kg
     */
    public long getWeightKg() {
        return Math.round(weight / POUNDS_PER_KG);
    }

}
