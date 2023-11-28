package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter word to Find?");
        String wordToFind = in.next();

        File[] files = {new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\tuhin.txt"), new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\hello.txt")};
        PrintWriter out = new PrintWriter("C:\\Users\\User\\Desktop\\Java\\Big Java\\output.txt");

        int i = 0;
        while (i < 2){
            Scanner inFile = new Scanner(files[i]);
            while(inFile.hasNextLine()){
                String line = inFile.next();
                Scanner l = new Scanner(line);
                while(l.hasNext()){
                    String temp = l.next();
                    if(temp.equals(wordToFind)){
                        out.println(files[i].getName() + " " + line);
                    }
                }
            }
            i++;
            inFile.close();
        }
        out.close();
    }
}
