
package homeactivities;

public class Marks
{
    private int comp;
    private int phy;
    private int maths;
    
    public Marks()
    {
        comp = 75;
        phy = 65;
        maths = 68;
    }
    
    public int getComp()
    {
        return comp;
    }
    public int getPhy()
    {
        return phy;
    }
    public int getMaths()
    {
        return maths;
    }
    
    public void setComp(int a)
    {
        comp = a;
    }
    public void setPhy(int b)
    {
        phy = b;
    }
    public void setMaths(int c)
    {
        maths = c;
    }
}
