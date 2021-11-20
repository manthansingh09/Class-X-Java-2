import java.util.*;
public class velocity
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double u,a,s,v;
        System.out.println("Enter the values of u,a,s");
        u=sc.nextInt();
        a=sc.nextInt();
        s=sc.nextInt();
        v=Math.sqrt(Math.pow(u,2)+2*a*s);
        System.out.println("Velocity"+v);
    }
}
