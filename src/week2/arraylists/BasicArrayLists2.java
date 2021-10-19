package week2.arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            nums.add(num);
        }

        System.out.println("ArrayList: " + nums);

    }
}
