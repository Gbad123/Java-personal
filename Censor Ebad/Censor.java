import java.io.*;
import java.util.*;

public class Censor
{
    
    public static void main (String Args[])
    {
        
        //takes use input
        Scanner kbreader = new Scanner (System.in);
        
        System.out.println("Enter your letter");
        
        while (true)
        {
            
            //converts to string
            String s = kbreader.nextLine();
            
            //everything lower case
            s = s.toLowerCase();
            
            s = (s + "**");
            
            //when to break
            if (s.equals("stop**"))
                
                {
                    
                    System.out.println(s + "Break");
                    break;
                
                }
                
                //what to do if hermes is found
                else if (s.contains("hermes"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                 
                //what if bridge is found
                else if (s.contains("bridge"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                
                //what if river is found
                else if (s.contains("river"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                
                //what if muddy is found
                else if (s.contains("muddy"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                
                //what if assault is found
                else if (s.contains("assault"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                
                //what if offensive is found
                else if (s.contains("offensive"))
                
                {
                    
                    System.out.println(s+"Rejected");
                    
                }
                
                //what if all clear
                else
                
                {
                    
                    System.out.println(s+"Approved");
                
                }
        }
        
    }
    
}