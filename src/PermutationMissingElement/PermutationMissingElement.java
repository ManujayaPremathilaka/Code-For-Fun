package PermutationMissingElement;

import java.util.Arrays;

public class PermutationMissingElement {

    public int getMissingElement(int[] arr){
        int xorSum = 0;
        int arrLength = arr.length;

        for (int i = 0; i < arrLength; i++){
            xorSum ^= i;
        }

        for (int i = 1; i < arrLength + 1; i++){
            xorSum ^= i;
        }

        return xorSum;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 1, 5};

        PermutationMissingElement pme = new PermutationMissingElement();
        int missingElm = pme.getMissingElement(arr);
        System.out.println(missingElm);
    }
}
