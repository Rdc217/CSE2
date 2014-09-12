//Ryan Cooney
//CSE2 Lab 3 9/12/2014
//BigMac
//Computes the cost of buying some BigMacs
//Uses the scanner to get info from user to calculate total cost

import java.util.Scanner; //imports the scanner tool used to gather info

public class BigMac {
    //creates calls required for program
    
    public static void main(String[] args) {
        //creates main method required for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner=new Scanner(System.in); //calls scanner constructor
        
        System.out.print(
        "Enter the number of Big Macs (an integer > 0): "); 
        //prompts user to enter number of big macs
        int nbigMacs=myScanner.nextInt();
        //calls a method that the scanner has to accept input
        
        System.out.print("Enter the cost per Big Mac as"+
        " a double (in the form xx.xx): ");
        //prompts user to enter cost per Big Mac
        double bigMac$=myScanner.nextDouble();
        //calls a method that the scanner has to accept input
        
        System.out.print(
        "Enter the percent tax as a whole number (xx): ");
        //prompts user to enter the sales tax
        double taxRate=myScanner.nextDouble();
        //calls a method that the scanner has to accept input
        taxRate/=100; //this is to get a proportion out of percent
        
        //creates some variables to print the cost in a nicer way
        double cost$; //cost of BigMacs
        int dollars, //whole dollar amount of cost 
            dimes, pennies; //allows cost to go to righ of decimal 
        cost$= nbigMacs*bigMac$*(1+taxRate); //computes total cost
        //also drops the decimal fraction
        dollars=(int) cost$; //makes the cost an integer
        dimes=(int) (cost$*10)%10; //gets dimes in our answer
        pennies=(int) (cost$*100)%10; //gets pennies in our answer
        
        System.out.println("The total cost of " +nbigMacs+
        " Big Macs, at $" +bigMac$+ " per Big Mac, with a "+
        "sales tax of "+ (int) (taxRate*100)+ 
        "%, is $"+dollars+ '.'+dimes+pennies);
        //prints all the input info and then adds dollars dimes
        //and pennies together to get total cost
        
        
    } //end of main method
} //end of class