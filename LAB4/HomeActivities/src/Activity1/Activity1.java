
package homeactivities;

public class Activity1 
{
    public static void main(String[] args)
    {
        Marks mark = new Marks();
        
        mark.setComp(34);
        mark.setPhy(43);
        mark.setMaths(41);
                
        System.out.print("Computer marks = " + mark.getComp() + "\nPhysics marks = " + mark.getPhy() + "\nMaths marks = " + mark.getMaths());
    }
    
}
