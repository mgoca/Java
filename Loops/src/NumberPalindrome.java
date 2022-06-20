import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse = 0;
        int n = number;

        while (n > 0) {
            int r = n % 10;//last number
            reverse = reverse * 10 + r;
            n = n / 10; // to get rid of last number that we already use it
        }

        System.out.println("Reverse number is  " + reverse);


        if (number == reverse) {
            System.out.println("Number " + number + " is palindrome.");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
}
