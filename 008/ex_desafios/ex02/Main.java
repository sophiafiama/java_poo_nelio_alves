package ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Informe o nome do empregado: ");
        employee.name = sc.nextLine();
        System.out.println("Informe o valor do salário Bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Informe o valor do imposto: ");
        employee.tax = sc.nextDouble();

        System.out.println("Dados do funcionário cadastrado: ");
        System.out.println(employee);

        System.out.println("Qual porcentagem aumentar o salário?");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("Salario atualizado: ");
        System.out.println(employee.grossSalary);

        System.out.println("Salário com taxas: ");
        System.out.println(employee.netSalary());
        sc.close();
    }
}
