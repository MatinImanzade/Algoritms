package coders.may9;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class SayiTexminOyunu {
    public static void main(String[] args) {
        getTexmin();
    }

    static boolean getTexmin() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int axtarilanReqem = random.nextInt(0, 100);
        System.out.print("Kompyuterin generasiya elediyi random ededi tampaq ucun ilikin olaraq bir eded deyin : ");
        boolean texmin = false;
        while (!texmin) {
            int eded = scanner.nextInt();
            if (eded == axtarilanReqem) {
                System.out.println("Tebrikler ededi tapdiniz : " + eded);
                texmin = true;
            } else if (eded < axtarilanReqem) {
                System.out.println("Yazdiginizdan yuxari eded texmin edin");
            } else {
                System.out.println("Yazdiginizdan asagi eded texmin edin");
            }
        }

        return true;
    }
}
