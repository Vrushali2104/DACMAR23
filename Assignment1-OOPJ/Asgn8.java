class Asgn8
{
     public static void main(String args[])
    {
        byte b = 12;
        String str = Byte.toString(b);
        System.out.println(str);

        byte b1= 14;
        byte b2= Byte.valueOf(b1);
        System.out.println(b2);

        String s= "17";
        byte b3= Byte.valueOf(s);
        System.out.println(b3);

        
    }
}