import java.util.*;
public class tempchange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice;
        double c,f;
        System.out.println("For C to F Press 1 and For F to C Press 2");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.print("Enter Fahrenheit= ");
            f=sc.nextInt();
            c=5/9*(f-32);
            System.out.println("Celsius= "+c);
            break;
            case 2:
            System.out.print("Enter Celsius= ");
            c=sc.nextInt();
            f=1.8*c+32;
            System.out.println("Fahrenheit= "+f);
            break;
            default:
            System.out.println("Wrong Input");
            break;
        }
    }
}