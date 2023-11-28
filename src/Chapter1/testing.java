package Chapter1;

import java.io.*;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File myObj = new File("input.txt");
            FileWriter mywriter = new FileWriter("output.txt");
            mywriter.write("Successfully written!");
            mywriter.close();
            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            if(myObj.exists()){
                System.out.println("File name: " + myObj.getName());
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
