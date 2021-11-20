import java.util.*;
public class Triangle
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height & Base");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a*b/2;
        System.out.println("Area of a Triangle = "+c);        
    }
}