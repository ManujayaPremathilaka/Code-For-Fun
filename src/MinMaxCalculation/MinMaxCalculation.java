package MinMaxCalculation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxCalculation {
    public static final int NUMBER_ZERO = 0;

    public void miniMaxSum(List<Integer> arr) {
        long min = NUMBER_ZERO;
        long max = NUMBER_ZERO;
        long total = NUMBER_ZERO;

        for (Integer value : arr){
            total = total + value;
        }

        min = Math.subtractExact(total, Collections.max(arr));
        max = Math.subtractExact(total, Collections.min(arr));

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void main(String[] args){
        List<Integer> integerList = Arrays.asList(256741038, 623958417, 467905213, 714532089, 938071625);
        //expected min = 2063136757, max = 2744467344

        MinMaxCalculation mx = new MinMaxCalculation();
        mx.miniMaxSum(integerList);
    }
}
