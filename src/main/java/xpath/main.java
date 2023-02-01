package xpath;

import sun.awt.image.ImageWatched;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No query file provided");
            System.exit(1);
        }
        if (args.length > 1) {
            System.out.println("More than one parameters provided");
            System.exit(1);
        }
        String path = args[0];
        List<String> queries = new LinkedList<>();
        try {
            File f = new File(path);
            Scanner s = new Scanner(f);
            System.out.println("The read queries are: ");
            while (s.hasNextLine()) {
                String line = s.nextLine();
                queries.add(line);
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + path);
            System.err.println(e);
            System.exit(2);
        }
    }
}
