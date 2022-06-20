import java.util.Scanner;

public class SumOfAllDigits {
    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n=number;
        int sum=0;

        while(n>0){
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }

        System.out.println("Sum of all digits in number "+number+ " is "+sum);


    }
}
