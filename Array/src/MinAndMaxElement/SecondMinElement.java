package MinAndMaxElement;
import Helpers.CreateAnArray;

import java.util.Arrays;

public class SecondMinElement {
    public static void main(String[] args) {

       int arr[]={9,7,8};

        int min1=arr[0];
        int min2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min1 > arr[i]) {
                min2 = min1;
                min1 = arr[i];
            } else if (min2 > arr[i]) {
                min2 = arr[i];
            }
        }
        System.out.println("Prvi minimum je " + min1 + " Drugi min je " + min2);

        //collections

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum element is "+arr[0]);

    }
}
