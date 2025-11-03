public class Task1 {
    public static void main(String[] args) {
        double a = 2;
        double b = 2.13;
        double c = 0.37;

        double x = (Math.sqrt(Math.abs(a - 1)) - Math.cbrt(b)) / (1 + Math.pow(c, 2) + Math.pow(a, 3));
        double y = (1 + Math.cos(a - 2)) / (Math.pow(b, 2) + c + Math.sin(a));

        System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", a, b, c);
        System.out.printf("x = %.6f%n", x);
        System.out.printf("y = %.6f%n", y);
    }
}