package FileHandling.e11;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
/*
Write a program that reads each line in a file, reverses its lines, and writes them to
another file. For example, if the file input.txt contains the lines
 */
public class ReverseLines {
    public static void main(String args[]) throws FileNotFoundException
    {
        // Construct a scanner to read in from the console and construct the inputFile
        // and outputFile names
        String inputFileName = "";
        String outputFileName = "";

        // Check for arguments
        if(args.length == 0)
        {
            Scanner console = new Scanner(System.in);

            System.out.print("Input file: ");
            inputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(console.next());

            System.out.print("Output file: ");
            outputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(console.next());

            console.close();
        }
        else if(args.length == 2)
        {
            inputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(args[0]);
            outputFileName += "C:\\Users\\User\\Desktop\\Java\\Big Java\\".concat(args[1]);
        }
        else
        {
            usage();
            return;
        }

        // Construct the PrintWriter and File Objects
        //File inputFile = new File(inputFileName);
        //Scanner in = new Scanner(inputFile);
        Scanner inFile = new Scanner(new File(inputFileName));
        PrintWriter out = new PrintWriter(outputFileName);

        // Process Input File
        ArrayList<String> lineArray = new ArrayList<String>();

        while(inFile.hasNextLine())
        {
            String line = inFile.nextLine();
            lineArray.add(line);
        }

        // Print the Array in reverse to the output file
        for(int i = lineArray.size() - 1; i >= 0; i--)
        {
            out.println(lineArray.get(i));
        }

        // Close the PrintWriter and Scanner objects
        inFile.close();
        out.close();
    }

    public static void usage()
    {
        System.out.println("Usage: java ReverseLines inFile outFile");
    }
}

