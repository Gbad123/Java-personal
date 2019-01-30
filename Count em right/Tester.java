import java.io.*;
import java.util.*;

public class Tester
{
    
    public static void main (String Args[])
    {
        
        //user input
        Scanner knReader = new Scanner (System.in);
        
        System.out.println("Enter a sentence");
        
        //means do until break
        while (true)
        {
            
            //make the input into sting
            String s = knReader.nextLine();
            System.out.println ("Original = " + s);
            
            //all lower case
            s = s.toLowerCase();
            
            //adds ** at the end in case s is the last character
            s = (s + "**");
            
            //allows us to either stop or go through with the loop
            if (s.equals("stop**"))
            
                {
                
                    System.out.println("break");
                    break;
                
                }
            
                else
                
                //stop wasn't typed so continue
                {
                    
                    //spilt the sentence and count all the s that are followed by a's
                    String spl[] = s.split("s\\s*a");
                    System.out.println("The letter s was printed " + (spl.length - 1 ) + " times");
                    
                    //ask for more input and restarts the loop
                    System.out.println("Enter a new phrase or types stop");
                    
                }   
                
        }
        
    }
    
}