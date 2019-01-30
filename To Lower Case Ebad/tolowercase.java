import java.io.*;
import java.util.*;

public class tolowercase
{
    
    public static void main (String args[])
    {
        String original, reverse = ""; //make the 2 functions string
      Scanner in = new Scanner(System.in); //give original a value
 
      System.out.print("Enter your name ");
      original = in.nextLine();
 
      int length = original.length(); //how big your name is
 
      for ( int i = length - 1 ; i >= 0 ; i-- ) //ever single letter is turned to string
         reverse = reverse + original.charAt(i); //give reserse a value
         
         String str = reverse; //reverses it
         
      System.out.println("Your name reversed and lower cased is " + str.toLowerCase());

    }

}