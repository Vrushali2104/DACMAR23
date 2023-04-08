class Asgn24
{
    public static void main(String args[])
    {
        Float f = new Float("25.0");
        String str = f.toString();
        System.out.println(str); 

        float f1=50.0f;
        float f2= Float.valueOf(f1);
        System.out.println(f2); 

        String s= "20";
        float f3 = Float.valueOf(s);
        System.out.println(f3); 

        String s1= Float.toHexString(f1);
        System.out.println(s1);  
    }

}