package test;

import java.util.stream.IntStream;

public class IntStreamExmpl {
    public static void main(String[] args) {
        IntStream.iterate(5, n -> n * 2).filter(n -> n < 100).forEach(n -> System.out.println(n));

        //IntStream.range(1, 10).forEach(a -> System.out.println(a));


    }
}
