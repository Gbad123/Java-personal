import java.io.*;
import java.util.*;

public class SineNotSine
{
    
    public static void main (String args[])
    {
    
        double x;
            Scanner i = new Scanner(System.in); //Enters your number
            System.out.print("Ener your number ");
            
            x = i.nextDouble(); //turns number to decimal or double
            
            double d;
                d =(Math.toRadians(x)); //turns your number into radians
                
                System.out.println("sin(" + x + ") = " + Math.sin(d)); //First Method
                System.out.println("cos(" + x + " - PI/2)" + Math.cos(d - Math.PI / 2)); //Second Method
                System.out.println("root (1 - cos (" + x + ")) = " + (Math.sqrt(1 - Math.pow(Math.cos(d) , 2)))); //Third Method
                System.out.println("tan(" + x + ")/cos(" + x + ") = " + (Math.tan(d) * Math.cos(d))); //Fourth Method
    
            }
}