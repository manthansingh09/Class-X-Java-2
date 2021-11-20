import java.util.*;
public class SumScanArr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element Needed: ");
        int a=sc.nextInt();
        int m[]=new int[a];
        System.out.println("Enter Data: ");
        for(int j=0;j<m.length;j++)
        {
            m[j]=sc.nextInt();
        }
        int i,p,sum=0;
        p=m.length;
        for(i=0;i<p;i++)
        {
            sum=sum+m[i];
        }
        System.out.println("Output: "+sum);
    }
}
