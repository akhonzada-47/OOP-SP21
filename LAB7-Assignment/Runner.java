
package Assignment;

public class Runner
{
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza("large",3,2,1);
        Pizza p2 = new Pizza("medium",1,2,3);
            
        PizzaOrder order = new PizzaOrder(p1,p2);       
        
        System.out.println(order.discription() + "\nTotal Cost : $" + order.calcTotal());
    }
}
