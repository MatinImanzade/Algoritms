package eolymp;

import java.util.Scanner;

public class RumNumbers {
    public static void main(String[] args) {
        Rums rums = Rums.D;
        int number = findTotal(rums);
        System.out.println(number);

        int total =  convertToIntAndFindTotal("V","L");
        System.out.println(total);
    }

    public static int findTotal(Rums rum) {
        int numberOfRum = 0;
        switch (rum) {
            case C:
                numberOfRum = 100;
                break;
            case D:
                numberOfRum = 500;
                break;
            case X:
                numberOfRum = 10;
                break;
            case I:
                numberOfRum = 1;
                break;
            case V:
                numberOfRum = 5;
                break;
            case L:
                numberOfRum = 50;
                break;
            case M:
                numberOfRum = 1000;
                break;
            default:
                System.out.println("Yanlis Daxil Edilme");
        }
        return numberOfRum;
    }

    public static int convertToIntAndFindTotal(String rumNumber1, String rumNumber2) {
        int numberOfRum1 = 0;
        int numberOfRum2 = 0;
        switch (rumNumber1) {
            case "I":
                numberOfRum1 = 1;
                break;
            case "V":
                numberOfRum1 = 5;
                break;
            case "X":
                numberOfRum1 = 10;
                break;
            case "L":
                numberOfRum1 = 50;
                break;
            case "C":
                numberOfRum1 = 100;
                break;
            case "D":
                numberOfRum1 = 500;
                break;
            case "M":
                numberOfRum1 = 1000;
                break;
        }

        switch (rumNumber2) {
            case "I":
                numberOfRum2 = 1;
                break;
            case "V":
                numberOfRum2 = 5;
                break;
            case "X":
                numberOfRum2 = 10;
                break;
            case "L":
                numberOfRum2 = 50;
                break;
            case "C":
                numberOfRum2 = 100;
                break;
            case "D":
                numberOfRum2 = 500;
                break;
            case "M":
                numberOfRum2 = 1000;
                break;
        }

        return numberOfRum1 + numberOfRum2;

    }


}

enum Rums {
    M(1000),
    D(500),
    C(100),
    L(50),
    X(10),
    V(5),
    I(1);

    private int rumToNaturalNumber;

    Rums(int number) {
        this.rumToNaturalNumber = number;
    }

    public int getRumToNaturalNumber() {
        return rumToNaturalNumber;
    }
}
