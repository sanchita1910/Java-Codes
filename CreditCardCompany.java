Q) Create class Customer with below attributes: 
   custId 
   accountId 
   creditCardCharges
   Create another class CreditCardCompany which has a method which takes Customer object as parameter and returns the payback amount for the credit card charges value for that customer. Use below logic to calculate payback amount:
   a) 0.25% for charges up to Rs. 500. 
   b) 0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500), 
   c) 0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500), 
   d) 1.0% for charges above Rs2500. 
   Thus, a customer who charges Rs. 400 a year receives Rs.1.00, which is 0.25 * 1/100 * 400, and one who charges Rs1, 400 a year receives Rs. 5.75, which is 1.25 = 0.25 * 1/100 * 500 for the first Rs. 500 and 0.50 *1/100 * 900 = 4.50 for the next Rs. 900. 
   Create another class as CreditCardDemo which will have main method. Within main method, create object of CreditCardCompany. Create 5 customer objects with relevant data. Call the method to return payback amount for each customer and display the same. 
   Follow class outline diagram as given below. Ensure class attributes are private and other methods are public.
 
   Note: For Customer class constructor, first parameter is for custId and second is for accId.
  
  Solution -
  
  
  Customer.java 
  
  public class Customer{
    private String custId;
    private String accountId;
    private double creditCardCharges;
      
    public Customer(String custId, String accountId, double charges){
    this.custId = custId;
    this.accountId = accountId;
    creditCardCharges = charges;    }

    // getter setter for private members 

    public String getCustId(){
    return custId;
    }
    public String getAccountId()  {
    return accountId;      }  

    public double getCreditCardCharges()  {
    return creditCardCharges;

    public void setCreditCardCharges(double charges){
    creditCardCharges = charges;    }          }
    
    
    
CreditCardCompany. java



public class CreditCardCompany{
    public double getPayBackAmount(Customer customer){
    double charges = customer.getCreditCardCharges();
    double payback = 0;
      
    // if charges is 0 or negative
    if(charges <= 0)
    return 0.0;
      
    // calculation for 0 - 500
    if(charges <= 500){
    return charges * 0.25 / 100;
    }
    else{
    payback = 500 * 0.25 / 100;
    charges -= 500;
    }
      
    // calculation for 501 - 1500
    if(charges <= 1000){
    return payback + (charges * 0.5 / 100);
    }
    else{
    payback += (1000 * 0.5 / 100);
    charges -= 1000;
    }
      
    // calculation for 1501 - 2500
    if(charges <= 1000){
    return payback + (charges * 0.75 / 100);
    }
    else{
    payback += (1000 * 0.75 / 100);
    charges -= 1000;
    }
      
    // calculation for 2501 and above
    return payback + (charges * 1.0 / 100);
    }
    }


CreditCardDemo.java

public class CreditCardDemo {
    public static void main(String[] args) {
    // creating customer objects
    Customer cust1 = new Customer("C1", "ACC1", 9000.00);
    Customer cust2 = new Customer("C2", "ACC2", 5600.00);
    Customer cust3 = new Customer("C3", "ACC3", 8000.00);
    Customer cust4 = new Customer("C4", "ACC4", 10500.00);
    Customer cust5 = new Customer("C5", "ACC5", 15800.00);
      
    // creating Credit card company object
    CreditCardCompany company = new CreditCardCompany();
      
    // output for indivisual cutomers in new line
    System.out.println("Customer 1 has " + cust1.getCreditCardCharges() + " charges, payback amount is: " + company.getPayBackAmount(cust1));
    System.out.println("Customer 2 has " + cust2.getCreditCardCharges() + " charges, payback amount is: " + company.getPayBackAmount(cust2));
    System.out.println("Customer 3 has " + cust3.getCreditCardCharges() + " charges, payback amount is: " + company.getPayBackAmount(cust3));
    System.out.println("Customer 4 has " + cust4.getCreditCardCharges() + " charges, payback amount is: " + company.getPayBackAmount(cust4));
    System.out.println("Customer 5 has " + cust5.getCreditCardCharges() + " charges, payback amount is: " + company.getPayBackAmount(cust5));    }    }
