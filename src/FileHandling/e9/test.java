package FileHandling.e9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String wordToFind = in.next();

        File[] files = {new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\input.txt"), new File("C:\\Users\\User\\Desktop\\Java\\Big Java\\input1.txt")};

        PrintWriter out = new PrintWriter("C:\\Users\\User\\Desktop\\Java\\Big Java\\output.txt");

        int i = 0;
        while(i < 2){
            in = new Scanner(files[i]);
            while (in.hasNextLine()){
                String line = in.nextLine();
                Scanner lines = new Scanner(line);
                while(lines.hasNext()){
                    String temp = lines.next();
                    if(temp.equals(wordToFind)){
                        out.println(files[i].getName() + " " + line);
                    }
                }
            }
            i++;
            in.close();
        }
        out.close();
    }
}
