
package Assignments.Task1;

public class Clock
{
    String hrs;
    String mins;
    String secs;
    
    public Clock(String hrs, String mins, String secs)
    {
        this.hrs=hrs;
        this.mins=mins;
        this.secs=secs;
    }
    
    public void display()
    {
        System.out.println(this.hrs+":"+this.mins+":"+this.secs);
    }
}
