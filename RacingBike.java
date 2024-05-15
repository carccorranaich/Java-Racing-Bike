
/**
 * RacingBike represents a racing bike in the Tour de France.
 * In the context of the CompetingRider, this is its component class.
 * This is for M250 TMA02 Q2.
 * 
 * @author Andrew Redford F4730061
 * @version January 10 2019
 */
public class RacingBike
{
   //instance variables
   private int currentSpeed;
   private double bikeWeight;

   /**
    * zero-argument constructor: if we don’t know the racing bike's attributes.    
    */
   public RacingBike()
   {
      this.currentSpeed = 0; //indicates current speed is unknown
      this.bikeWeight = 0; //indicates bike weight is unknown
      
   }

    /**
     * A constructor for objects of class RacingBike if we know its speed
     * but not its weight. Useful for testing for method isInNeedOfFood()
     * that allows the composite class to communicate with the component 
     * class in order to compute some value.
     */
    public RacingBike(int aCurrentSpeed)
    {
       this.currentSpeed = aCurrentSpeed;
       this.bikeWeight = 0;
    }

   /**
    * A constructor for objects of class RacingBike
    * if we know its current speed and weight.
    */
   public RacingBike(int aCurrentSpeed, double aBikeWeight)
   {
      this.currentSpeed = aCurrentSpeed;
      this.bikeWeight = aBikeWeight;
   }

   
   /**
    * Setter for a racing bike's speed.
    */
   public void setCurrentSpeed(int aCurrentSpeed)
   {
      this.currentSpeed = aCurrentSpeed;
   }

   /**
    * Setter for a racing bike's weight.
    */
   public void setBikeWeight(double aBikeWeight)
   {
      this.bikeWeight = aBikeWeight;
   }

   /**
    * Getter for a racing bike's speed. 
    */
   public int getCurrentSpeed()
   {
      return this.currentSpeed;
   }

   /**
    * Getter for an racing bike's weight. 
    */
   public double getBikeWeight()
   {
      return this.bikeWeight;
   }  

   /**
    * This method displays state-dependent behaviour:
    * The value returned depends on part of the state of the receiver.
    * If the receiver's weight is less than 6.8 true is returned since
    * bikes must weigh at least 6.8 kilos in the Tour. Otherwise false 
    * is returned.
    */
   public boolean isTooLightToRace()
   {
      return this.getBikeWeight() < 6.8;
   }

   
   /**
    * Returns a description of this object as a string.
    */
   public String toString()
   {
      return "Current bike speed:" + "(" + currentSpeed + " " + "km/h" + ")" 
           + " " + "Bike's Weight:" + "(" + bikeWeight + " " + "kilos" + ")" 
           + " " + "Bike too light to race?:" + "(" + isTooLightToRace() + ")";
   }
}
