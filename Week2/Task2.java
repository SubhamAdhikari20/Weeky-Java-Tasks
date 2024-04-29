package Week2;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        */
        // Q.1 Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote.
        System.out.print("Enter your age: ");
        int age1 = input.nextInt();
         
        if (age1 >= 18) {
        System.out.println("You can cast a vote");
        
        }
        else {
        System.out.println("You cannot caste a vote");
        }
        
        
        
        // Q.2 Write a program to calculate SI.
        System.out.print("Enter the principle amount: ");
        int principle = input.nextInt();
        
        System.out.print("Enter the year: ");
        float year = input.nextFloat();
        
        System.out.print("Enter the rate of interest: ");
        float rate = input.nextFloat();
        
        float si = (principle * year * rate)/100;
        
        System.out.println("The simple interest is " + si);
        
        
        
        
        // Q.3 Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        
        // Triangle
        System.out.print("Enter the base length of triangle : ");
        float base = input.nextFloat();
        
        System.out.print("Enter the height of triangle : ");
        float height = input.nextFloat();
        
        float area = (1f/2f) * (base * height);
        System.out.println("The area of triangle is " + area);
        
        
        // Cuboid
        System.out.print("Enter the length of cuboid: ");
        float length = input.nextFloat();
        
        System.out.print("Enter the breadth of cuboid: : ");
        float breadth = input.nextFloat();
        
        System.out.print("Enter the breadth of cuboid: : ");
        float height3 = input.nextFloat();
        
        float volume = (length * breadth * height3);
        System.out.println("The volume of cuboid is " + volume);
        
        
        
        // Q.4 Write the ternary operator for question no. 1
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println((age >= 18)? "You can cast a vote" :
        "You cannot caste a vote");
        
        
        // Q.5 Write a program to take two integer inputs from the user and print the sum and product of them.
        System.out.print("Enter the value of n1: ");
        int n1 = input.nextInt();
        
        System.out.print("Enter the value of n2: ");
        int n2 = input.nextInt();
        
        System.out.println("The sum of " + n1 + " and " + n2 + " is " + (n1 + n2));
        System.out.println("The product of " + n1 + " and " + n2 + " is " + (n1*n2));
        
        // Q.6 Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result.
        System.out.print("Enter the value of n1: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the value of n2: ");
        int num2 = input.nextInt();
        
        int sum = num1+num2;
        int product = num1*num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        System.out.println("The product of " + num1 + " and " + num2 + " is " +
        product);
        System.out.println("The division of " + product + " and " + sum + " is " +
        (product/sum));
        
        // Q.7 Take the name, roll number, and field of interest from the user and print
        // in the format below: Hey, my name is XYZ and my roll number is XYZ. My field
        // of interest are xyz.
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your roll no: ");
        int roll_no = input.nextInt();
        
        System.out.print("Enter your field of interest: ");
        String interest = input.next();
        
        
        System.out.println("Hey, my name is " + name + " and my roll number is " + roll_no + ". My field of interest are " + interest);
        
        
        // Q.8 Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
        System.out.print("Enter the side length of a square: ");
        float l = input.nextInt();
        float area_square = l*l; 
        System.out.println("The area of sqaure " + area_square);
        
        float perimeter_square = 4*l;
        System.out.println("The area of sqaure " + perimeter_square);
        
        System.out.print("Enter the principle amount: ");
        int principle1 = input.nextInt();
        
        System.out.print("Enter the year: ");
        float year1 = input.nextFloat();
        
        System.out.print("Enter the rate of interest: ");
        float rate1 = input.nextFloat();

        float si1 = (principle1 * year1 * rate1)/100;
        System.out.print("The simple interest is " + si1);
        
        // Triangle
        System.out.print("Enter the base length of triangle : ");
        float base1 = input.nextFloat();
        
        System.out.print("Enter the height of triangle : ");
        float height1 = input.nextFloat();
        
        float area2 = (1.f/2.f) * (base1 * height1);
        System.out.println("The area of triangle is " + area2);
        
        System.out.print("Enter the length of cube: ");
        float length_cube = input.nextFloat();
        float vol_cube = length_cube * length_cube * length_cube;
        System.out.println("The volume of cube is " + vol_cube);
        
        // 9. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.print("Enter the length of a rectangle: ");
        double length_rectangle = input.nextDouble();
        System.out.print("Enter the length of a rectangle: ");
        double breadth_rectangle = input.nextDouble();
        
        int area_rectangle = (int)(length_rectangle * breadth_rectangle);
        
        System.out.println("The area of rectangle is " + area_rectangle);

        // Q.10 Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
        // a. If equal to or more than 70 -> First Class
        // b. If more than 59 -> Upper Second Class
        // c. If more than 49 -> Second class
        // d. If more than 39 -> Third class and if below than 40 the result is fail. 
        // Hint: Use ternary operator

        System.out.print("Enter the marks of Maths: ");
        int maths = input.nextInt();
        
        System.out.print("Enter the marks of English: ");
        int english = input.nextInt();

        System.out.print("Enter the marks of Science: ");
        int science = input.nextInt();

        System.out.print("Enter the marks of Nepali: ");
        int nepali = input.nextInt();

        float percentage = ((float)(maths + english + science + nepali)/400) * 100;
        System.out.println("The percentage secured by the student is " + percentage + "%");


        input.close();
        }
    }
