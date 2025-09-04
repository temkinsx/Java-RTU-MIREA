package practice5.ArraysAndCircle;

import java.util.List;
import java.util.ArrayList;

public class TestFindMaxCircle {
    static int findMaxCircle(ArrayList<Circle> circles) {
        int maxIndex = 0;
        for (int i = 0; i < circles.size() - 1; i++) {
            if (circles.get(i).compareTo(circles.get(i + 1)) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }


    public static void main(String[] args) {
        ArrayList<Circle> arr = new ArrayList<>(List.of(
                new Circle(1),
                new Circle(14),
                new Circle(678),
                new Circle(691),
                new Circle(78),
                new Circle(342)
        ));

        System.out.println("Индекс круга с наибольшим радиусом: " + findMaxCircle(arr));
    }

}
