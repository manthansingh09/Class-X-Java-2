import java.util.*;
public class vowel
{
   public static void main(String args[])
   {
       char alpha;
       Scanner sc=new Scanner(System.in);
       String st=sc.next();
       alpha=st.charAt(0);
       if(alpha=='a'||alpha=='i'||alpha=='o'||alpha=='u'||alpha=='e')
       {
           System.out.println("Its a Vowel");
       }
       else
       {
           System.out.println("Its a Consonant");
       }
   }
}
