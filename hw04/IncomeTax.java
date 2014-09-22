//Ryan Cooney
//CSE Hw04 9/21/2014
//IncomeTax
//Asks for an integer that gives thousands of dollars in
//income. Then returns the income tax for that income. 

import java.util.Scanner; //imports the scanner tool

public class IncomeTax {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
    
        System.out.print(
        "Enter an int giving the number of thousands: ");
        //prompts user to enter an integers
    
        if(myScanner.hasNextInt()){ //if the user enters an integer
            int income = myScanner.nextInt();
            //calls a method of scanner
            if(income>=0){ //if user enters number bigger than 0    
                
                if(income<20){ //if the income is less than 20
                    double tax=.05; //income tax is 5%
                    int income$=(income*1000); //income in thousands of dollars
                    double incomeTax$=(income$*tax); //find the income tax
                    incomeTax$= (int)(incomeTax$*100)/100; //truncates decimal
                    
                    System.out.println(
                    "The tax rate on $"+income+",000 is 5%, and the tax is $"+incomeTax$);
                    //Lets the user know the income tax percent and income tax
                } //ends the if statement
                
                if(income>=20 && income<40){ //if the income is greater than or equal to 20 and less than 40
                    double tax=.07; //income tax is 7%
                    int income$=(income*1000); //income in thousands of dollars
                    double incomeTax$=(income$*tax); //find the income tax
                    incomeTax$= (int)(incomeTax$*100)/100; //truncates decimal
                    
                    System.out.println(
                    "The tax rate on $"+income+",000 is 7%, and the tax is $"+incomeTax$);
                    //Lets the user know the income tax percent and income tax
                } //ends the if statement
                
                if(income>=40 && income<78){ //if the income is greater than or equal to 40 and less than 78
                    double tax=.12; //income tax is 12%
                    int income$=(income*1000); //income in thousands of dollars
                    double incomeTax$=(income$*tax); //find the income tax
                    incomeTax$= (int)(incomeTax$*100)/100; //truncates decimal
                    
                    System.out.println(
                    "The tax rate on $"+income+",000 is 12%, and the tax is $"+incomeTax$);
                    //Lets the user know the income tax percent and income tax
                } //ends the if statement
                
                if(income>=78){ //if the income is less than or equal to 78
                    double tax=.14; //income tax is 14%
                    int income$=(income*1000); //income in thousands of dollars
                    double incomeTax$=(income$*tax); //find the income tax
                    incomeTax$= (int)(incomeTax$*100)/100; //truncates decimal
                    
                    System.out.println(
                    "The tax rate on $"+income+",000 is 14%, and the tax is $"+incomeTax$);
                    //Lets the user know the income tax percent and income tax
                } //ends the if statement
             } //ends if statement
            
             else{ //not an int > 0
            System.out.println("You did not enter a positive integer");
            //lets user know what they did wrong
            return; //essentially leaves the program
             }//ends else statement
        } //ends the if statement
        
        else{ //if user did not enter integer
            System.out.println("You did not enter an integer");
            //lets user know what they did wrong
            return; //essentially leaves the program
        }//ends else statement
    
    } //ends the main method   
} //ends the class    