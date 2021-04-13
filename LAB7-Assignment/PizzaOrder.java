
package Assignment;

public class PizzaOrder 
{
    private Pizza p1;
    private Pizza p2;
        
    public PizzaOrder(Pizza p1, Pizza p2)
    {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public String discription()
    {
        return p1.getDescription() + "\n-------------------------\n" + p2.getDescription()+ "\n-------------------------\n";        
    }
    
    public double calcTotal()
    {
        return p1.calCost() + p2.calCost();
    }
    
}
