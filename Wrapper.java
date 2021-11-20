class Wrapper
{
    public static void main(String args[])
    {
        int i=12;long l=3592L;float f=12.45F;double d=0.001432D;
        String s1="67", s2="9297", s3="8.61", s4="1.6172453";
        int n1=Integer.parseInt(s1);
        long n2=Long.parseLong(s2);
        float n3=Float.parseFloat(s3);
        double n4=Double.parseDouble(s4);
        String str1=Integer.toString(i);
        String str2=Long.toString(l);
        String str3=Float.toString(f);
        String str4=Double.toString(d);
        System.out.println("Int to String: "+str1);
        System.out.println("Long to String: "+str2);
        System.out.println("Float to String: "+str3);
        System.out.println("Double to String: "+str4);
        System.out.println("String to Int: "+n1);
        System.out.println("String to long: "+n2);
        System.out.println("String to float: "+n3);
        System.out.println("String to double: "+n4);
    }
}