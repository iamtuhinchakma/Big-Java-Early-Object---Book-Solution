package FileHandling.e1;

import java.io.*;
import java.util.Scanner;

public class FileHello {
    public static void main(String[] args) throws FileNotFoundException {
        //Writing into a file
        try{
            FileWriter writer = new FileWriter("hello.txt");
            writer.write("I love you pravati!");
            writer.close();
            System.out.println("Successfully written to the file!");
        } catch (IOException e){
            System.out.println("An error occured while writing to the file!");
            e.printStackTrace();
        }
        try(Scanner in  = new Scanner(new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\hello.txt"))){
            String message = in.nextLine();
            System.out.println(message);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
