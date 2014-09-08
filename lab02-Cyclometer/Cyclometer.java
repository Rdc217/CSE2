//Ryan Cooney
//CSE2 Lab 2 9/5/2014
//Cyclometer
//Count and print time elapsed in seconds 
//Count and print number of front wheel rotations during trip

public class Cyclometer {
    //main method needed for all java programs
    public static void main (String[] args) {
        int secsTrip1=480; //time elapsed for trip one in seconds
        int secsTrip2=3220; //time elapsed for trip two in seconds
        int countsTrip1=1561; //number of front wheel rotations for trip one
        int countsTrip2=9037; //number of front wheel rotations for trip two
        
        //list of variables and output data
        double wheelDiameter=27.0, //diameter of the bike wheel
        PI= 3.14159, //value of the constant pi
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //number of inches in a foot
        secondsPerMinute=60; //number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //these are our output values
        
        //print out inputvalues
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+ " minutes and had "+
            countsTrip1 + " counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+ " minutes and had "+
            countsTrip2 + " counts.");
        
        //calculate the distances for both trips using the 
        //circumference of the wheel and the number of rotations
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //distance in inches
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in feet
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        //calculates total distance traveled
        
        //print output values
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        //prints out distance of trip 1
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        //prints out distance of trip 2
        System.out.println("The total distance was "+totalDistance+" miles");
    } //end main method
} //end class 