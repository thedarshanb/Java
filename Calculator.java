import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          while (true) {
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
                         if (num2 == 0)
                              System.out.println("Cannot divided by zero");
                         else
                              System.out.println("Division " + (num1 / num2));
                         break;
                    default:
                         System.out.println("Invalid Input");
               }

               System.out.println("Enter Y to Continue and N to Exit");
               String op = sc.next();
               if (op.equals("N") || op.equals("n"))
                    break;

               sc.close();

          }

     }
}
