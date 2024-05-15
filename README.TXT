
=========================================================================
This is the project README file. 
This project models a rider in the tour de France and his bike.
The class CompetingRider represents a competing rider and the class
RacingBike represents the rider's racing bike in the Tour de France.  
The classes CompetingRider and RacingBike are related to 
one another by composition: a CompetingRider has-a RacingBike. 
This project relates to question 2 of M250 TMA02, which is available 
via the module website.
------------------------------------------------------------------------
PROJECT TITLE: M250 TMA02 Q2
PURPOSE OF PROJECT: To answer TMA02 Q2
VERSION or DATE: 10-1-2019 
HOW TO START THIS PROJECT: Open the OUWorkspace in BlueJ
AUTHOR: Andrew Redford F4730061
USER INSTRUCTIONS: Create a new CompetingRider and new RacingBike with
code privided below and test the program below using the code below too.
------------------------------------------------------------------------

o	The following are tests for the method satisfying the third requirement in part a: isInNeedOfFood() which sends a message to 
  the component object and uses the returned value in a computation.
o	I use 6 calls to this method in order to demonstrate its correctness. 
o	I also change the values of one of the instance variables in the component object between the two calls.
o	I test boundary values of current speed of riders racing bike, both when the bike's rider has low energy and medium energy 
  (3 speed values for each energy level).
o	The only time the method should return true is when the rider has low energy and the current speed of rider's racing bike is 
  below 10

In tests 1 to 3 I have a low energy level in the instance of the component object and test the boundary value 11,10 and 9 for 
the speed of the cometing rider's racing bike.

In tests 4 to 6 I have a medium energy level in the instance of the component object and test the boundary value 11,10 and 9 
for the speed of the cometing rider's racing bike.

All tests were successful, and they are documented below.
--------------------------------------------------------------------

//create new racing bike
RacingBike bike1 = new RacingBike();
//create new rider
CompetingRider rider1 = new CompetingRider("Lance Armstrong", "high", bike1);





// Test 1 of 6
// First I put a low energy level in the instance of the composite object:
// Create a competing rider with energy level: low and current speed of riders racing bike: 11

// set the rider's energy level, executing the line:
rider1.setEnergyLevel("low");

// Then get the energy level:
rider1.getEnergyLevel();
// expected output:
// low

// Next set the rider's bike's current speed to 11:
bike1.setCurrentSpeed(11);
// Then I get it to check:
bike1.getCurrentSpeed();
// expected output:
// 11 

// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// false

// execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(low) Needs food?:(false) Current speed of bike:(11 km/h)




// Test 2 of 6
// keep the low energy level in the instance of the composite object but change current speed of rider's racing bike to : 10
// set the rider's bike's current speed to 10:
bike1.setCurrentSpeed(10);
// Then I get it to check:
bike1.getCurrentSpeed();
// expected output:
// 10 

// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// false

// I execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(low) Needs food?:(false) Current speed of bike:(10 km/h)


// Test 3 of 6
// Competing rider still has energy level: low this time I
// Change current speed of rider's racing bike to: 9
// set the rider's bike's current speed to 9:
bike1.setCurrentSpeed(9);
 
// Then get it to check:
bike1.getCurrentSpeed();
// expected output:
// 9 

// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// true

// execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(low) Needs food?:(true) Current speed of bike:(9 km/h)



// tests 4 to 6: medium energy level in the instance of the component object
// Test 4 
// Create a competing rider with energy level: medium and current speed of rider's racing bike: 11
// set the rider's energy level, executing the line:
rider1.setEnergyLevel("medium");
// Then get the energy level:
rider1.getEnergyLevel();
// expected output:
// medium

// Next set the rider's bike's current speed to 11:
bike1.setCurrentSpeed(11);
// Then get it to check:
bike1.getCurrentSpeed();
// expected output:
// 11 


// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// false

// execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(medium) Needs food?:(false) Current speed of bike:(11 km/h)



// Test 5 of 6
// keep the medium energy level in the instance of the composite object but I change current speed of rider's racing bike to : 10
// set the rider's bike's current speed to 10:
bike1.setCurrentSpeed(10);
// Then get it to check:
bike1.getCurrentSpeed();
// expected output:
// 10 

// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// false

// execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(medium) Needs food?:(false) Current speed of bike:(10 km/h)


// Test 6 of 6
// Competing rider still has energy level: medium this time change current speed of rider's racing bike to: 9
// set the rider's bike's current speed to 9:
bike1.setCurrentSpeed(9);
// Then get it to check:
bike1.getCurrentSpeed();
// expected output:
// 9 

// Now see if the rider needs food, executing the line:
rider1.isInNeedOfFood();
// expected output:
// false

// execute toString for the rider to see all this information together:
rider1.toString();
// expected output:
// Competing Rider's Name:(Lance Armstrong) Extra tests needed?:(true) Energy level:(medium) Needs food?:(false) Current speed of bike:(9 km/h)actual output:


--------------------------------------------------------------------

//Additional tests to test added methods in the classes:
rider1.extraTestIsNeeded(); //true
rider1.setRiderName("Lance Armitage"); 
rider1.extraTestIsNeeded(); //false because name is not Lance Armstrong
 
CompetingRider rider3 = new CompetingRider("Chris Froome");
rider3.getEnergyLevel(); // "unknown"
 
RacingBike bike3 = new RacingBike(0,6.7);
bike3.isTooLightToRace(); // true since bike weight is below 6.8
//it must be 6.8 kilos or above to be legal for Tour de France

bike3.setBikeWeight(6.8);
bike3.isTooLightToRace(); // false since bike it now of legal weight

bike3.setBikeWeight(6.9);
bike3.isTooLightToRace(); // false since bike is above legal weight

bike3.toString(); 
//Current bike speed:(0 km/h) Bike's Weight:(6.9 kilos) Bike too light to race?:(false)

// This is the end of the tests.
