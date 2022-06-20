import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n=number;
        int reverse=0;

        while(n>0){
        int r=n%10;
        reverse=reverse*10+r;
        n=n/10;
        }

        System.out.println("Reversed number of "+number+ " is "+reverse);

    }
}
