package FuncInterfaceDemo;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class FuncDemo {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biConsumer =
                new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println("Bi Consumer Impl: " + s + " " + integer);
            }
        };
        biConsumer.accept(10, "hello");

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*10;
            }
        };

        System.out.println("Function: " + function.apply(10));


        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer*integer2;
            }
        };

        System.out.println("Binary: " + binaryOperator.apply(9, 9));







    }
}
