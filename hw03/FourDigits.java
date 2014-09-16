//Ryan Cooney   
//CSE2 Hw03 9/15/14
//FourDigits
//Uses the scanner to gather info
//Prints out the first four digits after decimal

import java.util.Scanner; //imports the scanner tool

public class FourDigits {
    //creates class required for program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner=new Scanner(System.in); //calls scanner construct
        
        
        System.out.print(
        "Enter a double to display the four digits right of decimal: "); 
        //prompts user to enter a number
        double number= myScanner.nextDouble();
        //calls a method of the scanner
      
        //4 different digits
        int fourDigits1;
        int fourDigits2;
        int fourDigits3;
        int fourDigits4;
        
        //getting the four digits
        fourDigits4= (int)(number*10000)%10;
        //gets the fourth decimal place
        fourDigits3= (int) (number*1000)%10;
        //gets the third decimal place
        fourDigits2= (int) (number*100)%10;
        //gets the second decimal place
        fourDigits1= (int) (number*10)%10;
        //gets the first decimal place
        
        
        
        System.out.println("The four digits are "
        +fourDigits1+fourDigits2+fourDigits3+fourDigits4);
        //prints the four digits
    } //end main method
} //ends the class 