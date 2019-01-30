import java.io.*;
import java.util.*;

public class Automobile { //CLASS NAME AUTOMOBILECAR 

    private double mpg,gal=0,f; //DECLARE THE VARIABLES 
    
        Scanner x = new Sacnner(System.in);
        
        x =  mpg;
        
        Scanner x = new Sacnner(System.in);
        System.out.print("Gallons ");
        x =  gal;
        
    public void Automobile(double m)
    { 
        mpg=m; 
    } 

    public void fill(double x)
    { 
        f=gal+x; 
    } 

    public void takeTrip(double y){ 
        gal=f-(y/mpg); 
    } 

    public double reportFuel(){ 
        return gal; 
    }
    
}