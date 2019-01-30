import java.io.*;
import java.util.*;

public class Ascii
{
    
    public static void main (String Args[])
    {
        
        System.out.println("Decimal"+"  Binary"+"   Octal"+"  Hex"+"     Character");
           
        for (int x = 65; x <= 90; x ++)
            {
                
                char c1 = (char)x;
                System.out.println(x + "\t" + " " + Integer.toString (x,2) +" " +" "+ Integer.toString (x,8) + "\t" + " "+ Integer.toString (x,16) + "\t" +" " +c1);
                
            }
            
            
    }

}