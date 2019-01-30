import java.io.*;
import java.util.*;

public class Tester
{
    
    public static void main (String args[])
    {
        
        //get the data
        Scanner x = new Scanner(System.in);
        System.out.print ("Enter Name ");
        String n = x.nextLine();
        
        System.out.print("Enter Starting Amount ");
        double b = x.nextDouble();
        
        System.out.print ("Enter Deposit Amount ");
        double d = x.nextDouble();
        
        System.out.print ("Enter Withdraws Amount ");
        double w = x.nextDouble();
        
        //set up account
        BankAccount MyAccount = new BankAccount (b, n);
        
        //make a deposit
        MyAccount.deposit (d);
        System.out.println("Deposit, new total\t" + MyAccount.balance);
        
        //make a withdraw
        MyAccount.withdraw (w);
        System.out.println("Withdraw, new total\t" + MyAccount.balance);
        
    }
    
}