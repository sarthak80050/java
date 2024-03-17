import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("the table is: ");
        for (int i = 1; i <= 10; i++) {
            int prod = i * x;
            System.out.println(x + " x " + i + " = " + prod);
        }

    }

}
