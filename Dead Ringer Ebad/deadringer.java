import java.io.*;
import java.util.*;

public class deadringer
{
    
    public static void main (String Args[])
    {
        
            Scanner ii = new Scanner(System.in); // asks for the number of hours
            System.out.print("Enter the number of hours ");
            
            int x; //hours
            int i = ii.nextInt();//input for hours

            
            Scanner bb = new Scanner(System.in); // asks for the number of minutes
            System.out.print("Enter the number of minutes ");
            
            int y;//minutes
            x = (int)(i * 60 )/ 5; //ringering per hour
            int b = bb.nextInt();//input for minutes
            
            y =(int)(b / 5);
            System.out.println ("The bell is rung " + (x + y) + " times");
        
    }
    
}