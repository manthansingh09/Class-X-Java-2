import java.util.*;
public class spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,sum=0,product=1;
        System.out.println("Enter The Number");
        num=sc.nextInt();
        while(num>0)
        {
            int dig=num%10;
            sum=sum+dig;
            product=num%sum;
            
        }
        if(product==0)
        {
            System.out.println("Its a Niven");
        }
        else
        {
            System.out.println("Its not a SPY");
        }
    }
}