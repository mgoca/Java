package MinAndMaxElement;
import Helpers.CreateAnArray;

import java.util.Arrays;

public class PositionOfMaxElement {
    public static void main(String[] args) {

        CreateAnArray c=new CreateAnArray();
        int[]arr=c.createAnArray();
        System.out.println("Elements of the array are : " + Arrays.toString(arr));

        int index=0;
        int max = arr[index];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index=i;
            }
        }
        System.out.println("Position of maximum element in array is "+ index);
    }
}
