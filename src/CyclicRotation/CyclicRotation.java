package CyclicRotation;

import java.util.Arrays;

public class CyclicRotation {

    public int[] getCyclicRotation(int[] arr, int cycles){
        int[] tempArr = arr.clone();

        for (int i = 0; i < cycles; i++){
            for (int j = 1; j < arr.length; j++){
                if (j == arr.length - 1){
                    arr[0] = tempArr[j];
                }
                arr[j] = tempArr[j - 1];
            }
            tempArr = arr.clone();
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {3, 8, 9, 7, 6};
        CyclicRotation cr = new CyclicRotation();
        arr = cr.getCyclicRotation(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
