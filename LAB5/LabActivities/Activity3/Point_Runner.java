
package LabActivities;

public class Point_Runner
{
    public static void main(String[] args)
    {
        Point p1 = new Point(10,20);
        Point p2 = new Point (30,40);
        Point p3 = new Point ();
        Point p4 = p1.Add(p2,p3);
        p4.display();

        
    }
    
}
