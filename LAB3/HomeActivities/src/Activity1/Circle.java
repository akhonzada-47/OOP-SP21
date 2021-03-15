
public class Circle {
     
    double r , p ;
    public Circle()
    {
        r = 10;
        p = 3.14;
    }
    public Circle(double a, double b)
    {
        r = a;
        p = b;
    }
    
    void circleCircm()
    {
        double c;
        c = 2*p*r;
        System.out.println("Circumference of Circle is: "+ c);
    }
}
