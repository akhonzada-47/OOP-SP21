
package lab4;

public class Activity1 {

    public static void main(String[] args) 
    {
        Circle c1 = new Circle(23);
        c1.setRadius(8);
        c1.display();
        System.out.print("circumference of Circle '1' is,\n ");
        c1.CalculateCircumfrance();
        
        int r = c1.getRadius();
        
        Circle c2 = new Circle(r);
        c2.setRadius(8);
        c2.display();
        System.out.print("circumference of Circle '2' is,\n ") ;
        c2.CalculateCircumfrance();
      
    }
    
}
