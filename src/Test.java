import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IllegleTriangleExceptionc{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side a: ");
        int a = scan.nextInt();
        System.out.println("Enter side b: ");
        int b = scan.nextInt();
        System.out.println("Enter side c: ");
        int c = scan.nextInt();
        boolean isTriangle = a + b> c && a + c > b && b + c > a && a >=0 && b>=0 && c >=0;
        if(!isTriangle) throw new IllegleTriangleExceptionc("Three side of triangle not available");
        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Parameter: " + triangle.getParameter());
    }
}
