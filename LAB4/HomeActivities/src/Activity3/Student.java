
package homeactivities.Activity3;

public class Student 
{
    private String Name;
    private int[] Result_array = new int[5];
    
    public Student(String Name, int[] Result_array)
    {
        this.Name = Name;
        for(int i=0; i<5;i++)
        {
            this.Result_array[i] =  Result_array[i]; 
        }
    }
    
    public float Average()
    {
        float average = 0;
        
        for(int i=0; i<5; i++)
        {
            average += Result_array[i];
        }
        
        return average/5;
    }
    
    public String getName()
    {
        return this.Name;
    }
    
    public int[] getResult()
    {
       return new int[] {Result_array[0],Result_array[1],Result_array[2],Result_array[3],Result_array[4]};
    }
    
}
