//Ryan Cooney
//CSE Hw04 9/21/2014
//Months
//Asks for an integer between 1 and 12 indicating month of
//year. Returns the number of days in the month.

import java.util.Scanner; //imports the scanner tool

public class Month {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner contruct   
        
        String monthDays; //number of days in the month
        
        System.out.print(
        "Enter an integer giving the number of the month (1-12): ");
        //enter the month as an integer
        int month = myScanner.nextInt();
        //calls a method of the scanner to get month as int
        
        switch(month){ //sets up the switch statement depending on month
            case 1: //if month is jan
                monthDays= "The month has 31 days";
                //number of days for Jan
                break; //breaks out of switch
            
            case 2: //if month is feb 
                System.out.print(
                "Enter an integer giving a year: ");
                //enter the month as an integer
                int year = myScanner.nextInt();
                //calls a method of the scanner to get month as int
                
                boolean leapYear=((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
                // sees if leap year by checking if divisible by 4 and 100
                // or if just divisible by 400
                
                if(leapYear){ //if a leap year
                    monthDays= "The month has 29 days";
                    // prints month has 29 days
                    } //ends if statement
                else{ //if not a leap year
                    monthDays= "The month has 28 days";
                    //prints month has 28 days
                } //ends else statement   
                break; //breaks out of the switch   
            
             case 3: //if month is march
                monthDays= "The month has 31 days";
                //number of days for Mar
                break; //breaks out of switch
            
            case 4: //if month is april
                monthDays= "The month has 30 days";
                //number of days in Apr
                break; //breaks out of switch
            
            case 5: //if month is may
                monthDays= "The month has 31 days";
                //number of days in May
                break; //breaks out of switch
            
            case 6: //if month is june
                monthDays= "The month has 30 days";
                //number of days for June
                break; //breaks out of switch
            
            case 7: //if month is july
                monthDays= "The month has 31 days";
                //number of days for July
                break; //breaks out of switch
            
            case 8: //if month is august
                monthDays= "The month has 31 days";
                //number of days for Aug
                break; //breaks out of switch
            
            case 9: //if month is september 
                monthDays= "The month has 30 days";
                //number of days in Sept
                break; //breaks out of switch
            
            case 10: //if month is october
                monthDays= "The month has 31 days";
                //number of days in Oct
                break; //breaks out of switch
            
            case 11: //if month is november
                monthDays= "The month has 30 days";
                //number of days in Nov
                break; //breaks out of switch
            
            case 12: //if month is december  
                monthDays= "The month has 31 days";
                //number of days in Dec
                break; //breaks out of switch
            
            default: //if not a month of the year
                monthDays= "You did not enter an int between 1 and 12";
                //lets user know what they did wrong
                break; //breaks out of switch    
        } //ends switch statement    
        
        System.out.println(monthDays);
        //prints the statement in the switch
    } //ends main method   
} //ends class            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            