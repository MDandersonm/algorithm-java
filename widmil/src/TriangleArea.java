import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();
        double m = sc.nextDouble();

        double width = (n * m) / 2;

        System.out.printf("%.1f", width);
    }
}
