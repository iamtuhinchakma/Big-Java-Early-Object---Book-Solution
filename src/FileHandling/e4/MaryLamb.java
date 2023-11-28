package FileHandling.e4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MaryLamb {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        String fileName1 = null;
        if(args.length == 1){
            fileName1 = args[0];
        } else {
            System.out.println("Please enter the file name for input: ");
            fileName1 = in.next();
        }

        System.out.println("Please enter the file name for Output: ");
        String fileName2 = in.next();

        in.close();
        //Reading and Writing
        Scanner inFile = new Scanner(new File(fileName1));
        PrintWriter out = new PrintWriter(fileName2);
        int numberOfLines = 1;
        while(inFile.hasNext()){
            out.println("/* " + numberOfLines + " " + "*/" + inFile.nextLine());
            numberOfLines++;
        }
        inFile.close();
        out.close();
    }
}
