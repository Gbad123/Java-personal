public class Automobile
{
    
    public Automobile(double mpg)
    {
        
        //sets staring to 0
        gasmileage = mpg;
        double gallons = 0;
        
    }
    
    public double fillUp(double f)
    {
        
        //how much fill up
        double fillUp = f;
        gallons = gallons + fillUp;
        return gallons;
        
    }
    
    public double takeTrip(double t)
    {
        
        //how long is trip
        double takeTrip = t;
        double b = takeTrip / gasmileage; //calculates how many gallons are used after trip
        gallons = gallons - b; //takes away gallons used from total gallons
        return gallons;
        
    }
    
    public double reportFuel()
    {
        
        //new fuel
        return gallons;  
        
    }
    
    public double gallons;
    public double gasmileage;
    
}