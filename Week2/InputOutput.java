package Week2;

import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        // Task 1
        Scanner scan1 = new Scanner(System.in);
        
        // Task 2
        System.out.print("What is your name?: ");
        String name = scan1.nextLine();
        
        // Task 3
        System.out.print("Are you over 18?: ");
        boolean status = scan1.nextBoolean();
       
        // Task 3
        System.out.print("How many sibling do you have?: ");
        int sibling = scan1.nextInt();

        // Task 4
        System.out.printf("Hello %s\n", name);

        // Task 5
        System.out.printf("Over 18?: %b\n", status);
        
        // Task 6
        System.out.printf("You have %d no. of sibling\n", sibling);

        scan1.close();
    }
}
