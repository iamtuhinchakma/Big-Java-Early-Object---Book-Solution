package Chapter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Illustrate class construction and inheritance
 */
class Employee
{

    private String name;
    private double baseSalary;

    public Employee() {
        name = "";
        baseSalary = 0.00;
    }

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setBaseSalary(double newSalary)
    {
        baseSalary = newSalary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return baseSalary;
    }
}

class Manager extends Employee
{

    private double bonus;

    public Manager(String newName, double newSalary, double newBonus)
    {
        setName(newName);
        setBaseSalary(newSalary);

        bonus = newBonus;
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

}

public class EmployeeTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Create an employee
        Employee employee = new Employee();
        employee.setName("James Garfield");
        employee.setBaseSalary(23000.00);
        Manager manager = new Manager("Mary Wilson", 25000, 3000);
        System.out.printf("Employee %s makes $%4.2f.\n", employee.getName(), employee.getSalary());
        System.out.printf("Manager %s makes $%4.2f and a bonus of $%10.2f.\n",
                manager.getName(), manager.getSalary(), manager.getBonus());

    }

}


