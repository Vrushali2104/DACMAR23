class Asgn13
{
     public static void main(String args[])
    {
        short s = 123;
        String str = Short.toString(s);
        System.out.println(str);

        short s1= 111;
        short s2= Short.valueOf(s1);
        System.out.println(s2); 

        String str1 = new String ("123");
        Short s3 = Short.valueOf(str1);
         System.out.println(s3); 
    }
}