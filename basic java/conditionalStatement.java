import java.util.*;

public class conditionalStatement {
    public static void main(String[] argu) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Age: ");
        // int age = sc.nextInt();

        // Example for if Else
        // if (age > 18) {
        // System.out.println("You Can Vote");
        // } else {
        // System.out.println("You can Not Vote");
        // }

        // Todo: Program for check the number is odd or even in Java
        // System.out.println("Enter Number: ");
        // int number = sc.nextInt();

        // if (number % 2 == 0) {
        // System.out.println("This is Even Number");
        // } else {
        // System.out.println("This is Odd Number");
        // }

        // Todo: Write a java Program to Compare Two Number
        // System.out.println("Enter Two Number: ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // if (num1 == num2)
        // System.out.println("The Number is Equal");
        // else if (num1 > num2)
        // System.out.println("Num1 is Greater Then Num2 ");
        // else
        // System.out.println("Num1 is Less then Num2");

        // ! Switch Statement in Java

        int button = sc.nextInt();

        System.out.println("Enter number 1 to 3");
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Hello from button 2");
                break;
            case 3:
                System.out.println("Hello from button 2");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
