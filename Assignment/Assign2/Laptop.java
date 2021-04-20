
package Assignment.Assign2;

public class Laptop extends Computer
{
    protected int length;
    protected int width;
    protected int height;
    protected double weight;
    
    public Laptop()
    {
        length = 10;
        width = 12;
        height = 16;
        weight = 1.3;
    }
    public Laptop(int wordSize, int memorySize, int storageSize, int speed, int length, int width, int height, int weight)
    {
        super(wordSize,memorySize,storageSize,speed);
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
    
    @Override
    public void display()
    {
        super.display();
        System.out.println("Length: " + length + " Inches\nWidth: " + width +
                " Inches\nHeight: " + height + " Inches\nWeight: " + weight + " KGs");
    }
    
}
