import java.io.*;
import java.util.*;

public class fromoffshore
{
    public static void main (String Args[])
    {
        
        //user input to the shore
        Scanner kbreader = new Scanner (System.in);
            System.out.print("What is the distance to the enemy ship from the shore? ");
                double d1 = kbreader.nextDouble();
        
                //user input to the gun
            System.out.print("What is the distance to the shore from the gun? ");
                double d2 = kbreader.nextDouble();
                
                //find the distance
                double x = d1 - d2;
                
                //finding the a value
                double a =(-499)/Math.pow((x-(0.5*x)),2);
                System.out.println("a = " +a);
         
                //finding the b value
                double b = (a*(Math.pow(x, 2)) /x);
                System.out.println("b = " +b);
        
                //c is always zero
                System.out.println ("c = 0.0");
    }
}