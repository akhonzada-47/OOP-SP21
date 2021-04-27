
package Assignments.Task2;
import java.util.StringTokenizer;

public class CustomStringTokenizer 
{
    public static int countTokens(StringTokenizer s)
    {
        int count=s.countTokens(), finalCount=0;
        String str;
        boolean bool;
        double value;
        
        for(int i=0;i<count;i++)
        {
            bool=true;
            str=s.nextToken();
            try
            {
                value = Double.parseDouble(str);
            }
            catch(NumberFormatException e)
            {
                bool=false;
            }
            if(!bool)
                finalCount++;
        }
        return finalCount;
    }
    
    
    
     public static void main(String[] args) 
    {
        StringTokenizer str1 = new StringTokenizer("Ali's height is 6 feet.");
        StringTokenizer str2 = new StringTokenizer("Ali's height is six feet.");
        
        int count = countTokens(str1);
        System.out.println("\t**  String Tokenizer  ***\nString '1' has ["+ count + "] tokens!");
        count = countTokens(str2);
        System.out.println("String '2' has ["+ count + "] tokens!");
    }
    
    
}
