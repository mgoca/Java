package MinAndMaxElement;
import Helpers.CreateAnArray;

import java.util.Arrays;

public class MaxElement {

    public static void main(String[] args) {

    CreateAnArray c=new CreateAnArray();

    int[]arr=c.createAnArray();

    System.out.println("Elements of the array are : " + Arrays.toString(arr));

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is "+max);

        //collections

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum element is "+arr[arr.length-1]);


    }}
