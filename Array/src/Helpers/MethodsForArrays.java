package Helpers;

public class MethodsForArrays {

    public int sumOfElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int multiplyAnElements(int[] arr) {
        int mply = 1;
        for (int i = 0; i < arr.length; i++) {
            mply = mply * arr[i];
        }
        return mply;
    }

    public int[] copyAnArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    public int[] reversedArray(int[] arr) {
        int reverse[] = new int[arr.length];
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = arr[i];
        }
        return reverse;
    }

    public int[] deleteAnElement(int[] arr, int deleteIndex) {
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    public int[] addAnElement(int[] arr, int value, int position) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < position) {
                newArr[i] = arr[i];
            } else if (i == position) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
