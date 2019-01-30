import java.io.*;
import java.util.*;

public class Pool
{
    
    public static void main (String args[])
    
    {
        
        Scanner i1 = new Scanner (System.in);
            System.out.println ("What is the width of the pool? ");
            
            double x = i1.nextDouble();
            
        Scanner i2 = new Scanner (System.in);
            System.out.println ("What is the length of the pool? ");
            
            double y = i2.nextDouble();
            
          Scanner i3 = new Scanner (System.in);
        System.out.println ("What is the depth of the pool? ");
            
            double z = i3.nextDouble();
            
            double b = (((x * y * z) *1000))/10000;
            double cl = (2 *b);
            System.out.println ("The amount of chlorine you would need is " + cl + "l");
        }
    
}