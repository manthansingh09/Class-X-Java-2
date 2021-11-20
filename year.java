import java.util.*;
public class year
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter Year");
        year=sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                System.out.println("Its a Centuary Leap Year");
            }
            else
            {
                System.out.println("Its a Leap Year");
            }
        }
        else if(year%100==0)
        {
            System.out.println("Its a Centuary Year but not a leap year");
        }
        else
        {
            System.out.println("Neither Leap Year Nor Centuary Year");
        }
    }
}