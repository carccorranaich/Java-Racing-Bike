
/**
 * CompetingRider represents a rider competing in the Tour de France such 
 * as "Lance Armstrong". In the context of RacingBike, this is its composite 
 * class. This is for M250 TMA02 Q2.
 * @author Andrew Redford F4730061
 * @version January 10 2019
 * 
 */

public class CompetingRider
{
   //instance variables
   private String riderName; // name of the rider e.g. "Chris Froome"
   private String energyLevel; // energy level of the competing rider, e.g. "high"
   private RacingBike racingBike; // a Competing rider has-a racing bike
   
   /**
    * Constructor for objects of class CompetingRider
    * allowing specification of all the required attributes.
    * (We don't check that all the data has been specified 
    * correctly however. E.g. aRacingBike could be null.)
    */
   public CompetingRider(String aRiderName, String anEnergyLevel, RacingBike theRacingBike)
   {
      this.riderName = aRiderName; 
      this.energyLevel = anEnergyLevel;
      this.racingBike = theRacingBike; 
   }

   /**
    * Constructor for objects of class CompetingRider,
    * where we only know the CompetingRider riderName.
    * (We might not know the other attribute values.)
    * This is the minimum information required to construct
    * a CompetingRider object. In this case I chose to make
    * the RacingBike object 'empty'. 
    */
   public CompetingRider(String aRiderName)
   { 
      this.riderName = aRiderName;    
      this.energyLevel = null;  //energy level is a string value e.g. "high" or "low"
      this.racingBike = new RacingBike();
   }
   
 
   /**
    * Setter for a competing rider's name.
    */
   public void setRiderName(String aName)
   {
      this.riderName = aName;
   }

   /**
    * Setter for a competing rider's energy level.
    */
   public void setEnergyLevel(String aValue)
   {
      this.energyLevel = aValue;
   }

   /**
    * Getter for a competing rider's name.
    */
   public String getRiderName()
   {
      return this.riderName;
   }

   /**
    * Getter for a competing rider's energy level.
    * This method returns "Unknown" if the level
    * is unknown (i.e. it has not been set).
    */
   public String getEnergyLevel()
   {
      if (this.energyLevel == null)
      {
         return "Unknown";
      }
      return this.energyLevel;
   }

   /**
    * This method returns true if the competing rider's name 
    * is Lance armstrong, otherwise it returns false.
    */
   public boolean extraTestIsNeeded() 
   {
      if (this.riderName.equals("Lance Armstrong"))
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
    * This method returns true if the energy level of the competing rider
    * is low and the speed of the rider's bike is below 10 km/h, otherwise it 
    * returns false. This is the method that allows the composite class to 
    * communicate with the component class in order to compute some value.
    */
   public boolean isInNeedOfFood()
   {
      if (this.energyLevel.equals("low") && this.racingBike.getCurrentSpeed() < 10)  
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   /**
    * Returns a string describing this object.
    */
   public String toString()
   {
      return "Competing Rider's Name:" + "(" + this.riderName + ")" + " " 
           + "Extra tests needed?:" + "(" + this.extraTestIsNeeded() + ")" + " " 
           + "Energy level:" + "(" + this.energyLevel + ")" + " " 
           + "Needs food?:" + "(" + this.isInNeedOfFood() + ")" + " " 
           + "Current speed of bike:" + "(" + this.racingBike.getCurrentSpeed() + " " 
           + "km/h" + ")";                      
   }  
}   
   
   
   