import java.io.*;
import java.util.*;

public class Money
{
    
    public static void main (String args[])
    {
        
        Scanner x = new Scanner (System.in);
            System.out.println("How much money do you have? ");
            
            //doudbles your umber
            double a1 = x.nextDouble();
            
            
            //makes the money integers
            int q1, d1, n1, p1;
            
            q1 =(int)(a1 / 0.25);
            a1  = a1%0.25;
            
            d1 =(int)(a1 / 0.10);
            a1 = a1%0.10;
            
            n1 = (int)(a1 / 0.05);
            a1 = a1%0.05;
            
            p1 = (int)(a1 / 0.01);
            
            //prints out
            System.out.println("Quaters: " +q1);
            System.out.println("Dimes: " +d1);
            System.out.println("Nickels: " +n1);
            System.out.println("Pennies: " +p1);
            
    }
    
}