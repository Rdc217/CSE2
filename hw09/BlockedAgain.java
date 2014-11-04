//Ryan Cooney   
//CSE2 HW9  11/4/2014
//BlockedAgain
//Uses Methods to recreate the number stacking from 
//hw07.

import java.util.Scanner; //imports the scanner tool
public class BlockedAgain{ //creates the class
    public static void main(String []s){ //creates the main method
        int m; //initializes m as an int
        m = getInt(); //force user to enter int in range 1-9, inclusive.
        allBlocks(m); //calls method to get blocks of numbers
    } //ends main method
    
    public static int getInt(){ //creates method to get int
        Scanner scan; //creates an instance of the scanner
        scan= new Scanner(System.in); //calls scanner construct
        
        System.out.print("Enter a integer between 1 and 9, inclusive: ");
        //asks the user to enter int betw 1 and 9
        int number = checkRange(scan); //calls method to check if the int is in range
        // then sets it equal to number
        
        return (number); //returns number as output 
    }//ends method
    
    public static void checkInt(Scanner scan){ //creates method to check if int
        while(!scan.hasNextInt()){ //while the number entered is not an int
            System.out.print("You did not enter an int; try again- ");
            //lets user know what they did wrong
            scan.next(); //scans again
        }//end while loop
    }//ends the method  
    
    public static int checkRange(Scanner scan){ //creates method to check if int it in range
       
        while(true){ //creates infinite while loop
            checkInt(scan);//calls check int to see if its an int
            int check = scan.nextInt(); //calls scanner to get int check
            
            if(check>=1 && check<=9){ //if the number entered is between 1 and 9
                return (check); //returns check
            }//closes if
            
            else{ //if a number outside the range is entered
                System.out.print("You did not enter an int [0,9]; try again- ");
                //lets user know what they did wrong
            }//closes else statement
        }//closes while loop
    }//ends method
    
    public static void allBlocks(int number){ //creates method allBlocks
        for(int stacks=1; stacks<= number; stacks++){ //this loop makes the number of stacks
            block(number,stacks); //calls method block
            
            for(int space1=1; space1<=(number-stacks); space1++){ //gets the space to the left of the dashes
                System.out.print(" "); //prints a space
            }//closes for loop
                    
            for(int leftDash=1; leftDash<stacks; leftDash++){ //gets the number of dashes to the left
                System.out.print("-"); //prints a dash
            }//closes for loop
                        
            System.out.print("-"); //prints the middle dash
                        
            for(int rightDash=1; rightDash<stacks; rightDash++){ //gets the dashes to the right of the middle dash
                System.out.print("-"); //prints a dash
            }//closes for loop
                        
            for(int space2=1; space2<=(number-stacks); space2++){//loop that gets the number of spaces to right of dashes
                System.out.print(" "); //prints a space
            }//closes for loop
                    
            System.out.println("");//skips a line
            
        }//closes the for loop
    }//ends the method
        
    public static void block(int number, int stacks){ //creates the method block
        for(int lines=1; lines<=stacks; lines++){ //this loop makes the number of rows per stack
            line(number,stacks); //calls method line
        }//closes for loop
    }//ends the method
    
    public static void line(int number, int stacks){ //creates method line
        for(int space1=1; space1<=(number-stacks); space1++){ //loop gets the number of spaces to the left of numbers
            System.out.print(" "); //prints the space 
        } //ends for loop
                    
        for(int leftNumber=1; leftNumber<stacks; leftNumber++){ //loop gets the numbers to the left of the stack number
            System.out.print(stacks); //prints the stack number 
        }//closes for loop
                        
        System.out.print(stacks); //prints one stack number
                        
        for(int rightNumber=1; rightNumber<stacks; rightNumber++){ //loop gets the numbers to the right of the stack number
            System.out.print(stacks); //prints the stack number
        }//closes for loop
                        
        for(int space2=1; space2<=(number-stacks); space2++){ //loop gets the spaces to the right of the stack number
            System.out.print(" "); //prints a space
        }//closes for loop
                        
        System.out.println(""); //skips a line
        
    }//closes method
}//ends class