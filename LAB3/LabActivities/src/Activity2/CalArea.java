/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity2;

/**
 *
 * @author dell
 */
public class CalArea 
{
    public int width,length;
    
    public CalArea()
    {
    length = 5; width = 2;
    }
    public CalArea(int l, int w)
    {
    length = l; width = w;
    }
    public int Calculatearea ()
    {
    return (length*width);
    }
    
}
