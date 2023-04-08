class ElectricityBill{
    String customerName;
    double unitsConsumed;
    double billAmount;

    ElectricityBill()
    {
        this.customerName="";
        this.unitsConsumed=0;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName=customerName;
    }
    public void setUnitsConsumed(double unitsConsumed)
    {
        this.unitsConsumed=unitsConsumed;
    }
    public String getCustomerName()
    {
        return this.customerName;
    }
    public double getUnitsConsumed()
    {
        return this.unitsConsumed;
    }
    public double calculateBillAmount()
    {
        if(this.unitsConsumed<=100)
        {
            return (billAmount = this.unitsConsumed*5);
        }
        if(this.unitsConsumed>100 && this.unitsConsumed<=200)
        {
            return (billAmount = this.unitsConsumed*7);
        }
        else
        {
            return (billAmount = this.unitsConsumed*10);
        }
    }
}
class Program{
    public static void main(String args[])
    {
        ElectricityBill eb = new ElectricityBill();
        eb.setCustomerName("Vrushali Chamatkar");
        eb.setUnitsConsumed(120.54);
       
        System.out.println("Customer Name is :"+eb.getCustomerName());
        System.out.println("Units Consumed are :"+eb.getUnitsConsumed());
        System.out.println("Bill Amount is :"+eb.calculateBillAmount());
        
    }
}