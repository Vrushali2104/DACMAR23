class Asgn28
{
    public static void main(String args[])
    {
        Double d = new Double("25.0");
        String str = d.toString();
        System.out.println(str); 

        double d1 = 50.23;
        double d2= Double.valueOf(d1);
        System.out.println(d2); 

        String s= "20";
        double d3 = Double.valueOf(s);
        System.out.println(d3); 

        String s1= Double.toBinaryString(d1);
        System.out.println(s1); 

        String s2= Double.toHexString(d1);
        System.out.println(s2); 

        String s3 = Double.toOctalString(d1);
        System.out.println(s3); 
    }

}