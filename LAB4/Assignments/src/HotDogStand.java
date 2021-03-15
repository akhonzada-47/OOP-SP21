
package assignment1;

public class HotDogStand 
{
    private int stand_ID;
    private int sold_HD;
    
    public HotDogStand(int id, int sold)
    {
        stand_ID = id;
        sold_HD = sold;
    }
     
    public void justSold()
    {
        sold_HD++;
    }
    
    public int getID()
    {
        return stand_ID;
    }
    public int getSold_HD()
    {
        return sold_HD;
    }
    
}
