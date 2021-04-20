
package Assignment.Assign1;

public class Publication 
{
    private String title;
    private double price;
    
    public Publication()
    {
        title = "xxx";
        price = 00.0;
    }
    public Publication(String title, double price)
    {
        this.title = title;
        this.price = price;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public String grtTitle()
    {
        return title;
    }
    public double getPrice()
    {
       return price;
    }
    
    public void display()
    {
        System.out.println("Title: " + title + "\nPrice: $" + price);
    }
}
