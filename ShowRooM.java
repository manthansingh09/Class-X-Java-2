import java.util.*;
public class ShowRooM
{
    String name;
    long mobno;
    double cost;
    double dis;
    double amount;
    ShowRooM( ) 
    {
        name="";
        mobno=0;
        cost=0;
        dis=0;
        amount=0;
    }
    void input( )  
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("EnterName:");
        name=sc.nextLine( );
        System.out.println("Enter Mobile number:");
        mobno=sc.nextLong( );
        System.out.println("Enter cost:");
        cost=sc.nextDouble( );
    }
    void calculate( ) 
    {
        if (cost<=10000)
        {
            dis=cost*5/100;
            amount=cost-dis;
        }
        else if (cost>10000 && cost<=20000)
        {
            dis=cost*10/100;
            amount=cost-dis;
        }
        else if (cost>20000 && cost<=35000)
        {
            dis=cost*15/100;
            amount=cost*dis;
        }
        else if (cost>35000)
        {
            dis=cost*20/100;
            amount=cost-dis;
        }
    }
    void display( ) 
    {
        System.out.println("Name: " +name);
        System.out.println("Mobile No: " +mobno);
        System.out.println("Discount: "+dis);
        System.out.println("Amount to be paid: " +amount);
    }
    public static void main(String args[]) 
    {
        ShowRooM ob=new ShowRooM( );
        ob.input( );
        ob.calculate( );
        ob.display( );
    }
}