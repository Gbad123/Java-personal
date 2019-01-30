public class Crypto
{
    
    public String s;
    
    public String acceptor (String sntnc)
    {
        
        // accepts your sentence
        String s;
        s = sntnc;
        return s;
        
    }
    
    public String encrypt (String sntnc)
    {
        
        //replaces them with numbers or else doesn't work properly
        sntnc = sntnc.replace("V", "1");
        sntnc = sntnc.replace("v", "1");
        sntnc = sntnc.replace("M", "2");
        sntnc = sntnc.replace("m", "2");
        sntnc = sntnc.replace("G", "3");
        sntnc = sntnc.replace("g", "3");
        sntnc = sntnc.replace("B", "4");
        sntnc = sntnc.replace("b", "4");
        
        //from numbers to encrytion
        sntnc = sntnc.replace("1", "ag',r");
        sntnc = sntnc.replace("2", "ssad");
        sntnc = sntnc.replace("3", "jeb..w");
        sntnc = sntnc.replace("4", "dug>?/");

        return sntnc;
      
    }

    public String decrypt (String sntnc)
    {
        
        //decrypts the sentence
        sntnc =sntnc.replace("ag',r", "v");
        sntnc = sntnc.replace ("ssad", "m");
        sntnc = sntnc.replace("jeb..w", "g");
        sntnc = sntnc.replace ("dug>?/","b");
        
        return sntnc;
        
    }
}