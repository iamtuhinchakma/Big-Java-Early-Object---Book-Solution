package FileHandling.e3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the file name for input: ");
        String filename1 = in.next();

        System.out.println("Please enter the file nane for input: ");
        String fileName2 = in.next();
        in.close();

        int lineNumbers = 1;
        try(Scanner inFile = new Scanner(new File(filename1)); PrintWriter out = new PrintWriter(fileName2)){
            while(inFile.hasNext()){
                out.println("/* " + lineNumbers + "*/" + inFile.nextLine());
                lineNumbers++;
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
    }
}
