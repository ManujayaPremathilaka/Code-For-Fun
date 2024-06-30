package OddOccurrenceArray;

public class OddOccurrenceArray {

    public int getOddOccurrenceNo(int[] arr){
        int oddOccurrence = 0;

        for (int i = 0; i < arr.length; i++){
            oddOccurrence = arr[i];
            for (int j = 0; j < arr.length; j++){
                if (j == i){
                    continue;
                } else if (arr[j] == oddOccurrence) {
                    oddOccurrence = 0;
                    break;
                }
            }
            if (oddOccurrence != 0){
                break;
            }
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
