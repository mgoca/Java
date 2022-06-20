import java.util.Scanner;

public class FibonacciArray {
    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int a=0,b=1,c;


            System.out.print(a+", "+b+", ");
            for (int j = 0; j <number-2 ; j++)//less 2, because we already print a and b
            {
               c=a+b;
                System.out.print(c+", ");
               a=b;
               b=c;
            }
        }
    }

