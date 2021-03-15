
package homeactivities.Activity3;

public class Activity3 
{
     public static void main(String[] args)
     {
         Student s1 = new Student("Ali",new int[] {65,76,46,54,64});
         Student s2 = new Student("Muhammad",new int [] {54,65,45,55,44});
         
         System.out.println("Name: "+ s1.getName() + "\nAverage: " + s1.Average());
         
         System.out.println("Name: "+ s2.getName()+"\nAverage :"+s2.Average());
         
         if(s1.Average() > s2.Average())
         {
            System.out.println("\n" + s1.getName() + " has higher average i.e, " + s1.Average());
         }
         else
         {
            System.out.println("\n" + s2.getName() + " has higher average i.e, " + s2.Average());
         }
         
         Student s3 = new Student(s1.getName(),s2.getResult());
         System.out.print("\nName: " +  s3.getName()+"\nAverage: "+s3.Average());
     }
    
}
