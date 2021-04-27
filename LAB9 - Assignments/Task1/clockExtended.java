package Assignments.Task1;

public class clockExtended extends Clock
{

     public clockExtended(String hrs, String mins, String secs)
     {
        super(hrs, mins, secs);
    }
    
    @Override
    public void display()
    {
        System.out.println("\t24 Hrs Format,");
        super.display();
        System.out.println("\t12 Hrs Format,");
        int hour1 = (int)hrs.charAt(0) - '0';
        int hour2 = (int)hrs.charAt(1)- '0';
        int hour = hour1 * 10 + hour2;
        String m;
        if(hour < 12)
            m="AM";
        else
            m="PM";
        
        hour %= 12;
        if (hour == 0) {
            System.out.print("12");
            System.out.print(":"+mins+":"+secs);
        }
        else{
            System.out.print(hour);
            System.out.print(":"+mins+":"+secs);
        }
        System.out.println(" "+m);
    }
}
