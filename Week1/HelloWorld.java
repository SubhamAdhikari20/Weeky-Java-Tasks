package Week1;
public class HelloWorld{
    public static void main(String[] args) {
        /*
        */
        // Task1: program to print Hello World
        System.out.println("Hello World");
        
        // Task2: Extend/Modify the above program to print two additional lines 
        System.out.print("This is my first program\nI am on module ST4003CEM");
        
        // Task3:
        System.out.print("A \"quoted\" String is\n\'much\' better if you learn\nthe rules of \"escape sequences.\"\nAlso, \"\" represents an empty\nString. Don't forget: use \\\"\ninstead of \" !\n\" is not the same as \"");
        
        // Task4:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        // Task 5:
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        
        // Task 6:
        System.out.print("A well-formed Java program has a main method with { and } braces.\n\nA System.out.println statement has ( and ) and usually a String that starts and ends with a \" character.\n(But we type \\\" instead!)\nWhat is the difference between\na ' and a \"?  Or between a \" and a \\\"?\n\nOne is what we see when we're typing our program. The other is what appears on the \"console.\"");
        
        
        


    }
}
