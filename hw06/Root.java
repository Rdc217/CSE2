//Ryan Cooney
//CSE Hw06 10/11/2014
//Root
//Uses the bisection method to calculate the square root of a double you enter.

import java.util.Scanner; //imports the Scanner tool

public class Root {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        System.out.print("Enter a double greater than 0: ");
        //asks the user for an input
        double x = myScanner.nextDouble();
        //calls method of scanner 
        
        double low = 0.0; //low value is 0
        double high = x+1; //high is x +1

        if(x>0){//if x is a positive double
        
            while((high-low)>=(.0000001*high)){ //while high-low is greater than a small fraction of high
                double middle = (high+low)/2; //finds the middle value of your range
                
                if((middle*middle)>x){ //if the square of middle is greater than x
                    high = middle; //high is then set equal to middle
                } //closes the if
                
                else{ //if the square of middle is less than x
                    low = middle; //value of low is then set to middle
                } //closes the if    
            
                if((high-low)<(.0000001*high)){ //if high-low is less than a fraction of high
                    System.out.println("The square root of the number is: "+middle); //print square root
                }//close if
            }//closes the while loop
        }//closes if statement
        
        else{//if a pos double is not entered
            System.out.println("Please enter a positive double");
        }//closes else statement    
    }//closes the main method
}//closes the class    