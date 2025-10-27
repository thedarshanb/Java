
import java.util.Scanner;

class EvenorOdd {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          while (true) {

               System.out.println("Enter Number: ");
               int num = sc.nextInt();

               if (num % 2 == 0) {
                    System.out.println("Even Number");
               } else {
                    System.out.println("Odd Number");
               }

               System.out.println("Enter + to continue - to Exit");
               String op = sc.next();

               if(op.equals("+")){
                    continue;
               }else if(op.equals("-")){
                    break;
               }

               sc.close();

          }
     }
}
