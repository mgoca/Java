package ArraysPractice;

import Helpers.CreateAnArray;

import java.util.Arrays;

public class AddAnElement {
    public static void main(String[] args) {

        CreateAnArray c = new CreateAnArray();
        int[] arr = c.createAnArray();

        System.out.println(Arrays.toString(arr));

        int addValue = 15;
        int position = 3;
        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < newArr.length; i++) {
            if (i < position) {
                newArr[i] = arr[i];
            } else if (i == position) {
                newArr[i] = addValue;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        System.out.println("New array with add element is " + Arrays.toString(newArr));

    }
}
