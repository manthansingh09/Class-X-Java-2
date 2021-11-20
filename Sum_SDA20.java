import java.util.*;
public class Sum_SDA20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,s=0;
        int m[]=new int[20];
        for(i=0;i<20;i++)
        {
            System.out.print("Enter Number "+(i+1)+" : ");
            m[i]=sc.nextInt();
        }
        for(i=0;i<20;i++)
        {
        if(m[i]%3==0||m[i]%5==0)
        {
            s=s+m[i];
        }
    }
        System.out.println("Sum is: "+s);
    }
    
}