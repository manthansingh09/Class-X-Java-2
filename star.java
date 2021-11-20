import java.util.*;
public class star
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt(); 
        for(int i=0;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}