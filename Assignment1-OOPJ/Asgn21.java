class Asgn21
{
     public static void main(String args[])
    {
        Long l = new Long("100");
        byte b1= l.byteValue();
        System.out.println(b1);

        
        short s1= l.shortValue();
        System.out.println(s1);

        int i1= l.intValue();
        System.out.println(i1);

        long l1= l.longValue();
        System.out.println(l1);

        float f= l.floatValue();
        System.out.println(f);

        double d= l.doubleValue();
        System.out.println(d);
    }

}