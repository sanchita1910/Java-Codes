Use an array to solve the weather problem. Get the input from the user for the city you live currently, the temperature for last 2 weeks in the month January 2021 (14 days).Write a java program to find the 3 hottest days, 3 coldest day and Average for the month. Print the values with the city details. 
Optional: Use math.Random Values ranging from 25 to 45 for temperature values.

  import java.util.*;
public class da1q2 {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int[] c= new int[14];
        int avg=0,temp;
        String city;
        System.out.println("Enter City name and temperatures of the past 2 weeks");
        city=ob.nextLine();
        for(int i=0;i<14;i++)
        {
            c[i]=ob.nextInt();
            avg=avg+c[i];
        }
        for(int j=0;j<13;j++)
        {
            for(int i=0;i<13;i++){
           if(c[i]<c[i+1])
           {
             temp=c[i+1];
             c[i+1]=c[i];
             c[i]=temp;
           }
        }  }
      System.out.println(" The weather details of city:"+ city +" are as follows-");
        System.out.println(" Max Temperature :- ");
        System.out.println(" Hottest day 1 temperature:- "+ c[0]);
        System.out.println(" Hottest day 2 temperature:- "+ c[1]);
        System.out.println(" Hottest day  3 temperature:- "+ c[2]);
        System.out.println(" Min Temperature :- ");
        System.out.println(" Coldest day 1 temperature:- "+ c[13]);
        System.out.println(" Coldest day 2 temperature:- "+ c[12]);
        System.out.println(" Coldest day 3 temperature:- "+ c[11]);
        System.out.println(" Average temperature:- "+ (avg/14));    }    }
