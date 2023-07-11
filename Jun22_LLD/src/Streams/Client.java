package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//STream provides a way to iterate over iterables
public class Client {
    //Way 1
    Integer[] arr = {10, 20, 30, 40, 50};
    Stream<Integer> stream = Stream.of(arr);

    //way2
    Stream<Integer> stream1 =
            Stream.of(10, 20, 30, 40, 50);

    //way3
    List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

    Stream<Integer> stream2 = list.stream();

    // Way 4
//    Stream.Builder<Integer> sb = Stream.builder();
//    sb.add(10);
//    sb.add(20);
//    sb.add(30);
//    sb.add(40);
//
//    Stream<Integer> stream3 = sb.build();



}
