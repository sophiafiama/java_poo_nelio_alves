import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        char fim;
        do {
            System.out.println("Digite a temperatura em Celcius: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.println("Equivalente em Fahrenheit: " + f);
            System.out.println("Deseja repitir (s/n)?");
            fim = sc.next().charAt(0);
        } while (fim != 'n');

        sc.close();
    }
}
