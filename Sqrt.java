
import java.util.Scanner;

class Sqrt {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        double result = Math.sqrt(num);
        System.out.println("The square root of " + num + " is: " + result);

        sc.close();
    }
}
