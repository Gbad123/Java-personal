import java.io.*;
    import java.util.*;
    
public class RadiusofCircle
{
    
    public static void main(String args[])
    {
        
        Scanner x = new Scanner(System.in);        
            System.out.print("Enter integer here.  ");
        
        double i = x.nextInt();
            System.out.println ("Raduis of the circle is " + (Math.sqrt(i / Math.PI)));
        
    }
    
}