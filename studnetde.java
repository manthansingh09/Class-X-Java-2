import java.util.*;
public class studnetde
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=10;i++)
        {
        String name;
        char division;
        int rollno;
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Roll No");
        rollno=sc.nextInt();
        System.out.println("Enter Division");
        division=sc.next().charAt(0);
        System.out.println("NAME "+name);
        System.out.println("DIVISION "+division);
        System.out.println("Roll No."+rollno);
        }
    }
}