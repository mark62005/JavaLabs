import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cities {

    private final List<String> cities = new ArrayList<>();

    public Cities() throws FileNotFoundException {

        File file = new File("src/cities.txt");
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            cities.add(in.nextLine());
        }

    }

    // get the hidden city
    public String getCity() {
        Random random = new Random();
        return cities.get(random.nextInt(cities.size()));
    }

}
