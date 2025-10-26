import java.util.Scanner;

public class Simpleprogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Boy Name: ");
        String boyname = sc.next();
        System.out.println("Enter Boy Age: ");
        int boyage = sc.nextInt();
        
        System.out.println("Enter Girl Name: ");
        String girlname = sc.next();
        System.out.println("Enter Girl Age: ");
        int girlage = sc.nextInt();
        
        int age_diff=(boyage-girlage);
        
        
        System.out.println(boyname +" Likes "+ girlname +" their age difference "+ age_diff);

        sc.close();
    }
}
