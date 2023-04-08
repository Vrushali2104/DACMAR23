class Asgn20
{
    public static void main(String args[])
    {
        Long l = new Long("25");
        String str = l.toString();
        System.out.println(str); 

        long l1=50;
        long l2= Long.valueOf(l1);
        System.out.println(l2); 

        String s= "20";
        long l3 = Long.valueOf(s);
        System.out.println(l3); 

        String s1= Long.toBinaryString(l1);
        System.out.println(s1); 

        String s2= Long.toHexString(l1);
        System.out.println(s2); 

        String s3 = Long.toOctalString(l1);
        System.out.println(s3); 
    }

}