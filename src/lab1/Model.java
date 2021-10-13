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

}
