package ArraysPractice;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class SumOfElementsInAnArray {
    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();
        System.out.println("Elements of the array are : " + Arrays.toString(arr));

        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
          sum=sum+arr[i];
        }
        System.out.println("Sum of elements is "+sum);


        //second way
        int sum1=0;
        for (int s:arr) {
            sum1=sum1+s;
        }
        System.out.println("Sum is "+sum1);
    }
}
