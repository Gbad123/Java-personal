import java.io.*;
import java.util.*;

public class Weight
{
    
    public static void main (String args[])
    {
        
        double x;
        
            Scanner i = new Scanner(System.in); //ask's for the weight
            System.out.print("Enter weight in pounds "); //adds your weight to the program
            
            x = i.nextDouble(); // stores the weight to be used as decimal
            
            System.out.println("Your weight on Voltar is " + (x * 0.091)); //your weight on Voltar
            System.out.println("Your weight on Krypton is " + (x * 0.720)); //your weight on Krypton
            System.out.println ("Your weight on Fertos is " + (x + 0.865)); //Your weight on Fertos
            System.out.println ("Your weight on Servontos is " +(x + 4.612)); //Your weight on Servontos
        
    }
    
}