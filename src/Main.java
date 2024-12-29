
import Lexer.Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String[] s=["this","that"];

//        Lexer lexer =new Lexer(new String[]{"this","that"});

        // Check if the file path argument is passed
//        if (args.length < 1) {
//            System.out.println("Please provide a file path as an argument.");
//            return;  // Exit if no argument is provided
//        }

//        String filePath = args[0];  // Get the file path from the command-line argument

        ArrayList<String> file_data=new ArrayList<>();

        // Example using BufferedReader to read the file
        try (BufferedReader br = new BufferedReader(new FileReader(".\\main.agni"))) {
//            System.out.println(filePath);
            String line;
            while ((line = br.readLine()) != null) {

                if(!line.isEmpty())
                {

                file_data.add(line);
                }
//                System.out.println(line);  // Print each line of the file
            }
        } catch (IOException e) {
            error("Error reading the file: " + e.getMessage());
        }



        System.out.println(file_data.toString());

        Lexer lexer =new Lexer(file_data.toArray(new String[0]));
    }

    public static void error(String error_message)
    {
        System.out.println(error_message);
        System.exit(0);
    }
}