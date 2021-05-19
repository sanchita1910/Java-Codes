Develop a java application that creates 10 Rock objects and saves these in an array. Randomly select a mass between 1 and 10 kgms for each rocks as it is created. After all rocks have been created, display their individual mass and the total mass of all rocks.
  import java.util.Random;
    class abc{
        int cal(int i1){
            int min=1;
            int max=9;
            int value=(int)(Math.random() * (max - min + 1) + min); 
            System.out.println("Mass of Rock "+i1+" is: "+value+" kgms");
            return value;        }      } 
    public class da1q1 {
        public static void main(String arg[]){
        
            abc s1[]=new abc[10];
            int sum=0;
            
            for(int i=0;i<10;i++){
                s1[i]=new abc();
                int b=s1[i].cal(i);
                sum=sum+b;
            }
            System.out.print("Total sum is: ");
            System.out.println(sum+" kgms");
        }  }
