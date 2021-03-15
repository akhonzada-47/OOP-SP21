
package lab3.Assing2;

public class Time
{
    int hrs,mins,secs;
    
    public Time()
    {
        hrs = 12;
        mins = 45;
        secs = 59;
        
    }
    public Time(int h, int m, int s)
    {
        hrs = h;
        mins = m;
        secs = s;
    }
    
    void displayTime()
    {
        if(hrs < 24 && hrs >= 00 && mins < 60 && mins >= 00 && secs <= 60 && secs >= 00 )
        {
        System.out.print("The Time is,  " + hrs +" : " + mins +" : " + secs);
        }
        else
        {
            System.out.print("Invalid Time!");
        }
    }
    
}
