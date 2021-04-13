
package Assignment;

public class Pizza
{
    private String size;
    private int NumOfCheeseToppings;
    private int NumOfPepperoniToppings;
    private int NumOfHamToppings;
    
    
    public Pizza()
    {
        size = "XXXX";
        NumOfCheeseToppings = 0000;
        NumOfPepperoniToppings = 0000;
        NumOfHamToppings = 0000;
    }
    public Pizza(String size, int NumberOfCheeseToppings, int NumberOfPepperoniToppings, int NumberOfHamToppings)
    {
        this.size = size;
        NumOfCheeseToppings = NumberOfCheeseToppings;
        NumOfPepperoniToppings = NumberOfPepperoniToppings;
        NumOfHamToppings = NumberOfHamToppings;
    }
    
    public void setSize(String size)
    {
        this.size = size;
    }
    public void setNumOfCheeseToppings(int NumberOfCheeseToppings)
    {
        NumOfCheeseToppings = NumberOfCheeseToppings;
    }
    public void setNumOfPepperoniToppings(int NumberOfPepperoniToppings)
    {
        NumOfPepperoniToppings = NumberOfPepperoniToppings;
    }
    public void setNumOfHamToppings(int NumberOfHamToppings)
    {
        NumOfHamToppings = NumberOfHamToppings;
    }
    
    public String getSize()
    {
        return size;
    }
    public int getNumOfCheeseToppings()
    {
        return NumOfCheeseToppings;
    }
    public int getNumOfPepperoniToppings()
    {
        return NumOfPepperoniToppings;
    }
    public int getNumOfHamToppings()
    {
        return NumOfHamToppings;
    }
    public double calCost()
    {
        double cost = 0;
        
        if(size.equals("small"))
        {
            cost = 10 + (2*(getNumOfCheeseToppings()+getNumOfPepperoniToppings()+getNumOfHamToppings()));
        }
        else if(size.equals("medium"))
        {
            cost = 12 + (2*(getNumOfCheeseToppings()+getNumOfPepperoniToppings()+getNumOfHamToppings()));
        }
        else
        {
            cost = 14 + (2*(getNumOfCheeseToppings()+getNumOfPepperoniToppings()+getNumOfHamToppings()));
        }
        
        return cost;
    }
    
    public String getDescription()
    {
        return  "Pizza size: " + getSize() + "\nCheese Toppings: " + getNumOfCheeseToppings() + 
                "\nPepperoni Toppings: " + getNumOfPepperoniToppings() + "\nHam Toppings:"+getNumOfHamToppings();
    }
    
}
