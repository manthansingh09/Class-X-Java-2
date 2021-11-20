import java.util.*;
public class SICI
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t,R;
        int sw;
        double si,ci;
        System.out.println("Enter P,R,T respectively");
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        System.out.println("Enter 1 for SI and 2 for CI");
        sw=sc.nextInt();
        R=(1+r/100);
        double a=Math.pow(R,t);
        switch(sw)
        {
            case 1:
            si=(p*r*t)/100;
            System.out.println("SI "+si);
            break;
            case 2:
            ci=p*(a-1);
            System.out.println("CI "+ci);
            break;
            default:
            System.out.println("wrong input");
            break;
        }
        
    }
}