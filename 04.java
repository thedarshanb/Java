// if, else if, if else
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// if Statement
class main{
     public static void main(String[] args){
          int age =20;
          if(age>=18){
               System.out.println("Your Eligible for voting");
          }
     }
}

// if else
import java.util.Scanner;

class Main {
     public static void main(String[] args) {
          System.out.println("Try programiz.pro");
          Scanner age = new Scanner(System.in);
          System.out.println("Enter your age");
          int Num = age.nextInt();
          // int age =15;
          if (Num >= 18) {
               System.out.println("Your are eligible for Voting");
          } else {
               System.out.println("Your not eligible for voting");
          }
     }
}


// else if(Ladder)
class main {
     public static void main(String[] args) {
          int marks = 77;
          if (marks >= 100) {
               System.out.println("Grade A");
          } else if (marks >= 90) {
               System.out.println("Grade B");
          } else if (marks >= 75) {
               System.out.println("Grade C");
          } else {
               System.out.println("Fail");
          }
     }
}



// Switch, Break, default

public class main{

     public static void main(String[] args) {
          int day = 3;
          switch (day) {
               case 1:
                    System.out.println("Monday");
                    break;
               case 2:
                    System.out.println("Tuesday");
                    break;
               case 3:
                    System.out.println("Wednesday");
                    break;
               default:
                    System.out.println("Invalid day");
          }
     }
}
