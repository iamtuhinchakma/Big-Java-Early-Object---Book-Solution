package Inheritance.e12;
class Person{
    private String name;
    private int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }
    public String toString(){
        return "Person[name: " + name + ",Brith Year: " + birthYear;
    }
}
class Student extends Person{
    private String major;
    public Student(String name, int birthYear, String major){
        super(name, birthYear);
        this.major = major;
    }
    public String toString(){
        return "Student[super = " + super.toString() + ", major = " + major + "]";
    }
}
class Instructor extends Person{
    private double salary;
    public Instructor(String name, int birthYear, double salary){
        super(name, birthYear);
        this.salary = salary;
    }
    public String toString(){
        return "Instructor[super =" + super.toString() + ", salary = " + salary + "]";
    }
}
public class PersonVerify {
    public static void main(String[] args) {
        Person p = new Person("Perry", 1959);
        Student s1 = new Student("Sylvia", 1979, "Computer Science");
        Student s2 = new Student("Ann", 1982, "Biology");
        Instructor e = new Instructor("Joseph", 1954, 6500);
        System.out.println(p);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(e);
    }
}
