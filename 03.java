// 🧮 Java Program – Calculate Total Cost

import java.util.Scanner;

public class Three {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("WELCOME");
          System.out.println("Enter Number of Items: ");
          float item = scanner.nextFloat();
          System.out.println("Enter Cost Per Item: ");
          float cost = scanner.nextFloat();
          System.out.println("Total cost: "+ item*cost);
          scanner.close();
     }
}


