package com.mac190.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/*
Write a program that accepts the absolute path of a file.
Create the file and ask the user to input lines of text and the end of the text
will be signaled by a . on an empty line.
Example:
Enteer the file name: C:\\Users\\momo\\LAGCC\\courses\\Mac190\\test.txt
Enter you text, end it with a dot on an empty line:
Hello there,
This is my text patati patata
dfjhdf df;lkdfh
sdfk;ooso'  and so on
 .
 You text has been saved to the file.
 (If you check the file you should see the ext without the dot at the end.
 */
public class filesExample {
    public static void main(String[] args) {

        //create a Scanner
        Scanner sc = new Scanner(System.in);
        //ask the user to input the name of the file
        System.out.println("Enter the file name: ");
        //get the name of the file in fileName
        String fileName = sc.nextLine();

        try {
            //create a fileWriter using the file name
            FileWriter fw = new FileWriter(fileName);
            //create a BufferedWriter using the fileWriter
            BufferedWriter bw = new BufferedWriter(fw);
            //ask the user for the text
            //loop as long as the input line is not "."
            System.out.println("Enter text adn end it with dot on an empty line\n");
            //end of loop close BufferedWriter and FileWriter
            String line = sc.nextLine();
            while(!line.trim().equals(".")){
                bw.write(line + "\n");
                line = sc.nextLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}
//C:\\Users\\momo\\LAGCC\\courses\\Mac190\\data.txt