package FileHandling.e11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseLinesV3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = in.nextLine();


        // Read the original file contents
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        //FileReader reader = new FileReader(new File(filename));
        String line;
        List<String> lines = new ArrayList<>();
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        // Reverse each line
        List<String> reversedLines = new ArrayList<>();
        for (String l : lines) {
            reversedLines.add(new StringBuilder(l).reverse().toString());
        }

        // Overwrite the file with the reversed lines
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String l : reversedLines) {
                writer.write(l + "\n");
            }
        }
    }
}

