import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        double x = Math.sqrt(25.0);
        System.out.println(x);

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        int teste = max(a,b,c);

        System.out.println(teste);

    }
    public static int max(int x, int y , int j){
        int aux;
        if(x > y && x > j){
           return aux = x;
        }else if(y > x && y > j){
             return aux = y;
        }
        return j;
    }
}
