
package LabActivities;

public class Runner
{
    public static void main(String[] args)
    {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        
        System.out.println("Before calling: " + p.value);
        
        ObjectPass.increment(p);
        
        System.out.println("After calling: " + p.value);
    }
}
