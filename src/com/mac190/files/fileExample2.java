package com.mac190.files;
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


 */
public class fileExample2 {
    public static void main(String[] args) {
        //get the file name from the user

        //create a File object with the file name

        //check the file exists otherwise exit
        //create the filename for the output file
            //split the fileName at the dot, take the firt string
            //add to it "_out.txt"
        //create a fileReader for the inout
        //create a file writer for the output
        //create a Scanner for the input using the filereader
        //create a BufferedWriter for the output using the filewriter

        //go into loop as long as the scanner has next
            //read a firstName, then a last name then an integer, then a doubler
            // Write the data to the output file in the correct form
    }
}
