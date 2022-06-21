import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert some number: ");
        int startNumber = sc.nextInt();

        System.out.println("Insert start number to multiply: ");//diametar
        int d=sc.nextInt();

        System.out.println("Insert number for repeating: ");
        int r=sc.nextInt();

        int a=startNumber;
        int b=1,c;
        System.out.print (a+", ");
        for (int i = 0; i <r; i++) {
            c=a*d;
            System.out.print(c+", ");
            a=c;
        }
    }
}
