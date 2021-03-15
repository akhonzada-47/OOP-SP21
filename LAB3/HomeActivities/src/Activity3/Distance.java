
package Activity3;


public class Distance 
{
    int feet,inches;
    
    public Distance()
    {
        feet = 20;
        inches = 30;
    }

    public Distance(int f, int i)
    {
        feet = f;
        inches = i;
    }
    
    void display()
    {
        System.out.println("Feet =  "+ feet + "\nInches =  "+ inches);
    }
}