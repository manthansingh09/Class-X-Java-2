import java.util.*;
import java.math.*;
public class threesubject
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double phy,chem,bio,a,a1;
        phy=sc.nextDouble();
        chem=sc.nextDouble();
        bio=sc.nextDouble();
        a=(phy+chem+bio)/3;       
        a1=Math.round(a);
        System.out.println("Average round off marks "+a1);
    }
}
