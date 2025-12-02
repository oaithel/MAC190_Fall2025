package com.mac190.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IntroFiles {
    public static void main(String[] args) {
        //The File object allows you to manage files and directories.
        File myFile = new File("C:\\Users\\momo\\LAGCC\\courses\\Mac190\\test.txt");
        System.out.println("Is it a directory? " + myFile.isDirectory());
        System.out.println("Is it a file? " + myFile.isFile());
        System.out.println("Does it exist? " + myFile.exists());
        //If yu want to create a file and to save data into the file, we call that
        //an output file, we use FileWriter and BuffredWriter like this:

        //Create a FileWriter in order to write data to a file.
        //FileWriter accepts a path as a string or a File object as input.
        //FileWriter fw = new FileWriter("C:\\Users\\momo\\LAGCC\\courses\\Mac190\\test.txt");
       try {
           FileWriter fw = new FileWriter(myFile);
           //create a BufferedWriter
           BufferedWriter bw = new BufferedWriter(fw);
           //now ou can write sentences to the file
           bw.write("This is the first line\n");

           bw.write("This is the second line\n");
           bw.write("This is the third line!");
           bw.close();
           fw.close();

       }catch(IOException e) {
           System.out.println("Caught IOException: " + e.getMessage());
         //  e.printStackTrace();
       }

    }

}
