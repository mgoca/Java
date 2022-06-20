package ArraysPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FindAnElement {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 3, 3, 8, 9, 3, 2, 4, 2};

        Scanner sc = new Scanner(System.in);
        System.out.println("What number are you looking for? ");
        int findNumber = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Number " + findNumber + " is found " + count + " times.");
        } else {
            System.out.println("Number " + findNumber + " is not found.");
        }
    }}
