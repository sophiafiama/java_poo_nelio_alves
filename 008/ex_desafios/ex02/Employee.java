package ex02;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public double increaseSalary(double porcentage){
        return grossSalary += (grossSalary*porcentage/100);
    }

    @Override
    public String toString() {
        return "Name = " + name +
                ", GrossSalary = " + grossSalary +
                ", Tax = " + tax ;
    }
}
