import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter Number");
            int number = sc.nextInt();
            // int number =2;

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }

            System.out.println("Enter: 'X' To Continue 'O' To Exit");
            String xo = sc.next();

            if (xo.equals("O") || (xo.equals("o")))
                break;

        }

        sc.close();
    }
}