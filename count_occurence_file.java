Write a java program to count the occurrence of a particular word in a file. 
Assume that the files are text files. Write each file name, along with the 
number of occurrences in that file, to standard output. If an error occurs while 
trying to read from the files, you should print an error message for that file.

import java.io.BufferedReader; 
import java.io.FileReader; 
 
public class CountWordFile 
{ 
 public static void main(String[] args) throws Exception { 
 String line; 
 int count = 0; 
 
 //Opens a file in read mode 
 FileReader file = new FileReader("C:\\Users\\acer pc\\Desktop\\ASSG.tx
t"); 
 BufferedReader br = new BufferedReader((file)); 
 
 //Gets each line till end of file is reached 
 while((line = br.readLine()) != null) { 
 //Splits each line into words 
 String words[] = line.split(" "); 
 //Counts each word 18BCE0506
 count = count + words.length; 
 } 
 
 System.out.println("Number of words present in given file: " + count);
 
 br.close(); 
 } 
} 
