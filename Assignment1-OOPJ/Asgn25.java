class Asgn25
{
     public static void main(String args[])
    {
        Float f = new Float("100.0");
        byte b1= f.byteValue();
        System.out.println(b1);

        
        short s1= f.shortValue();
        System.out.println(s1);

        int i1= f.intValue();
        System.out.println(i1);

        long l1= f.longValue();
        System.out.println(l1);

        float f1= f.floatValue();
        System.out.println(f1);

        double d= f.doubleValue();
        System.out.println(d);
    }

}