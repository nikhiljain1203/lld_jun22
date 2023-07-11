package LambdaDemo;

import java.util.PriorityQueue;
import java.util.function.BiPredicate;
import java.util.function.Function;

//LAMBDA - another way providing input to the functional interfaces
public class Client {
    public static void main(String[] args) {

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*10;
            }
        };

        //Template of lambda - (Input Params) -> {Logic}

        function.apply(10);

        Function<Integer, Integer> function1
                = (x) ->{return x*10;};
        System.out.println(function1.apply(11));

        BiPredicate<Integer, Integer> biPredicate =
                (x, y) -> x==y;
        System.out.println(biPredicate.test(10, 10));

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a,b)-> b-a);

        pq.add(5);
        pq.add(10);
        pq.add(1);

        System.out.println(pq.peek());

        System.out.println(Thread.currentThread().getName());
        Runnable r = () ->{
            System.out.println(Thread.currentThread().getName());
        };

        Thread t1 = new Thread(() ->{
            System.out.println(Thread.currentThread().getName());
        });

        t1.start();

    }
}
