package FileHandling.e2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    //Reading File
    public static void RemoveLines(String fileName){
        ArrayList<String> lines = new ArrayList<>();
        try(Scanner in = new Scanner(new File(fileName))){
            while(in.hasNextLine()){
                String line = in.nextLine();
                if(!line.trim().isEmpty()){
                    lines.add(line);
                }
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        //Writing back
        try(PrintWriter out = new PrintWriter(fileName)){
            for(String l: lines){
                out.println(l);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        RemoveLines("C:\\Users\\User\\Desktop\\Java\\Big Java\\hello.txt");
        int count = 0;
        try(Scanner in = new Scanner(new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\hello.txt"))){
            while(in.hasNextLine()){
                in.nextLine();
                count++;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Number of non-blank lines: " + count);
    }
}
