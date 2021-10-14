package lab1;

public class ModelDriver {
    public static void main(String[] args) {

        Model model1 = new Model();
        Model model2 = new Model("John", "Doe", 80, 100, true, true);
        Model model3 = new Model("John", "Doe", 50, 100.30);

        model1.displayModelDetails();
        model2.displayModelDetails();
        model3.printDetails();

    }
}
