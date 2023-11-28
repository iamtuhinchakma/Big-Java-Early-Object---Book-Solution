package FileHandling.e9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Find {
    public static void findAndPrint(String wordToFind, String fileName) throws IOException {
        Scanner inFile = new Scanner(new File(fileName));
        while (inFile.hasNextLine()){
            String line = inFile.nextLine();
            if(line.contains(wordToFind)){
                System.out.printf("%s: %s\n", fileName, line);
            } else {
                System.out.println(fileName + " not found!");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        if(args.length > 0){
            String wordToFind = args[0];
            for(int i = 1; i < args.length; i++){
                String f = args[i];
                findAndPrint(wordToFind, f);
            }
        }
    }
}
