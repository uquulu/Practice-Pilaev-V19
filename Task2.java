import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = sc.nextDouble();
        System.out.print("Введіть b: ");
        double b = sc.nextDouble();
        System.out.print("Введіть x: ");
        double x = sc.nextDouble();

        double f;

        if (x < 7) {
            f = Math.sqrt(Math.pow(x, 3) - a);
        } else if (x == 7) {
            f = 3 * Math.pow(x, 2) - x + b;
        } else if (x > 7 && x < 8) {
            f = Math.sin(2 * x);
        } else {
            System.out.println("x поза межами області визначення!");
            return;
        }

        System.out.printf("f(x) = %.6f%n", f);
    }
}