//Ryan Cooney
//CSE Lab05 9/26/2014
//RandomGames
//Asks user if they want to play Roulette, Craps, or picking a card.
//Based on which game the user picks the program will return an output
//as if you played that game.

import java.util.Scanner; //imports the scanner tool

public class RandomGames {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        System.out.print(
        "Enter R or r for Roulette, C or c for craps, P or p for pick a card- ");
        //prompts user to enter a string indicating which game
        //they want to play
        String game = myScanner.next();
        //calls a method of the scanner to ask for string
        
        if(game.length()==1){
            //game must be of length one
            if (game.equals("R")||game.equals("r")||game.equals("C")||game.equals("c")||game.equals("P")||game.equals("p")){
                //if the string entered it one of the games    
                
                if(game.equals("R")||game.equals("r")){
                    //if the game is Roulette
                    
                    int roulette= (int) (Math.random()*38);
                    //gets a random number [0,37]
                    
                    switch(roulette){ //begins switch regarding roulette
                        
                        case 37: 
                            System.out.println("Roulette: 00");
                            //prints the 00 case
                            break;
                            //breaks out of switch
                        
                        default:
                            System.out.println("Roulette: "+roulette);
                            //prints the roulette value
                            break;
                            //breaks out of switch
                    }//ends switch statement
                }//ends if statement
                    
                
                if(game.equals("C")||game.equals("c")){
                    //if the game is Craps
                    System.out.println("Craps option is yet to be implemented");
                    //tells user they cannot play craps
                }//ends if statement
                
                if(game.equals("P")||game.equals("p")){
                    //if the game is Craps
                    System.out.println("Picking a card is yet to be implemented");
                    //tells user they cannot play cards
                }//ends if statement
                
            } //end if
            
            else{
                //if the user enters a string not indicating one of the games
                System.out.println("'"+game+"'"+"is not one of 'R','r','C','c','P', or 'p'");
                //lets user know what they did wrong
            }//end else
        }//ends if statement
        
        else{
            //if game is not of length one
            System.out.println("A single character is expected");
            //lets user know what they did wrong
        } //ends else
    }//ends main method
}//ends the class    