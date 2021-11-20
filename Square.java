import java.io.*;
public class Square
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        double d,a,p,ar;
        System.out.println("Enter the Diagonal of a Square");
        d=Double.parseDouble(in.readLine());
        a=d/Math.sqrt(2);
        ar=a*a;
        p=4*a;
        System.out.println("The Area= "+ar);
        System.out.println("The Perimeter= "+p);
    }
}