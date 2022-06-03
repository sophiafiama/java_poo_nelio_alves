import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int total = 0;

        while (x != 0){
            x = sc.nextInt();
            total += x;
        }
        System.out.println("Soma dos Valores de x : " + total);
        sc.close();

    }
}
