package ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rectangle r01 = new Rectangle();
        System.out.println("Enter rectangle width and height:");

        r01.width = sc.nextDouble();
        r01.height = sc.nextDouble();
        System.out.printf("AREA = %.2f%n", r01.area());
        System.out.printf("PERIMETER = %.2f%n", r01.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", r01.diagonal());

        sc.close();
    }
}
