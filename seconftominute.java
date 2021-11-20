import java.util.*;
public class seconftominute
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        System.out.println("Enter Seconds to convert to minutes:");
        a=sc.nextInt();
        b=a/60;
        System.out.println("Converted Minutes="+b);
    }
}