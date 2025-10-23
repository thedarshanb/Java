import java.util.Scanner;

class AreaofRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        int length = sc.nextInt();
        System.out.println("Enter Width: ");
        int width = sc.nextInt();
        // System.out.println("Enter Area: ");
        // int area = sc.nextInt();
        int area;
        area =length*width;
        
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
        sc.close();
    }
}

