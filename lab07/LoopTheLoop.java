//Ryan Cooney
//CSE Lab07 10/10/2014
//LoopTheLoop
//Practice with while loops 

import java.util.Scanner; //imports the scanner tool

public class LoopTheLoop {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct 
        
         while(true){ //sets up the infinite loop
            
            int counter = 1; //counter is initially 1
            int counter2 = 1; //counter is intially 1   
           
            System.out.print("Enter an integer between 1 and 15: ");
            //prompts user to enter an integer between 1 and 15
        
            if(myScanner.hasNextInt()){ //if the entered integer is an int
                int nStars = myScanner.nextInt(); //number of stars is equal to entered int
                
                if(nStars>=1 && nStars<=15){ //if nstars is between 1 and 15
                
                    while(counter <= nStars){//while the counter is less than or equal to nStars
                        System.out.print("*");
                        counter++;//increments counter by 1
                    }//closes while loop
                    
                    System.out.println("");//skips a line 
                    System.out.println("");//skips a line
                    
                    while(counter2 <= nStars){ //while the number of stars is less than 11
                        int counter3=1;
                        while(counter3 <= counter2){ //while counter 2 is less than counter
                            System.out.print("*"); //prints a star
                            counter3++; //increments counter2 by one
                        } //closes while loop
                        System.out.println("");//spaces lines
                        System.out.println("");//spaces lines 
                        counter2++; //increments counter by1
                        }//closes while loop
                }//closes the if statement
            
                else{ //if the number entered is not 1-15
                    System.out.println("Please enter an integer [1,15]");
                    //tells user what they did wrong
                } //closes else statement
            }//closes the if statement
            
            else{ //if the value entered is not an int
                System.out.println("Please enter an integer [1,15]");
                //tells user what they did wrong
            }//closes else statement
        
            System.out.print("Enter Y or y to go again: " );
            //prompts user to enter y or y
            String again = myScanner.next(); //creates variable again from Scanner
        
            if(again.equals("Y") || again.equals("y")){ //if y or Y is entered
            }//ends if statement
            
            else{ //if not y or Y is entered
            break; //breaks out of while loop
            }// ends else
            
        }//closes while loop
    }//ends main method
}//ends class