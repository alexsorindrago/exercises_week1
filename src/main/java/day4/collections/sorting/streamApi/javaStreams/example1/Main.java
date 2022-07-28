package day4.collections.sorting.streamApi.javaStreams.example1;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(14, 18, 63, 70);

        stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println(" ----------------------------- ");

        stream = Stream.of(14, 18, 63, 70);
        stream.forEach((ele) -> System.out.println(ele));

        System.out.println(" ----------------------------- ");

        stream = Stream.of(14, 18, 63, 70);
        int minValue = stream.min(new Comparator<Integer>() {
            @Override
            public int compare(Integer object1, Integer object2) {
                return object1 - object2;
            }
        }).get();
        System.out.println(minValue);

        System.out.println(" ----------------------------- ");

        stream = Stream.of(14, 18, 63, 70);
        int result = stream.min((x, y) -> (x - y)).get();
        System.out.println(result);

        System.out.println(" ----------------------------- ");

    }
}
