package Week2;
import java.util.Scanner;

public class OperatorsClass {
    public static void main(String[] args) {
        /*
        */
        // Task-1
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = num.nextInt();
        num.close();
        System.out.println("Is 'a' greater than or equal to 18? " + (a >= 18));
        
        // Task-2
        int amount = 1000, time = 3, rate = 12;
        double si = (amount * time * rate)/100;
        System.out.println("The simple interest is " + si);
        
        // Task-3
        int l = 50, b = 30;
        int area = l * b;
        int perimeter = 2 * (l + b);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter);
        
        // Task-4
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int c = num2.nextInt();
        num2.close();
        System.out.print("Is 'c' greater than or equal to 18? ");
        System.out.println((c >= 18)? "True" : "False");

    

    }
}
