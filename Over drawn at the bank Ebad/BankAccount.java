public class BankAccount
{
    
    //constructor
    public BankAccount(double sb, String n)
    {
        
        balance = sb;
        name = n;
            
        System.out.println ("Name " + name + "\t Starting Amount " + balance);
        
    }
    
    //methods
    public double deposit (double d)
    {
        
        double deposit = d;
        
        balance = balance + deposit;
            return balance;
            
    }
    
    public double withdraw (double w)
    {
        
        double withdraw = w;
        
        balance = balance - withdraw;
            return balance;
            
    }
    
    public double balance;
    public String name;
}