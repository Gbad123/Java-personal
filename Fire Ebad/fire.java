import java.io.*;
import java.util.*;

public class fire
{
    
    public static void main (String Args[])
    {
        
        //enters the k value for the equation
        Scanner r = new Scanner (System.in);
            System.out.print("What is distance to the ship? ");
            
        double x  = r.nextDouble();
        
        //finding the a value
        double a =(-499)/Math.pow((x-(0.5*x)),2);
            System.out.println("a = " +a);
         
        //finding the b value
        double b = (-a*(Math.pow(x, 2)) /x);
            System.out.println("b = " +b);
        
            //c is always zero
            System.out.println ("c = 0.0");
    }
    
}