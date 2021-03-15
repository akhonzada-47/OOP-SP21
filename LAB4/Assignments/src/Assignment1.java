
package assignment1;

public class Assignment1 {

    public static void main(String[] args) 
    {
        HotDogStand s1 = new HotDogStand(212,33);
        HotDogStand s2 = new HotDogStand(213,49);
        HotDogStand s3 = new HotDogStand(214,27);
        
        System.out.println("ID: "+s1.getID()+", sold "+s1.getSold_HD()+" Hot Dogs.");
        System.out.println("ID: "+s2.getID()+", sold "+s2.getSold_HD()+" Hot Dogs.");
        System.out.println("ID: "+s3.getID()+", sold "+s3.getSold_HD()+" Hot Dogs.");  
        
        s1.justSold();  s1.justSold();  s1.justSold();    s1.justSold();
        s2.justSold();  s2.justSold();
        s3.justSold();  s3.justSold();  s3.justSold();    s3.justSold();
        
        System.out.println("\n3 hours later!\n\nID: "+s1.getID()+", sold "+s1.getSold_HD()+" Hot Dogs.");
        System.out.println("ID: "+s2.getID()+", sold "+s2.getSold_HD()+" Hot Dogs.");
        System.out.println("ID: "+s3.getID()+", sold "+s3.getSold_HD()+" Hot Dogs."); 
        
    }
    
}
