package FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    int getMinTime(int X, int[] arr){
        Set<Integer> positionsCovered = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            positionsCovered.add(arr[i]);

            if (positionsCovered.size() == X) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        int[] arr = {1, 3, 1, 4, 2, 3, 5, 4};

        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int time = frogRiverOne.getMinTime(5, arr);
        System.out.println(time);
    }
}
