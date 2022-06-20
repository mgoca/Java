package Helpers;

public class TwoDArrays {

    public  int[][] randomArray(int row, int column) {
        int[][] random = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                random[i][j] = (int) (Math.random() * 100);
            }
        }
        return random;
    }


    //method-print 2d array
    public  void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }
    //sum of 2d array elements
    public  int sumOf2dArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }



}
