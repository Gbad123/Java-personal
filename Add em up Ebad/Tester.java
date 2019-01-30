import java.io.*;
import java.util.*;

public class Tester
{
    
    public static void mian (String args[])
    {
        
        //What is expected input
        Scanner kb = new Scanner (System.in);
        System.out.print("enter something like 8 + 33 + 1345 + 137 : ");
        
        //receives user input and selects the stuff to add
        String s = kb.nextLine( );
        Scanner sc = new Scanner(s);
        sc.useDelimiter("\\s*\\+\\s*");
        int sum = 0;
        
        //add em up
        while(sc.hasNextInt( ))
        {
            
            sum = sum +sc.nextInt( );
            
        }
        
        //prints out
        System.out.println("Sum is: " +sum);
        
    }
    
}




