package ArraysPractice;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class MultiplyAnElements {
    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();
        System.out.println("Elements of the array are : " + Arrays.toString(arr));

        int mply=1;
        for (int i = 0; i <arr.length ; i++) {
            mply=mply*arr[i];
        }
        System.out.println("Multipling result is "+mply);
    }
}
