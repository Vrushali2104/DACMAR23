class Asgn9
{
     public static void main(String args[])
    {
        byte b = 14;
        byte b1= Byte.valueOf(b);
        System.out.println(b1);

        short s1= Short.valueOf(b);
        System.out.println(s1);

        int i= Integer.valueOf(b);
        System.out.println(i);

        long l= Long.valueOf(b);
        System.out.println(l);

        float f= Float.valueOf(b);
        System.out.println(f);

        double d= Double.valueOf(b);
        System.out.println(d);
    }

}