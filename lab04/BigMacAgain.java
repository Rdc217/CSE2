//Ryan Cooney
//CSE Lab04 9/19/2014
//BigMacAgain
//Asks user how many Big Macs they want, and whether or not they want
//an order of fries. It then prints out the total cost of the meal. 

import java.util.Scanner; //imports the scanner tool

public class BigMacAgain {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        //some variables
        double costBigMac$= 2.22;  //cost per big mac
        double costFries$= 2.15; //cost of fries
        
        System.out.print(
        "Enter the number of Big Macs: ");
        //prompts user to enter an integer
        
        
        if(myScanner.hasNextInt()){ //if the user enters an integer
            int nBigMacs = myScanner.nextInt();
            //calls a method of scanner
            if(nBigMacs>=0){ //if user enters number bigger than 0    
            
                double totalCost$= (costBigMac$*nBigMacs);
                //total cost of big macs
                double totalCostFries$= totalCost$+costFries$;
                //total cost plus fries
                totalCost$= (int) (totalCost$*100);
                totalCost$= totalCost$/100;
                //truncates decimal
                totalCostFries$= (int) (totalCostFries$*100);
                totalCostFries$= totalCostFries$/100;
                //truncates decimal
             
            
                System.out.println(
                "You ordered "+nBigMacs+  
                " Big Macs for a cost of: $"
                +totalCost$); 
                //computes and displays total cost of Big Macs
            
                System.out.print(
                "Do you want an order of fries (Y/y/N/n)? ");    
                //prompts user to enter yes or no
                String fries = myScanner.next();
                //prompts to enter yes or no
            
                if(fries.equals("Y")||fries.equals("y")){ //if user enters yes 
                
                
                    System.out.println(
                    "You ordered fries at a cost of $2.15");
                    //states cost of fries
                    System.out.println(
                    "The total cost of the meal is $" 
                    +totalCostFries$);
                    //computes total cost of meal
                }//ends if statement
            
                else if(fries.equals("N")||fries.equals("n")){ //if user enters no
                    System.out.println(
                    "The total cost of the meal is " 
                    +totalCost$);
                    //computes total cost of meal
                }//ends if statement
            
                else{ //if not Y y N or n
                System.out.println("You did not enter Y, y, N, or n");
                //lets user know what they did wrong
                return; //essentially leaves the program
                }//ends else statement
        
            }//ends if statement    
            
            else{ //not an int > 0
            System.out.println("You did not enter an integer > 0");
            //lets user know what they did wrong
            return; //essentially leaves the program
             }//ends else statement
            
        }//ends if statement   
       
        else{ //if user did not enter integer
            System.out.println("You did not enter an integer");
            //lets user know what they did wrong
            return; //essentially leaves the program
        }//ends else statement
    } //ends main method
} //ends class
