import java.io.*;
import java.util.*;

public class Addemup
{
    
    public static void main(String args[])
    {
        
        //takes user input
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter something like 8 + 33 + 1345 - 137 : ");
        
        //decides what to do if starting number does not have a + or - sign
        String s = kb.nextLine();
        if ((s.charAt(0) !='x')&&(s.charAt(0)!='x'))
        s = "+" + s;
        
        Scanner sc = new Scanner(s);
        int sum = 0;
            
            sc.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*");
            
            //what to do if plus
            
            while (sc.hasNextInt())
            {
                
                if (sc.findInLine("\\s*\\+\\s*")!=null)
                    
                    sum = sum + sc.nextInt();
                    
                     else 
                     sc.nextInt();
                
            }
            
            Scanner sc1 = new Scanner(s);
            sc1.useDelimiter("\\s*\\+\\s*|\\s*\\-\\s*");
                        
            //what to do if minus sign
            
            while (sc1.hasNextInt())
            {
                
                if (sc1.findInLine("\\s*\\-\\s*")!=null)
                    
                    sum = sum - sc1.nextInt();
                    
                    else 
                    sc1.nextInt();
                
            }
            
            //print the answer
            
            System.out.println("The sum is " + sum);
            
    }
    
}
