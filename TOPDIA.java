import java.util.*;  
public class TOPDIA  
{  
    public static void main(String args[])  
    {  
        int n,i,j,space=1;  
        System.out.print("Enter the number of rows you want to print: ");  
        Scanner sc=new Scanner(System.in);  
        n=sc.nextInt();  
        space=n-1;  
        for (i=1;i<= n;i++)  
        {  
            for (j=1;j<=space;j++)  
            {  
                System.out.print(" ");  
            }  
            space--;  
            for (j=1;j<= 2*i-1;j++)  
            {  
                System.out.print("*");  
            }     
            System.out.println("");  
        }  
    }  
}  