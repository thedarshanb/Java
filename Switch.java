import java.util.Scanner;

public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter switch: +/- ");
     String sw = sc.next();

     if (sw.equals("+")) {
          System.out.println("Light's ON");
     } else if (sw.equals("-")) {
          System.out.println("Light's OFF");
     } else {
          System.out.println("Invalid switch Input");
     }

     sc.close();
}
