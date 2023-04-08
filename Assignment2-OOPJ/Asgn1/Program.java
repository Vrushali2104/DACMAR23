import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.time.*;

class Program2
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date");
        String source = sc.nextLine();
        System.out.println("Enter hr");
        int hr = sc.nextInt();
        System.out.println("Enter min");
        int min = sc.nextInt();
        System.out.println("Enter sec");
        int sec = sc.nextInt();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        
        Date date = sdf.parse(source);

        int day = date.getDate();
        int month = date.getMonth()+1;
        int year = date.getYear()+1900;
        System.out.println(day+" / "+month+" / "+year+" "+hr+":"+min+":"+sec);

        if(hr>11)
        {
            int x= hr-12;
            System.out.println(month+" / "+day+" / "+year+" "+x+":"+min+":"+sec+" "+"PM");
        }
        else{
            System.out.println(month+" / "+day+" / "+year+" "+hr+":"+min+":"+sec+" "+"AM");
        }
         System.out.println(year+"/"+month+"/"+day+" "+hr+":"+min);


    }
}