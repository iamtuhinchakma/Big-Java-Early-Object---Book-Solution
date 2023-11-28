package Inheritance.e13;
class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return "Employee[name = " + name + ", salary = " + salary + "]";
    }
}
class Manager extends Employee{
    private String department;
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    public String toString(){
        return "Manager[super = " + super.toString() + ", department = " + department + "]";
    }
}

class Executive extends Manager{
    public Executive(String name, double salary, String department){
        super(name, salary, department);
    }
    public String toString(){
        return "Executive[super = " + super.toString() + "]";
    }
}
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee("Edger", 65000);
        Manager m = new Manager("Marry", 88500, "Engineering");
        Executive v = new Executive("Veronica", 105000, "Engineering");
        System.out.println(e);
        System.out.println(m);
        System.out.println(v);
    }
}
