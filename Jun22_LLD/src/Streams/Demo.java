package Streams;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list
                = Arrays.asList(10,11, 20,21, 30,31, 40,41);

        System.out.println(list.stream().filter((x)->x%2==0).toList());

        List<Car> cars = Arrays.asList(
                new Car(100, 500, "ABC"),
                new Car(2100, 7870, "DeF"),
                new Car(1550, 60, "ghi"),
                new Car(70, 5000, "jkl"),
                new Car(7800, 8000, "mno")
        );
        //cars.stream().sorted((a,b) -> a.speed- b.speed).toList();

        System.out.println(cars.stream().map((a)-> a.price).toList());
    }
}
