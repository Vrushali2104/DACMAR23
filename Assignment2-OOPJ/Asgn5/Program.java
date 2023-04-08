import java.util.Scanner;
class Telephone{
    String customerName;
    String phoneNumber;
    int numberOfCallsMade;
    double durationOfCalls;
    
    public void setCustomerName(String customerName)
    {
         this.customerName = customerName;
    }
    public void setPhoneNumber(String phoneNumber)
    {
         this.phoneNumber = phoneNumber;
    }
    public void setNumberOfCallsMade(int numberOfCallsMade)
    {
         this.numberOfCallsMade = numberOfCallsMade;
    }
    public void setDurationOfCalls(double durationOfCalls)
    {
         this.durationOfCalls= durationOfCalls;
    }
   public double calculateBill()
    {
        double telephoneBill;
       if(this.durationOfCalls>=1 && this.numberOfCallsMade<=100)
       {
        return telephoneBill= this.numberOfCallsMade*50;
       }
       else if(this.durationOfCalls>=1 && this.numberOfCallsMade>100)
       {
        return telephoneBill =this.numberOfCallsMade*25;
       }
       return 0;
    }

}
class Program{
    public static void main(String args[])
    {
        Telephone t = new Telephone();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Customer Name :");
        t.setCustomerName(sc.nextLine());
        System.out.println("Phone Number :");
        t.setPhoneNumber(sc.nextLine());
        System.out.println("Number of calls made :");
        t.setNumberOfCallsMade(sc.nextInt());
        System.out.println("Duration of calls in minutes :");
        t.setDurationOfCalls(sc.nextDouble());

        System.out.println("Telephone Bill :"+t.calculateBill());

    }

}