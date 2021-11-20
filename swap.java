public class swap
{  
    public static void main(int a,int b) 
    {     
        System.out.println("Before swapping");  
        System.out.println("value of a:" + a);  
        System.out.println("value of b:" + b);  
        System.out.println("After swapping");  
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("value of a:" +a);  
        System.out.println("value of b:" +b);  
    }    
}   