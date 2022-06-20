package TwoDimensionArray;

import java.sql.SQLOutput;

public class TwoDArrays {
    public static void main(String[] args) {

        int [][] A=new int[3][4];
        int [][] B={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        //first way
        System.out.println("Elements of 2D array are: ");
        for (int i = 0; i <B.length ; i++) {
            for (int j = 0; j <B[i].length ; j++) {
                System.out.print(B[i][j]+", ");
            }
            System.out.println();
        }
        //second way
        System.out.println("Second way to print 2d array elements: ");
        for(int x[]:B){
            for(int y:x){
                System.out.print(y+", ");
            }
            System.out.println();
        }

        //empty 2d array
        System.out.println("Empty array look like this: ");
        for (int i = 0; i <A.length ; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }

        //jagged array

        int C[][]=new int[3][];
        C[0]=new int[2];
        C[1]=new int[4];
        C[2]=new int[3];

        System.out.println("First way: ");
        for (int i = 0; i <C.length ; i++) {
            for (int j = 0; j <C[i].length ; j++) {
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second way: ");
        for (int x[]:C){
            for(int y:x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
