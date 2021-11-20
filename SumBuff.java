import java.io.*;
public class SumBuff
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int i,sum;sum=0;
        int m[]=new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter Marks: ");
            m[i]=Integer.parseInt(in.readLine());
        }
        
    }
}
