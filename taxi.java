import java.util.*;
public class taxi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int km,fare;
        km=sc.nextInt();
        if(km<=3)
        {
            System.out.println("Fare is Rs.85");
        }
        else if(km<=11)
        {
            fare=km*7;
            System.out.println("Fare is Rs. "+fare);
        }
        else if(km<=23)
        {
            fare=km*10;
            System.out.println("Fare is Rs. "+fare);
        }
        else
        {
            fare=km*3;
            System.out.println("Fare is Rs. "+fare);
        }
        System.out.println("Taxi No. 1221");
        System.out.println("Distance Covered is "+km+"KM");
    }
}