
package LabActivities;

public class Point 
{
    private int X;
    private int Y;
   
    public Point()
    {
        X = 5;
        Y = 6;
    }
    public Point(int x, int y)
    {
        X = x;
        Y = y;
    }
    public void setX (int x)
    {
        X = x;
    }
    public void setY (int y)
    {
        Y= y;
    }
    public int getX()
    {
        return X;
    }
    public int getY()
    {
        return Y;
    }
    
    public Point Add(Point Pa, Point Pb )
    {
        Point P_sum = new Point( X + (Pa.X) + (Pb.X),    Y + (Pa.Y) + (Pb.Y) );
        return P_sum;
    }
    public void display()
    {
        System.out.println("X = " + X);
        System.out.println("Y = " + Y);
    }
    
}
