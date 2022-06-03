import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            total += x;
        }
        System.out.println("Total igual: " + total);

        for (int i = 0; i < 10; i++) {
            System.out.println("Testando o for " + i);
        }
    }
}
