Write a java program for the conference registration using string array. The number of sessions conducted is 2. Name the sessions according to your conveyance. Get the Register no for students for Session 1 and store it in one array. Compare with the registrations done for Session 2 and check for duplicate entry. No students are allowed to register for both the events, IF so kindly throw an error message and print the same.

import java.util.*;
 class da1q3 {  
    public static  void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the number of students allowed for sesssion 1");
        n1=ob.nextInt();
        System.out.println("Enter the number of students allowed for sesssion 2");
        n2=ob.nextInt();
        String[] s1 =new String[n1];
        String[] s2 =new String[n2];
        System.out.println("To Register for Session 1 enter your Registration number");
        for(int i=0;i<n1;i++)
        {
            s1[i]=ob.next();
        }
        System.out.println("To Register for Session 2 enter your Registration number");
        for(int i=0;i<n2;i++)
        {
            s2[i]=ob.next();
        }
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(s1[i].equals(s2[j]))
              System.out.println(s1[i]+" can only register for any one of the sessions "); }
        }
        System.out.println("Students are registered succesfully");
    }
}
