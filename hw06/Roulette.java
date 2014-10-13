//Ryan Cooney
//CSE Hw06 10/11/2014
//Roulette
//Runs a Monte Carlo simulation for a game of Roulette.
//You play Roulette 100 times, and the simulation is run 1000
//times. Program computes the number of times you lost 
//everything, total winnings, and the number of time you
//walked away with a profit. 



public class Roulette {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        int number= (int) (Math.random()*38);
            //your random bet on a number between 0 and 37
        
        int monteCarlo = 1000; //number of simulations
        int bets = 100; //number of spins in a simulation
        int counter = 0; //counter for the Monte Carlo
        int win = 0; //counter to see how many times you won
        int lose = 0; //counter to see how many times you lost everything
        int profit= 0; //counter to count number of times you made a profit
        
        
        while(counter < monteCarlo){ //sets up monte carlo sim
            int counter2 = 0; //counter for bets
            int loseEverything = 0; //counts amount of times you don't win in 100 bets
            int makeProfit = 0; //counts if you make a profit for each 100 bets
            
            while(counter2 < bets){ //while counter is less than number of bets
                int roulette= (int) (Math.random()*38);
                //gets a random number [0,37]
                
                if(roulette==number){ //if you win
                    win++; //increments win by 1
                    makeProfit++; //increments make profit
                }//end if
                
                if(roulette!=number){ //if you don't win
                    loseEverything++; //increment loseEverything by 1
                }//close if statement
                
                counter2++; //increments counter 2
            }//closes while loop
            
            if(loseEverything==100){ //if you don't win a round
                lose++; //increments lose by one
            }//close if statement
            
            if(makeProfit>=3){ //if you win three or more times
                profit++; //increments profit
            }//close if statement
            
            counter++; //increments counter 
        }//closes while loop
        
        int totalWinnings$ = win*36;
        //variable to calculate the total winnings
        
        System.out.println("Number of times you lose everything: "+lose);
        //prints the number of times you lose everything

        System.out.println("Your total winnings: $"+totalWinnings$);
        //print total winnings for the whole simulation
        
        System.out.println("You made a profit "+profit+" times");
        
    }//ends main method
}//ends the class    