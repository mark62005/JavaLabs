package week2.arraylists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            nums.add(num);
        }

        int max = nums.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .orElseThrow();

        int maxIndex = nums.indexOf(max);

        System.out.printf("""
                ArrayList: %s
                
                The largest value is %d, which is in slot %d
                """,
                nums,
                max,
                maxIndex
        );

    }
}
