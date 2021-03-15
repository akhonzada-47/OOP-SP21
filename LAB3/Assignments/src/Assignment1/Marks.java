
package lab3.assign;

public class Marks 
{
    int comp,phy,maths;
    
    public Marks()
    {
        comp = 50;
        phy = 46;
        maths = 48;
    }
    public Marks(int c, int p, int m)
    {
        comp = c;
        phy = p;
        maths = m;
    }
    
    int totalMarks()
    {
        int sum;
        sum = comp + phy + maths;
        
        return sum;
    }
    
}
