package ArraysPractice;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();
        System.out.println("Elements of the array are : " + Arrays.toString(arr));

        // reverse an array
        System.out.println("Reverse array is ");
        for (int i =arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
        //create new reversed array

        int []reverseArr=new int[arr.length];
        for (int i = arr.length-1,j=0; i >=0 ; i--,j++) {
            reverseArr[j]=arr[i];
        }
        System.out.println("Reverse new array elements are: "+Arrays.toString(reverseArr));


    }
}
