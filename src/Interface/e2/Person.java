package Interface.e2;

import Interface.e1.Measurable;

class Data{
    public static Interface.e1.Measurable largest(Interface.e1.Measurable[] obj){
        Interface.e1.Measurable largest = obj[0];
        for(int i = 0; i < obj.length; i++){
            if(obj[i].getMeasure() > largest.getMeasure()){
                largest = obj[i];
            }
        }
        return largest;
    }
    public static Interface.e1.Measurable smallest(Interface.e1.Measurable[] obj){
        Interface.e1.Measurable smallest = obj[0];
        for(int i = 0; i < obj.length; i++){
            if(obj[i].getMeasure() < smallest.getMeasure()){
                smallest = obj[i];
            }
        }
        return smallest;
    }
    public static double average(Interface.e1.Measurable[] obj){
        double sum = 0;
        for(Measurable o : obj){
            sum += o.getMeasure();
        }
        if(obj.length > 0){
            return (sum / obj.length);
        } else {
            return 0;
        }
    }
}
public class Person implements Measurable{
    private String name;
    private double height;
    public Person(String name, double height){
        this.name = name;
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public String getName(){
        return name;
    }
    public double getMeasure(){
        return height;
    }

    public static void main(String[] args) {
        Measurable persons[] = new Measurable[3];
        persons[0] = new Person("Joe", 183);
        persons[1] = new Person("Chrissy", 158);
        persons[2] = new Person("Bob Malan", 175);

        double avg = Data.average(persons);
        System.out.println("Average height: " + avg);

        Person max = (Person) Data.largest(persons);
        Person min = (Person) Data.smallest(persons);
        System.out.println("Name of the tallest person: " + min.getName());
    }
}
