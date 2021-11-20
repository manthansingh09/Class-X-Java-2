import java.io.*;
public class Triangle_Check
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int a,b,c;
        System.out.println("Enter all three Sides");
        a=Integer.parseInt(in.readLine());
        b=Integer.parseInt(in.readLine());
        c=Integer.parseInt(in.readLine());
        if((a+b>c)&&(b+c>a)&&(a+c>b))
        {
            if((a==b)&&(b==c)&&(c==a))
            {
                System.out.println("Equilateral Triangle");
            }
            else if((a==b)||(b==c)||(c==a))
            {
                System.out.println("Isosceles Triangle");
            }
            else if((a!=b)&&(b!=c)&&(c!=a))
            {
                System.out.println("Scalene Triangle");
            }
        }
        else
        {
            System.out.println("Not a Triangle");
        }
    }
}
