//Ryan Cooney
//CSE Hw04 9/22/2014
//TimePadding
//Asks for number of seconds passed in a day and returns time in 
//conventional form

import java.util.Scanner; //imports the scanner tool

public class TimePadding {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
    
        System.out.print(
        "Enter the time in seconds: ");
        //prompts user to enter an integers
        
         if(myScanner.hasNextInt()){ //if the user enters an integer
            int seconds = myScanner.nextInt();
            //calls a method of scanner
            if(seconds>=0){ //if user enters number bigger than 0 
                int min=seconds / (60) % 60;
                //finds the total minutes as an int
                int hours=seconds / (3600) % 24;
                //finds the total hours as an int
                int sec=(seconds-((min*60)+(hours*3600))); 
                //finds the total seconds as an int
                
                if(sec<10 && min<10){ //if the seconds and minutes need padding
                System.out.println("The time is "+hours+":0"+min+":0"+sec);
                //prints the time with the minutes and sec padded
                }//ends if statement
                
                if(sec<10){ //if the seconds need to be padded
                System.out.println("The time is "+hours+":"+min+":0"+sec);    
                //prints the time with the seconds padded
                 }//ends if statement
                
                if(min<10){ //if the minutes need to be padded
                System.out.println("The time is "+hours+":0"+min+":"+sec);    
                // prints the time with the minutes padded
                } //ends the if statement
                
            else{ //if no numbers need padding
                System.out.println("The time is "+hours+":"+min+":"+sec);
                //prints the time
            }//ends the else statement    
           
            }//ends if statement
            
            else{ //not an int > 0
                System.out.println("You did not enter a positive integer for seconds");
                //lets user know what they did wrong
                return; //essentially leaves the program
            }//ends else statement
            
         }//ends if statement 
         
         else{ //if user did not enter integer
            System.out.println("You did not enter an integer");
            //lets user know what they did wrong
            return; //essentially leaves the program
         } //ends else statement    
         
    } //ends main method
} //ends class    