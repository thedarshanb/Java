import java.util.Scanner;

class Reverse {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Characters: ");
        String input = sc.next();  // user input

        // Reverse logic without StringBuilder
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed Characters: " + reversed);

        sc.close();
    }
}