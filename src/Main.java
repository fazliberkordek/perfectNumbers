/**
 * @author fazliberkordek
 */
//Perfect Number:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, sum = 1;
        System.out.print("Type the number:");
        number = input.nextInt();
        if (number != 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }

            }
            if (sum == number) {
                System.out.println("Number : " + number + " is perfect");
            } else {
                System.out.println("Number : " + number + "is  not perfect");
            }
        } else {
            System.out.println("1 is not Perfect!!");
        }


    }
}
