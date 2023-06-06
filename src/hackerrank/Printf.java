package hackerrank;

import java.util.Scanner;

public class Printf {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            int l = s1.length();

            System.out.print(s1);
            for (;l<15;l++){
                System.out.print(" ");
            }

            if (x<10){
                System.out.println("00" + x);
            } else if (x>=10 && x<=99) {
                System.out.println("0" + x);
            }else {
                System.out.println(x);
            }


        }
        System.out.println("================================");
    }
}
