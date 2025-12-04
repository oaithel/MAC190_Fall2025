package com.mac190.files;

import java.io.*;
import java.util.Scanner;

/*
Assume you have a file with data in the following format
John Second 2345 23.4
Felicia Felix 4565 12.6
Ali Mamdamar  2345  10.4

(first name followed by last name then SSN and then time )
You want to create another file from this so that it's organized
differently as follows

S: 2345 F: John L: Second T: 23.4
S: 4565 F: Felicia L: Felix T: 12.6
S: 2345 F: Ali L: Mamdamar T: 10.4

The file name will be given by the user. Create an output file
without the same name with _out added to the file. For instance
if the input file name is data.txt, the the output file name should be
data_out.txt

C:\\Users\\B306_INSTRUCTOR\\IdeaProjects\\MAC190_Fall2025\\data.txt
 */
public class fileExample2 {
    public static void main(String[] args) {
        //get the file name from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the file name: ");
        String fileName = sc.nextLine();
        //create a File object with the file name
        File inFile = new File(fileName);
        //check the file exists otherwise exit
        if(!inFile.exists()){
            System.out.println(fileName +" does not exist");
            System.exit(1);
        }
        //create the filename for the output file
            //split the fileName at the dot, take the firt string
            //add to it "_out.txt"
        String[] result = fileName.split("\\.");
        String outFileName = result[0] + "_out.txt";
        try {
            //create a fileReader for the inout
            FileReader fr = new FileReader(inFile);
            //create a file writer for the output
            FileWriter fw = new FileWriter(outFileName);
            //create a Scanner for the input using the filereader
            Scanner inFileScan = new Scanner(fr);
            //create a BufferedWriter for the output using the filewriter
            BufferedWriter bw = new BufferedWriter(fw);
            //go into loop as long as the scanner has next
            while(inFileScan.hasNext()) {
                //read a firstName, then a last name then an integer, then a doubler
                String fName = inFileScan.next();
                String lName = inFileScan.next();
                int ssn = inFileScan.nextInt();
                double t = inFileScan.nextDouble();
                // Write the data to the output file in the correct form
                bw.write("S: " + ssn + "\t" + "F: " + fName +  "\t" + " L:" + lName + "\t" + "T: " + t +"\n");
            }
            bw.close();
            inFileScan.close();
        }catch(IOException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
