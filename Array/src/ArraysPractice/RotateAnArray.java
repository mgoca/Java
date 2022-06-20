package ArraysPractice;

import java.util.Arrays;

public class RotateAnArray {
    public static void main(String[] args) {
        //rotation from left to the right
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array elements before rotation are: " + Arrays.toString(a));

        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        System.out.println("Array elements after rotation are:  " + Arrays.toString(a));

        //rotation from right to the left

        int b[] = {17, 16, 15, 14, 13, 12, 11};
        System.out.println("Array elements before rotation are: " + Arrays.toString(b));

        int temp1 = b[b.length - 1];
        for (int i = b.length - 2; i > -1; i--) {
            b[i + 1] = b[i];
        }
        b[0] = temp1;
        System.out.println("Array elements after rotation are:  " + Arrays.toString(b));
    }
}
