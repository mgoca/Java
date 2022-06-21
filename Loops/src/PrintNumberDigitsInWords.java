import java.util.Scanner;

public class PrintNumberDigitsInWords {

    public static void main(String[] args) {

        System.out.println("Insert some number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String wordNumber = "";

        while (number > 0) {

            int r = number % 10;
            wordNumber = wordNumber + r;

            number = number / 10;
        }

        System.out.println(wordNumber);
        System.out.println("The digits in number in words are:");

        for (int i = wordNumber.length() - 1; i >= 0; i--) {

            char W = wordNumber.charAt(i);

            switch (W) {

                case '0':
                    System.out.print("ziro ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
                default:
                    System.out.println("You did not enter the number");
            }
        }
    }

}
