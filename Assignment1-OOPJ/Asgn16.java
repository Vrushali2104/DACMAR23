class Asgn16
{
    public static void main(String args[])
    {
        int num=10;
        String str = Integer.toString(num);
        System.out.println(str); 

        int num1= Integer.valueOf(num);
        System.out.println(num1); 

        String s= "20";
        int num2= Integer.valueOf(s);
        System.out.println(num2); 

        String s1= Integer.toBinaryString(num);
        System.out.println(s1); 

        String s2= Integer.toHexString(num);
        System.out.println(s2); 

        String s3= Integer.toOctalString(num);
        System.out.println(s3); 
    }

}