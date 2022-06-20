package TwoDimensionArray;

public class Random2DArray {
    public static void main(String[] args) {

        //create 2d array
        int[][] newRandomArr = randomArray(4, 3);

        //print 2d array
        System.out.println("Elements of 2d array are: ");
        print2dArray(newRandomArr);

        //sum of 2d array elements
        int sumOfElements = sumOf2dArray(newRandomArr);
        System.out.println("Sum of elements is: " + sumOfElements);

        //number of elements in 2d array
        int numOfElements = countElements(newRandomArr);
        System.out.println("Number of elements in 2d array is: " + numOfElements);

        //arithmetic middle of 2d array
        double arithMiddle = arithmeticMidd(newRandomArr);
        System.out.println("Arithmetic middle is: " + arithMiddle);
    }


    // method-create random 2d array
    public static int[][] randomArray(int row, int column) {
        int[][] random = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                random[i][j] = (int) (Math.random() * 100);
            }
        }
        return random;
    }

    //method-print 2d array
    public static void print2dArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + ", ");
            }
            System.out.println();
        }
    }

    //sum of 2d array elements
    public static int sumOf2dArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }

    //number of 2d array elements
    public static int countElements(int[][] arr) {
        int numOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                numOfElements = arr.length * arr[i].length;
            }
        }
        return numOfElements;
    }

    //method of arithmetic middle of 2d array
    public static double arithmeticMidd(int[][] arr) {
        double aritMiddle = (double) sumOf2dArray(arr) / countElements(arr);

        return aritMiddle;
    }
}
