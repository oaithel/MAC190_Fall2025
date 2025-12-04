package com.mac190.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
Input files are input from which we read data.
Create a File object using the name of the file
check to make sure the file exists
create a FileReader object using the File object
create a Scanner using the fileReader object.
Use the Sacanner as if you are using it to read data
from the keyboard
C:\\Users\\B306_INSTRUCTOR\\IdeaProjects\\MAC190_Fall2025\\data.txt
 */
public class InputFiles {
    public static void main(String[] args) {
        File inFile = new File("C:\\Users\\B306_INSTRUCTOR\\IdeaProjects\\MAC190_Fall2025\\data.txt");
        if(!inFile.exists()){
            System.out.println("File does not exist");
            System.exit(1);
        }
        try{
            FileReader fr = new FileReader(inFile);
            //create a Scanner
            Scanner sc = new Scanner(fr);
          /*  while(sc.hasNext()){
                System.out.print(sc.next() +" ");
            }
           */
            int num = sc.nextInt();
            String street = sc.next();
            double d = sc.nextDouble();
            System.out.println(num +" " + street + " " + d);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
