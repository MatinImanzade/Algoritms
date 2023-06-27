package coders.iyun24;

public class FindMaxValueInArray implements Comparable<Integer> {
    @Override
    public int compareTo(Integer o) {
        return 0;
    }

    public static <T extends Comparable<T>> T findMaxValue(T[] array) throws ArrayBoshdurVeyaNulldur {
        if (array.length == 0 || array == null){
            throw new ArrayBoshdurVeyaNulldur("Array boshdur ve ya Nulldur");
        }
        T maximumValue = array[0];
        for (int i = 1;i<array.length;i++){
            if (array[i].compareTo(maximumValue)>0){
                maximumValue = array[i];
            }
        }
        return maximumValue;
    }

}
