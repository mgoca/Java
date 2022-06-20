package TwoDimensionArray;

import Helpers.TwoDArrays;

public class Reverse2dArray {
    public static void main(String[] args) {

        TwoDArrays d = new TwoDArrays();

        int[][] newArr = d.randomArray(3, 4);
        System.out.println("Array is: ");
        d.print2dArray(newArr);

        int[][] reverseArr = new int[4][3];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                reverseArr[j][i] = newArr[i][j];
            }
        }
        System.out.println("Reverse array: ");
        d.print2dArray(reverseArr);
    }
}
