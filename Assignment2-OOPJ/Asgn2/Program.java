import java.util.Scanner;

class BmiCalculator{
    double height;
    double weight;

    BmiCalculator()
    {
        this.height= 0;
        this.weight=0;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }
    public void setWeight(double weight)
    {
        this.weight= weight;
    }
    public double getHeight()
    {
        return this.height;
    }
    public double getWeight()
    {
        return this.weight;
    }
    public double calculateBMI()
    {
        double bmi;
        bmi=weight/(height*height);
        return bmi;
    }

}
class Program
{
    public static void main(String args[])
    {
        BmiCalculator bc = new BmiCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Height in m :");
        bc.setHeight(sc.nextDouble());

        System.out.println("Weight in kg :");
        bc.setWeight(sc.nextDouble());

        double bmi=bc.calculateBMI();
        System.out.println("BMI :"+bmi);

    }
}