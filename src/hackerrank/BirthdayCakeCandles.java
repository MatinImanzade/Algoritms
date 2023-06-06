package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.set(0,4);
        candles.set(1,1);
        candles.set(2,4);
        candles.set(3,3);

        System.out.println(candles.size());

//        int count = 0;
//        int max = 0;
//
//        for (int i = 0;i<candles.size();i++){
//            for (int j = 0;j<candles.size();j++){
//                if (candles.get(i)>candles.get(j)){
//                    max = candles.get(i);
//                }
//            }
//
//        }
//        System.out.println(max);

    }

    public static int birthdayCakeCandles(List<Integer> candles) { //        [4, 1, 4, 3]
        int count = 0;
        int max = 0;
        for (int i = 0;i<candles.size();i++){
            if (candles.get(i)>candles.get(i++)){

            }
        }

        return 0;
    }
}
