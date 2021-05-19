Simulate a set of grasshoppers jumping around in a box. Each GrassHoppers jumps to a different location every 2 to 10 seconds. Display the new location of the Grasshopper after each of these jumps. (Use Multithreading).
  
  class GrassHopper extends Thread{
    int a;
    public GrassHopper(int a){
        this.a=a;
        start();            
    }
    
    public void run(){
        int s1=0,s2=0,s3=0,s4=0,s5=0;
        for(int i=0;i<4;i++){
         try{
                
            if(a==1){
                s1=s1+1;
                 System.out.println("Jumping: "+"GrassHopper 1 "+"New Location: "+(s1+i));
                    System.out.println("Rest Phase : "+"GrassHopper 1 ");
                    Thread.sleep(2000,900);
                }
          else if(a==2){
              s2=s2+2;
 		System.out.println("Jumping: "+"GrassHopper 2 "+"New Location: "+(s2+i));
                    System.out.println("Rest Phase : "+"GrassHopper 2 ");
                    Thread.sleep(4000,250);
                }
                
         else if(a==3){
                    s3=s3+3;
                System.out.println("Jumping: "+"GrassHopper 3 "+"New Location: "+(s3+i));
                    System.out.println("Rest Phase : "+"GrassHopper 3 ");
                    Thread.sleep(6000,500);
                }
          else if(a==4){
                    s4=s4+4;
                 System.out.println("Jumping: "+"GrassHopper 4 "+"New Location: "+(s4+i));
                    System.out.println("Rest Phase : "+"GrassHopper 4 ");
                    Thread.sleep(8000,700);
                }
           else if(a==5){
                    s5=s5+5;
               System.out.println("Jumping: "+"GrassHopper 5 "+"New Location: "+(s5+i));
                    System.out.println("Rest Phase : "+"GrassHopper 5 ");
                    Thread.sleep(10000,100);
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    
    
}

class Grasshopper{
    public static void main(String arg[]){
        
        Grasshopper g1=new Grasshopper(1);
        Grasshopper g2=new Grasshopper(2);
        Grasshopper g3=new Grasshopper(3);
        Grasshopper g4=new Grasshopper(4);
        Grasshopper g5=new Grasshopper(5);
    
    
    }

}
