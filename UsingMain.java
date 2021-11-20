import java.util.*;
public class UsingMain
{
    int m,n,s,d;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No 1: ");
        m=sc.nextInt();
        System.out.println("Enter No 2: ");
        n=sc.nextInt();
    }
    void calculation()
    {
        s=m+n;
        d=m-n;
    }
    void output()
    {
        System.out.println("Sum: "+s);
        System.out.println("Difference: "+d);
    }
    public static void main(String args[])
    {
        UsingMain ob=new UsingMain();
        ob.input();
        ob.calculation();
        ob.output();
    }
}