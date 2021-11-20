import java.util.*;
public class student5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        for(i=1;i<=5;i++)
        {
        String name;
        int section,rollno,phy,chem,bio,math,tot;
        float average;
        System.out.println("Enter Name");
        name= sc.nextLine();
        System.out.println("Enter Section and Roll No. Respectively");
        section= sc.nextInt();
        rollno= sc.nextInt();
        System.out.println("Enter Marks for Physics,Chemistry,Biology and Math");
        phy= sc.nextInt();
        chem= sc.nextInt();
        bio= sc.nextInt();
        math= sc.nextInt();
        average=phy+math+bio+chem/400;
        tot=phy+chem+bio+math;
        System.out.println("Student Name= "+name);
        System.out.println("Section= "+section);
        System.out.println("Roll No= "+rollno);
        System.out.println("Average of Four Subject = "+average);
        System.out.println("Total out of 400 Marks= "+tot);
        }
    }
}