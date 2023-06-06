package hackerrank;

import java.util.List;
import java.util.Scanner;

public class MinMaxOfSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while(scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        scan.close();

        System.out.println((sum - max) + " " + (sum - min));
    }

    public static void minMaxChecked(List<Integer> arr){
      int max = 0;
      int min = 0;
      int sum = 0;

      for (int i = 0;i<arr.size();i++){

      }



    }



}
