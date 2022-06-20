import java.util.Scanner;

public class ProgressionArithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert start number: ");
        int startNumber = sc.nextInt();

        System.out.println("Insert number to add");//diametar
        int d = sc.nextInt();

        System.out.println("Insert number of repeating: ");
        int r = sc.nextInt();

        int tmp = startNumber;
        for (int i = 0; i < r; i++) {
            System.out.print(tmp + ", ");
            tmp = tmp + d;

        }
    }
}
