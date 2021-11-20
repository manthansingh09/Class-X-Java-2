import java.util.*;
public class SimpleI
{
    int principalant;
    double rate,time,si;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount, Rate and Time");
        principalant=sc.nextInt();
        rate=sc.nextInt();
        time=sc.nextInt();
    }
    void calc()
    {
        si=principalant*(rate/100)*time;
    }
    void display()
    {
        System.out.println("The Simple Interest is: "+si);
    }
}