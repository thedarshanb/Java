import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter Num 1: ");
          int num1 = sc.nextInt();
          System.out.println("Enter Num 2: ");
          int num2 = sc.nextInt();

          System.out.println("Enter Your Choice:\n + Addition\n - Subtraction * Multiplication\n / Division\n");
          String choice = sc.next();

          switch (choice) {
               case "+":
                    System.out.println("Addition " + (num1 + num2));
                    break;
               case "-":
                    System.out.println("Subtraction " + (num1 - num2));
                    break;
               case "*":
                    System.out.println("Multiplication " + (num1 * num2));
                    break;
               case "/":
                    System.out.println("Division " + (num1 / num2));
                    break;
               default:
                    System.out.println("Invalid Input");

          sc.close();
          }

     }
}