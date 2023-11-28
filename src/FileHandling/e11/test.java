package FileHandling.e11;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

import static FileHandling.e11.ReverseLines.usage;

public class test {
    public static void main(String[] args) {
        String inputFileName = "";
        String outputFileName = "";

        if(args.length == 0){
            Scanner console = new Scanner(System.in);
            System.out.println("Enter input file name: ");
            inputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(console.next());

            System.out.println("Enter output file name: ");
            outputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(console.next());
            console.close();
        } else if(args.length == 2){
            inputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(args[0]);
            outputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(args[1]);
        } else {
            usage();
            return;
        }

    }
}
