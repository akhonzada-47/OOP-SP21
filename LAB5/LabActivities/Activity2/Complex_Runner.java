
package LabActivities;

public class Complex_Runner
{
    public static void main(String[] args)
    {
        Complex C1 = new Complex(11, 2.3);
        Complex C2 = new Complex(9, 2.3);
        Complex C3 = new Complex();
        
        C3 = C1.add(C2);
        C3.show();
    }
    
}
