package MinAndMaxElement;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class PositionOfMinElement {

    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int arr[] = c.createAnArray();
        System.out.println(Arrays.toString(arr));

        int index = 0;
        int min = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Position of minimum element in the array is: " + index);
    }
}
