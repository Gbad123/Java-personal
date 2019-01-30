import java.io.*;
import java.util.*;

public class Tester
{
    
    public static void main (String Args[])
    {
        
        int sp[] = new int [2000];
        int x = 10;
        
        String str[] = new String[500];
        
        for (x = 0; x < 10; x++)
        {
            
            sp[x] =x;
            System.out.println("Number is " + sp[x]);
            
        }
        
        Scanner knReader = new Scanner (System.in);
        
        System.out.println("Enter a sentence");
        String sntnc = knReader.nextLine();
        System.out.println("Original Sentence = " + sntnc);
        
        for (x = 0;x<(sntnc.length());x++)
        {
            
            str[x] = sntnc.substring(x,x+1);
            System.out.println (str[x]);
            
        }
    }
    
}