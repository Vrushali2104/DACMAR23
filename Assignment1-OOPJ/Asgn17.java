class Asgn17
{
     public static void main(String args[])
    {
        Integer i = new Integer("100");
        byte b1= i.byteValue();
        System.out.println(b1);

        
        short s1= i.shortValue();
        System.out.println(s1);

        int i1= i.intValue();
        System.out.println(i1);

        long l= i.longValue();
        System.out.println(l);

        float f= i.floatValue();
        System.out.println(f);

        double d= i.doubleValue();
        System.out.println(d);
    }

}