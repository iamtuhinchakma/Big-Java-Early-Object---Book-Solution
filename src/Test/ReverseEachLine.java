package Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseEachLine {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = in.nextLine();


        //Reads the original file
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        List<String> lines = new ArrayList<>();
        String l;
        while ((l = reader.readLine()) != null){
            lines.add(l);
        }
        reader.close();

        List<String> reverseLines = new ArrayList<>();
        for(String line : lines){
            reverseLines.add(new StringBuilder(line).reverse().toString());
        }
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))){
            for(String line : reverseLines){
                writer.write(line + "\n");
            }
        }
    }
}
