import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        System.out.println("Enter the Radius of the Circle");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double area = (Math.PI) * (radius * radius);
        System.out.println("Radius of Circle: " + radius);
        System.out.println("Area of Circle: " + area);

    }

}
