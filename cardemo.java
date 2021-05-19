Create class Car with below attributes: 
• make 
• model 
• passengerCapacity 
• onRoadPrice 
Create another class CarDemo which has main method. Create another method - getBestCar in this class which will take four car objects and additional parameter as compareType. Value of this parameter can be ‘c’ or ‘p’, where ‘c’ stands for capacity of passengers and ‘p’ stands for on road price. This method will return make and model name for highest value of ‘c’ or ‘p’ (with – character in between. E.g for make – Hyundai and model – santro, method should return “Hyundai-santro”). Create four objects of Car class in main method and drive it through getBestCar method. Use inheritance to code this program


public class Car
{
    public String make, model;
    int passengerCapacity;
    double onRoadPrice;
    public Car(String make1,String model1,int pc, double price)
    {
        make=make1;
        model=model1;
        passengerCapacity=pc;
        onRoadPrice=price;
    }
}
class CarDemo {
    
    public static void getBestCar(Car c1, Car c2, Car c3, Car c4,char ct){
        int maxc,m=0;
        double maxp;
        if(ct=='c'){
          maxc=c1.passengerCapacity;
          m=1;
          if(c2.passengerCapacity> maxc){
          maxc = c2.passengerCapacity;
          m=2;
        }
          if(c3.passengerCapacity> maxc){
              m=3;
          maxc = c3.passengerCapacity;}
          if(c4.passengerCapacity> maxc){m=4;
          maxc = c4.passengerCapacity;}
      }
      if(ct=='p')
      {
          maxp=c1.onRoadPrice;
          if(c2.onRoadPrice > maxp){
              m=2;
         maxp= c2.onRoadPrice;}
         if(c3.onRoadPrice > maxp){
            m=3;
       maxp= c3.onRoadPrice;}
       if(c4.onRoadPrice > maxp){
        m=4;
   maxp= c4.onRoadPrice;}
         
      }
      switch(m)
      { case 1: System.out.println(c1.make +"-"+ c1.model);
        break;
        case 2: System.out.println(c2.make +"-"+ c2.model);
        break;
        case 3: System.out.println(c3.make +"-"+ c3.model);
        break;
        case 4: System.out.println(c4.make +"-"+ c4.model);
        break;
      }
    }
public static void main(String args[]){

   Car c1 =new Car("Hyundai","Santro",4,300);
   Car c2 =new Car("BMW","Mercilaego",2,20000);
   Car c3=new Car("Mahindra","XuV 500",7,8000);
   Car c4=new Car("Maruti Suzuki","WagonaR",5,900);
   getBestCar(c1,c2,c3,c4,'p');
   getBestCar(c1,c2,c3,c4,'c');
}
}
