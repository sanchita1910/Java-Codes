Write a program that prompts the user to enter the name of the bowler in 
the command line interface. Display the wickets, econ and balls_per_wicket 
from the wickets.txt file. Display the Player Not found Info if the player search 
name is not available. 

Dataset Link:
https://drive.google.com/file/d/1BIpIW68FdrRBYqGueupvIlCLYOnshlp5/view?usp=sharing
Sample Output:-
Enter the Name of the Player : JJ Bumrah 
Wickets: 56 Econ : 1.215271389 
Balls per wicket: 19.41071429

import java.io.*;
import java.util.*;
public class BowlerDetails
{
 public static void main(String[] args) throws IOException
 {
 Scanner s = new Scanner(System.in);
 File file = new File("wickets.txt");
 FileInputStream fileStream = new FileInputStream(file);
 InputStreamReader input = new InputStreamReader(fileStream);
 BufferedReader reader = new BufferedReader(input);
 
 String line, player, name;
 byte found = 0;
 
 System.out.println("Which Bowler to be searched? ");
 player = s.nextLine();
 String[] wordList = new String[50];
 while((line = reader.readLine()) != null)
 {
 wordList = line.split("\\s+"); 
 name = wordList[0] + " " + wordList[1];
 if(player.equals(name))
 {
 System.out.println("Bowler: " + name);
 System.out.println("Wickets: " + wordList[2]);
 System.out.println("Economy: " + wordList[3]);
 System.out.println("Balls per wicket: " + wordList[4]);
 found = 1;18BCE0506
 break;
 }
 }
 
 if(found == 0)
 {
 System.out.println("Player not found!");
 }
 }
}
