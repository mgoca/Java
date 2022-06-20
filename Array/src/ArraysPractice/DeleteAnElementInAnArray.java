package ArraysPractice;
import Helpers.CreateAnArray;

import java.util.Arrays;

public class DeleteAnElementInAnArray {
    public static void main(String[] args) {

        CreateAnArray c=new CreateAnArray();
        int[] arr=c.createAnArray();

        System.out.println(Arrays.toString(arr));

        int deleteIndex=2;

        for (int i = 2; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=0;
        System.out.println("New array with deleted element is: "+Arrays.toString(arr));

    }
}
