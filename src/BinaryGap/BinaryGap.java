package BinaryGap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinaryGap {
    public static int CONST_NUMBER_ZERO = 0;
    public static int CONST_NUMBER_ONE = 1;

    public int getBinaryGap(int N){
        char[] binaryArr = getBinaryArr(N);
        int maxGap = CONST_NUMBER_ZERO;

        for (int i = CONST_NUMBER_ZERO; i < binaryArr.length; i++){
            if (isNumberOneAtIndex(binaryArr, i)){
                int tempMaxGap = CONST_NUMBER_ZERO;
                int j = CONST_NUMBER_ONE;
                for ( ; j < binaryArr.length; j++){
                    if (isNumberOneAtIndex(binaryArr, j)){
                        maxGap = validateAndGetMaxGap(maxGap, tempMaxGap);
                        tempMaxGap = CONST_NUMBER_ZERO;
                        continue;
                    }
                    tempMaxGap++;
                }
                if (isArrHasNoBinaryGap(binaryArr, j - CONST_NUMBER_ONE)){
                    maxGap = CONST_NUMBER_ZERO;
                }
            }
        }

        return maxGap;
    }

    public int validateAndGetMaxGap(int maxGap, int tempMaxGap){
        return Math.max(tempMaxGap, maxGap);
    }

    public boolean isNumberOneAtIndex(char[] binaryArr, int index){
        return Character.getNumericValue(binaryArr[index]) == CONST_NUMBER_ONE;
    }

    public boolean isArrHasNoBinaryGap(char[] binaryArr, int currentIndex){
        return  (Character.getNumericValue(binaryArr[currentIndex]) != CONST_NUMBER_ONE)
                && ((binaryArr.length - CONST_NUMBER_ONE) == currentIndex);
    }

    public char[] getBinaryArr(int number){
        String binaryStr = Integer.toBinaryString(number);
        return binaryStr.toCharArray();
    }

    public static void main(String[] args) {
        BinaryGap bg = new BinaryGap();
        int[] arr = {1,2,147,483,647};

        for (int i  = CONST_NUMBER_ZERO; i < arr.length; i++){
            int maxGap = bg.getBinaryGap(arr[i]);
            System.out.println("Number: " + arr[i] + " | Binary Value: " + Integer.toBinaryString(arr[i]) + " | Max Gap: "
                    + maxGap);
        }

    }
}