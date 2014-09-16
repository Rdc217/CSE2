//Ryan Cooney   
//CSE2 Hw03 9/14/2014
//Bicycle
//Computes the distance traveled and the avg speed of bike
//Uses scanner to gather info from user to calculate this

import java.util.Scanner; //imports the scanner into program

public class Bicycle {
    //creates the class needed for program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates instance of scanner
        myScanner=new Scanner(System.in); 
        //calls scanner construct
        
        System.out.print(
        "Enter the number of seconds: ");
        //prompts user to enter number of seconds biked
        int nSeconds=myScanner.nextInt();
        //calls a method of the scanner
        
        System.out.print(
        "Enter the number of counts: ");
        //prompts user to enter the number of counts 
        //on cyclometer
        int nCounts=myScanner.nextInt();
        //calls a method of the scanner
        
        //list of variables needed for calculation
        double wheelDiameter=27.0, //diameter of wheel
        PI= 3.14159, //value of pi
        feetPerMile=5280, //number of feet in a mile
        inchesPerFoot=12, //number if inches in a foot
        secondsPerMinute=60; //number of seconds in a minute
        
        //some output calculations
        double totalDistanceInches= (wheelDiameter*PI)*nCounts;
        //calculates total distance traveled in inches
        double totalDistanceMiles= ((totalDistanceInches/inchesPerFoot)/feetPerMile);
        //calculates total distance in miles
        double totalTime= (nSeconds/secondsPerMinute);
        //calculates total time traveled
    
        //truncating the decimal places
        totalDistanceMiles= totalDistanceMiles*100;
        //multiplys by 100
        totalDistanceMiles= (int) (totalDistanceMiles);
        //converts the total distance to an integer
        totalDistanceMiles= totalDistanceMiles/100;
        //divides the total distance by 100 to truncate
        totalTime= totalTime*100;
        //multiplys time by 100
        totalTime= (int)(totalTime);
        //converts total time to integer
        totalTime= totalTime/100;
        //divides to truncate decimals
        
        System.out.println(
        "The distance was "+totalDistanceMiles+" miles and took "+totalTime+" minutes.");
        //prints distance traveled and total time
        
        //calculates average miles per hour
        double totalTimeHours= (totalTime/60);
        //converts time in minutes to hours
        double avgMph= (totalDistanceMiles/totalTimeHours);
        
        //truncating decimal places
        avgMph= avgMph*100;
        //multiply by 100
        avgMph= (int) avgMph;
        //converts to integer
        avgMph= avgMph/100;
        //divides by 100 to truncate
        
        
        System.out.println(
        "The average mph was "+avgMph);
        //prints avg mph
        } //ends main method
} //ends class