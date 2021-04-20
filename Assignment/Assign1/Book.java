
package Assignment.Assign1;

public class Book extends Publication
{
    private int pageCount;
    
    public Book(String title, double price, int pageCount)
    {
        super(title,price);
        this.pageCount = pageCount;
    }
    
    public void setPageCount(int pageCount)
    {
        this.pageCount = pageCount;
    }
    public int getPageCount()
    {
        return pageCount;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}
