public class Temperature_
{
   double max,min,f1,f2;
   Temperature_(double m,double n)
   {
       max=m;
       min=n;
   }
   void compute()
   {
       f1=9*max/5+32;
       f2=9*min/5+32;
   }
   void display()
   {
       System.out.println("Max Temp in Fahrenheit: "+f1);
       System.out.println("Min Temp in Fahrenheit: "+f2);
   }
   
}
