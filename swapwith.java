import java.util.*;
public class swapwith
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a & b");
        a=sc.nextInt();
        b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Swapped A = "+a);     
        System.out.println("Swapped B = "+b);
    }
}