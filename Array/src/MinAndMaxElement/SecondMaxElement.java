package MinAndMaxElement;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class SecondMaxElement {
    public static void main(String[] args) {

        // Not working properly in cases when the first element in an array is maximum
        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();

        System.out.println("Elements of the array are : " + Arrays.toString(arr));


        int max1 = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];
            } else if (max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        System.out.println("Frst maximun is " + max1 + ", and second maximun is  " + max2);

        //this one is better-colection

        //collections

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second maximum element is "+arr[arr.length-2]);

    }
}