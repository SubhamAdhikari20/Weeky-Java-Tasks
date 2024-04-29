package Week3;
import java.util.Scanner;


public class Week3Task {
    public static void main(String[] args) {
        //------------------- IF ELSE -------------------
        Scanner input = new Scanner(System.in);
        
        /* 
        */
        
        // 1. Write a JAVA program to find the maximum between three numbers.
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the maximum number of three numbers.");
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println(num2 + " is the maximum number of three numbers.");
        }
        else {
            System.out.println(num3 + " is the maximum number of three numbers.");
        }
        
        
        // Q.2 Write a JAVA program to check whether a number is negative, positive, or zero.
        System.out.print("Enter any number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        }
        else if (number < 0) {
            System.out.println(number + " is a negative number.");
        }
        else {
            System.out.println(number + " is zero.");
        }
        

        // Q.3 Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        System.out.print("Enter any number: ");
        int n = input.nextInt();
        
        if (n % 5 == 0) {
            if (n % 11 == 0) {
                System.out.println(n + " is divisible by both 5 and 11.");
            }
            System.out.println(n + " is divisible by 5 but not by 11.");
        }
        else if (n % 11 == 0) {
            System.out.println(n + " is divisible by 11 but not by 5.");
        }
        else {
            System.out.println(n + " is neither divisible by 11 nor by 5.");
        }

        
        // Q.4 Write a JAVA program to check whether a number is even or odd.
        System.out.print("Enter any number: ");
        int num = input.nextInt();
        
        if (num < 0) {
            System.out.println(num + " is zero.");
        }
        else if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
        
        
        // Q.5 Write a JAVA program to check whether a year is a leap year or not. 
        System.out.print("Enter the year: ");
        String year = input.nextLine();
        
        if (Integer.parseInt(year) < 0) {
            System.out.println("Please, the correct year.");
        }
        else if ((Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0) || Integer.parseInt(year) % 400 == 0) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
        
        
        // Q.6 Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        System.out.print("Enter any alphabet: ");
        char alpha = input.next().charAt(0);
        alpha = Character.toLowerCase(alpha);
        
        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
            System.out.println(alpha + " is a vowel letter");
        }
        else {
            System.out.println(alpha + " is a consonant letter");    
        }
        
        
        
        // ----------------- Switch Case Questions -------------------
        
        // Q.1 Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades.
        System.out.print("Enter any alphabet: ");
        char grade = input.next().charAt(0);
        grade = Character.toUpperCase(grade);
        
        switch (grade) {
            case 'A':
            System.out.println("GPA: 3.6");
            break;
            case 'B':
            System.out.println("GPA: 3.2");
            break;
            case 'C':
            System.out.println("GPA: 2.8");
            break;
            case 'D':
            System.out.println("GPA: 2.4");
            break;
            case 'F':
            System.out.println("GPA: 2.0");
            break;
            
            default:
            System.out.println("Invalid grade!!! Pleae give correct input");
        }
        
        
        // Q.2 Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement.
        System.out.print("Enter first number: ");
        int f_num = input.nextInt();
        
        System.out.print("Enter second number: ");
        int s_num = input.nextInt();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        int op = input.next().charAt(0);
        
        switch (op) {
            case '+':
            System.out.println("The sum of " + f_num + " and " + s_num + " is " + (f_num+s_num));
            break;
            case '-':
            System.out.println("The subtraction between " + f_num + " and " + s_num + " is " + (f_num-s_num));
            break;
            case '*':
            System.out.println("The product of " + f_num + " and " + s_num + " is " + (f_num*s_num));
            break;
            case '/':
            System.out.println("The division of " + f_num + " and " + s_num + " is " + (f_num/s_num));
            break;
            
            default:
            System.out.println("Invalid Operator!!!. Please, try again.");
        }
        
        
        // Q.3 Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
        
        System.out.print("Enter integer input (1 to 12) representing a month: ");
        int no_month = input.nextInt();
        
        switch (no_month) {
            case 1:
            case 2:
            case 3:
            System.out.println("Winter");
            break;
            case 4:
            case 5:
            case 6:    
            System.out.println("Spring");
            break;
            case 7:
            case 8:
            case 9:    
            System.out.println("Summer");
            break;
            case 10:
            case 11:
            case 12:    
            System.out.println("Fall");
            break;
            default:
            break;
        }


        // Q.4 Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
        System.out.println("\nArea of different shapes (circle, rectangle, square, triangle)");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Choose the number between (1-4): ");
        int no = input.nextInt();
        System.out.print("\n");

        switch (no) {
            case 1:
                System.out.print("Enter the radius: ");
                float radius = input.nextFloat();
                float area_circle = (float) Math.PI * radius * radius;
                System.out.println("The area of circle is " + area_circle);
                break;
            case 2:
                System.out.print("Enter the length of rectangle: ");
                float length_rec = input.nextFloat();
                System.out.print("Enter the breadth of rectangle: ");
                float breadth_rec = input.nextFloat();
                float area_rec = length_rec * breadth_rec;
                System.out.println("The area of rectangle is " + area_rec);
                break;
            case 3:    
                System.out.print("Enter the length of square: ");
                float length_sq = input.nextFloat();
                float area_sq = length_sq * length_sq;
                System.out.println("The area of square is " + area_sq);
                break;
            case 4:    
                System.out.print("Enter the base of triangle: ");
                float base_tri = input.nextFloat();
                System.out.print("Enter the height of triangle: ");
                float height_tri = input.nextFloat();
                float area_tri =  (1.f / 2.f) * base_tri * height_tri;
                System.out.println("The area of triangle is " + area_tri);
                break;

            default:
                break;
        }
        



        
        
        input.close();
    }
}
