package test;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
public interface Funcİnter {
    int total(int a);
}

class Main{
    public static void main(String[] args) {
        Funcİnter funcİnter = a -> 2*a-1;
        System.out.println( funcİnter.total(5));

        List<String> words = Arrays.asList("Vusal","Matin","Memmed");



        words.forEach(word-> System.out.println(word));
    }
}
