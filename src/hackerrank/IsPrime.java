package hackerrank;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number for check : ");
        int number = scanner.nextInt();
        getPrimeOrNo(number);
    }

    static void getPrimeOrNo(int number){
        boolean isPrime = true;

        for (int i = 2;i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }

        }
        if (isPrime){
            System.out.println(number + " is prime" );
        }
        else {
            System.out.println(number + " is not prime");
        }
    }
}

