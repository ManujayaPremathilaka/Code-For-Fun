package OddOccurrenceArray;

public class OddOccurrenceArray {

    public int getOddOccurrenceNo(int[] arr){
        int oddOccurrence = 0;

        for (int k : arr) {
            oddOccurrence ^= k;
        }

        return oddOccurrence;
    }

    public static void main(String[] args){
        int[] arr = {9, 3, 9, 3, 9, 7, 9};

        OddOccurrenceArray ooa = new OddOccurrenceArray();
        int oddOccurrence = ooa.getOddOccurrenceNo(arr);
        System.out.println(oddOccurrence);
    }
}
