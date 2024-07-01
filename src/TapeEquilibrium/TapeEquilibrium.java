package TapeEquilibrium;


public class TapeEquilibrium {

    public int getTapeEquilibrium(int[] arr){
        int N = arr.length;

        long totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        long sumFirstPart = 0;
        long minDifference = Long.MAX_VALUE;

        for (int P = 1; P < N; P++) {
            sumFirstPart += arr[P - 1];
            long sumSecondPart = totalSum - sumFirstPart;
            long difference = Math.abs(sumFirstPart - sumSecondPart);
            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        return (int) minDifference;
    }

    public static void main(String[] args){
        int[] arr = {3, 1, 2, 4, 3};

        TapeEquilibrium te = new TapeEquilibrium();
        int value = te.getTapeEquilibrium(arr);
        System.out.println(value);
    }
}
