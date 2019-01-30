import java.io.*;
    import java.util.*;

public class EvenorOdd
{
    
    public static void main (String args[])
    
    {
        
        int x;
            Scanner i = new Scanner(System.in);     //Enters the number
                System.out.print("Enter your number ");
                
                x =i.nextInt(); //Makes i (ehich is the number you entered) an integer
                
                if (x % 2 == 0)
                    System.out.println("The interger " + x + " is an even number"); //Tells if the number is even
                else
                    System.out.println("The integer " + x + " is an odd number"); //Tells if the number is odd
                
    }
}