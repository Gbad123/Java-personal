import java.io.*;
import java.util.*;

public class trident
{
    
    public static void main (String args[])
    
    {
        
        Scanner x = new Scanner (System.in);
            System.out.print("How big is the trident ");//takes the user input
            
            int i1 = x.nextInt();//dims the integer for the trident
            int i2;
            
            for (i2 = 0; i2 < i1; i2++)//starts the spear loop
            {   
                System.out.println(" * * * ");//prints the spears part
            }

            for (i2 = 0; i2 < i1; i2++)//starts the handle loop
            {
                System.out.println("   *    ");//prints the handle
            }
        }

    }
