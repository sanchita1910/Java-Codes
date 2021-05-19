1 ) Write a java program to count the number of lines in a file. Assume that 
the files are text files. If an error occurs while trying to read from the files, you 
should print an error message for that file. 
Also perform the following:-
• Get the list of all file/directory name for the current location 
• Check if a file or directory has read and write permission 
• Get last modified time of a file and size of the file


package Shape;
import java.io.*;
/**
* This program reports the number of lines in each of the files
* that are specified as command line arguments. The files are
* assumed to be text files. If a file does not exist, or if
* some error occurs when the attempt is made to read the file,
* then an error message is printed (but the other files are
* still processed).18BCE0506
*/
public class LineCounts {
 /**
 * The main() routine simply gets the file names from the
 * command line and calls the countLines() routine to process
 * each name. Since any errors are handled in the countLines()
 * routine, the main program will continue after an error occurs
 * while trying to process one of the files.
 */ 
 
 public static void main(String[] args) throws IOException {
 if (args.length == 0) {
 // This program must have at least one command-line
 // argument to work with.
 System.out.println("Usage: java LineCounts <file-names>");
 return;
 }
 
 for (int i = 0; i < args.length; i++) {
 System.out.print(args[i] + ": ");
 countLines(args[i]);
 }
 
 } // end main()
 
 
 /**
 * Count the number of lines in the specified file, and
 * print the number to standard output. If an error occurs
 * while processing the file, print an error message instead.
 * Two try..catch statements are used so I can give a
 * different error message in each case.
 */
 private static void countLines(String fileName) {
 
 try(BufferedReader in = new BufferedReader( new FileReader("C:\\Users\\a
cer pc\\Desktop\\ASSG.txt") )) {
 
 int lineCount = 0; // number of lines read from the file
 
 String line = in.readLine(); // Read the first line.
 while (line != null) {
 lineCount++; // Count this line.
 line = in.readLine(); // Read the next line.18BCE0506
 }
 System.out.println(lineCount + " lines");
 }
 catch (FileNotFoundException e) {
 System.out.println("Error. Can't open file.");
 }
 catch (Exception e) {
 System.out.println("Error. Problem with reading from file.");
 }
 
 } // end countLines()
 
} // end class LineCounts
