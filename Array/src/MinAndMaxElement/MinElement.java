package MinAndMaxElement;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in an Array? ");
        int numOfElements = sc.nextInt();

        int arr[] = new int[numOfElements];

        for (int i = 1; i <= numOfElements; i++) {
            System.out.println("Enter " + i + " element of an array? ");
            int element = sc.nextInt();
            arr[i - 1] = element;
        }

        System.out.println("Element of an array are : " + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < numOfElements; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("The  min element of an array is " + min);


        //collections

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum element is "+arr[0]);
    }
}
