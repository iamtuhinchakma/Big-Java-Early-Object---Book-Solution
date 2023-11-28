package Inheritance.e1;
class Employee {
    private String name;
    private double baseSalary;
    public Employee(){
        name = "";
        baseSalary = 0.00;
    }
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setBaseSalary(double newSalary){
        baseSalary = newSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}
class Manager extends Employee {
    private double bonus;

    public Manager(String newName, double newSalary, double bonus) {
        super();
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Pravati Chakma");
        emp.setBaseSalary(20000.00);
        System.out.printf("Employee %s make %10.2f.\n", emp.getName(), emp.getBaseSalary());

        Manager mng = new Manager("Tuhin", 30000, 2500);
        System.out.printf("Employee %s make %10.2f and a bonus %10.2f.\n", mng.getName(), mng.getBaseSalary(), mng.getBonus());
    }
}
