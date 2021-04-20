
package Assignment.Assign2;

public class Computer 
{
    protected int wordSize;
    protected int memorySize;
    protected int storageSize;
    protected int speed;
    
    public Computer()
    {
        wordSize = 64;
        memorySize = 4096;
        storageSize = 500;
        speed = 900;
    }
    public Computer(int wordSize, int memorySize, int storageSize, int speed)
    {
        this.wordSize = wordSize; 
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }
    
    public void display()
    {
        System.out.println("Word Size: " + wordSize + " bits\nMemory Size: " + memorySize +
                " MBs\nStorage Size: " + storageSize+ " GBs\nSpeed: " + speed + " MHz");
    }
}
