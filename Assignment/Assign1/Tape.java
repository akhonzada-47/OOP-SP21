
package Assignment.Assign1;

public class Tape extends Publication
{
    private double playTime;
    
    public Tape(String title, double price, double playTime)
    {
        super(title,price);
        this.playTime = playTime;
    }
    
    public void setPlayTime(int playTime)
    {
        this.playTime = playTime;
    }
    public double getPlayTime()
    {
        return playTime;
    }
    
    public void display()
    {
        super.display();
        System.out.println("Play Time: " + playTime + " mins");
    }
}
