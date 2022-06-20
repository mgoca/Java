package ArraysPractice;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class CopyAnArray {

    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();
        System.out.println("Elements of the array are : " + Arrays.toString(arr));

        int[]copy=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            copy[i]=arr[i];
        }
        System.out.println("First array elements are: "+Arrays.toString(arr));
        System.out.println("Copy array elements are: "+Arrays.toString(copy));
    }
}
