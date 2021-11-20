import java.util.*;
public class tri3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt(); 
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println(  );
        }
    }
}