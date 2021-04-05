
package Assignment;

public class Calculator 
{
    static int result;
    
    public static int sum(int a, int b)
    {
        result = a+b;
        
        return result;
    }
    public static int multiply(int a, int b)
    {
        result = a*b;
        
        return result;
    }
    public static int divide(int a, int b)
    {
        return result;
    }
    public static int modulus(int a, int b)
    {
        result = a%b;
        
        return result;
    }
    public static String sin(int a, int b)
    {
              return "sin("+a+")\nsin("+b+")";
    }
    public static String cos(int a, int b)
   {
              return "cos("+a+")\ncos("+b+")";
    }
    public static String tan(int a, int b)
    {
              return "tan("+a+")\ntan("+b+")";
    } 
    
    
}
