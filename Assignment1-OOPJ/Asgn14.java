class Asgn14
{
     public static void main(String args[])
    {
        Short sh = new Short("15");
        byte b1= sh.byteValue();
        System.out.println(b1);

        
        short s1= sh.shortValue();
        System.out.println(s1);

        int i= sh.intValue();
        System.out.println(i);

        long l= sh.longValue();
        System.out.println(l);

        float f= sh.floatValue();
        System.out.println(f);

        double d= sh.doubleValue();
        System.out.println(d);
    }

}