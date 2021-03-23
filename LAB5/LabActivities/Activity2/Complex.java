
package LabActivities;

public class Complex 
{
    private double real;
    private double imag;
    
    public Complex()
    {
        real = 0.0; 
        imag = 0.0;
    }
    public Complex(double r, double im)
    {
        real = r; 
        imag = im; 
    }
    
    public Complex add(Complex b)
    {
        Complex sum = new Complex (real + b.real, imag + b.imag);
        return sum;
    }
    public void show()
    {
        System.out.println( real + imag);
    }
    
}
