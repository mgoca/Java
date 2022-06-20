import java.util.Scanner;

/* ukoliko kub pojedinacnih cifara nekog broja,
 kada se saberu daje taj  broj ,onda se taj broj naziva Armstrong broj.
 npr 153=(1*1*1)+(5*5*5)+(3*3*3)
 zatim 371....
*/
public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int n = number;
        int sum = 0;

        while (n > 0) {

            int r = n % 10;// take a last number
            sum = sum + r * r * r;// then multiply 3 times for cub
            n = n / 10;//divide whit 10 ,to get second number....etc
        }

        if (number == sum) {
            System.out.println("Number " + number + " is Armstrong number.");
        } else {
            System.out.println("It is not Armstrong number");
        }
    }
}
