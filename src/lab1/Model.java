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

}
