package coders.iyun22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,45,5);

       numbers.stream()
                .filter(n -> n%2 == 0)
                .map(n-> n*2)
               .forEach(System.out::println);

       String s = "elma";
       s = s + "2";
       s = s + "3";



    }
}
