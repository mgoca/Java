import java.util.Scanner;

public class ScannerInputAnArrayElements {

    public  int[] createAnArray(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in an Array? ");
        int numOfElements = sc.nextInt();

        int arr[] = new int[numOfElements];

        for (int i = 1; i <= numOfElements; i++) {
            System.out.println("Enter " + i + " element of an array? ");
            int element = sc.nextInt();
            arr[i - 1] = element;
        }
        return arr;
    }
}
