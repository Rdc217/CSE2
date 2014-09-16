//Ryan Cooney   
//CSE2 Hw03 9/15/2014
//Root
//Uses scanner to obtain a number 
//Computes the cubed root of this number

import java.util.Scanner; //imports the scanner program

public class Root {
    //creates class needed for program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates instance of the scanner 
        myScanner=new Scanner(System.in);
        //calls scanner construct
        
        System.out.print(
        "Enter a double: ");
        //prompts user to enter a double
        double x=myScanner.nextDouble();
        //calls a method of the scanner
        
        //output and calculations
        double guess= x/3; //variable to guess calculation for cube root
        guess= ((guess*guess*guess+x)/(3*guess*guess)); //calculation to find crude guess for cubed root
        guess= ((2*guess*guess*guess+x)/(3*guess*guess)); //improvement on guess
        guess= ((2*guess*guess*guess+x)/(3*guess*guess)); //improvement on guess
        guess= ((2*guess*guess*guess+x)/(3*guess*guess)); //improvement on guess
        double X= (guess*guess*guess); 
        //gets the number originally entered back
        
        System.out.println("The cube root is "+guess+":");
        System.out.println(+guess+"*"+guess+"*"+guess+"=");
        System.out.println(+X);
        //print the cube root and then the original number entered
        
        
    } //ends the main method
} //ends the class