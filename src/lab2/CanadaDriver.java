package lab2;

public class CanadaDriver {
    public static void main(String[] args) {

        Canada canada = new Canada();

        canada.displayAllProvinces();
        System.out.println(canada.getNumOfProvincesBetween(1, 15));
    }
}
