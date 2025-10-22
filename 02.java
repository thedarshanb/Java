// 🧩 Using Variables, Datatypes & Scanner

// - Variables and Data Types (int, char, float, String)
// - User Input with Scanner
// - Basic Console Output


import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Your Name: ");
        String name = scanner.next();
        
        System.out.println("Enter Your Age: ");
        int age = scanner.nextInt();
        
        System.out.println("Enter Your Height: ");
        float height = scanner.nextFloat();
        
        System.out.println("Enter Your Grade: ");
        char grade = scanner.next().charAt(0);
        
        System.out.println("/++++++++++++++++++++++++/");
        System.out.println("WELCOME TO MY Portfolio");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
}
