//Ryan Cooney
//CSE2 HW10 11/17/14
//Poker Odds
//Generates a Random poker hand and runs a monte carlo sim to see how many
//pairs you get out of 10000 with exactly one pair

import java.util.Random; //imports the class Random
import java.util.Scanner; //imports the scanner class
public class PokerOdds{ //creates the class PokerOdds
  public static void main(String [] arg){ //creates the main method
    showHands(); //calls the method showHands
    simulateOdds(); //calls method simulate odds
  } //closes main method

  public static void showHands(){ 
                  
    Scanner scan = new Scanner(System.in); //calls scanner class
    while(true){ //while so it runs continually
        int[] hand ={-1,-1,-1,-1,-1}; //creates the array that will store the hand of cards
        int[] deck = new int[52]; //creates array that is deck of cards
        for(int i=0; i<52; i++){ //loop to create deck
            deck[i] = i; //assigns a number 0-51 to each array spot
        }//closes loop
        System.out.print("Hand: "); //prints hand
        for(int i=0;i<5;i++){ //loop to get hand
            String out=""; //string for output
            int deckNum= 51; //num of cards in a deck
            int target=(int) (Math.random()*deckNum); //gets the random number
            //performs swap
            int temp=deck[target]; 
            hand[i]=temp;
            int swap=deck[deckNum];
            deck[target]=deck[deckNum];
            deck[deckNum]=-1;
            deckNum--; //decrements deckNum
            
            int n=hand[i]; //hand at this point
            int a=(int)(n/13); //gets the suit switch condition
            int b=(n%13); //gets card type switch
            switch(a){ //switch to get suit
                case 0: 
                    out+="C"; 
                    break;
                case 1: 
                    out+="D"; 
                    break;
                case 2: 
                    out+="H"; 
                    break;
                case 3: 
                    out+="S"; 
                    break;
            }
            switch(b){ //switch to get card type
                case 0: 
                    out+="A "; 
                    break;
                case 1: 
                    out+="K "; 
                    break;
                case 2: 
                    out+="Q "; 
                    break;
                case 3: 
                    out+="J "; 
                    break;
                case 4: 
                    out+="10 "; 
                    break;
                case 5:
                    out+="9 "; 
                    break;
                case 6: 
                    out+="8 "; 
                    break;
                case 7: 
                    out+="7 "; 
                    break;
                case 8: 
                    out+="6 "; 
                    break;
                case 9:
                    out+="5 "; 
                    break;
                case 10: 
                    out+="4 "; 
                    break;
                case 11: 
                    out+="3 "; 
                    break;
                case 12: 
                    out+="2 "; 
                    break;
            }
            System.out.print(out); //prints output
            System.out.print(" ");
        }//close loop
        
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //prompts user for input
        String answer=scan.next(); //calls scanner to get answer
        if(answer.equals("y")||answer.equals("Y")){ //if Y or y is entered   
        }//closes if
        else{//if anything else is entered
            break;//breaksout of loop
        }//close else
    }//closes while    
  }//closes method
    
  public static void simulateOdds(){ //creates the method to simulate the odds
    int ace=0,king=0,queen=0,jack=0,ten=0,nine=0,eight=0,seven=0,six=0,five=0,four=0,three=0,two=0;
        //counters for pairs
    for(int i=0; i<10000; i++){ //sets up monte carlo loop
        int[] hand ={-1,-1,-1,-1,-1}; //creates the array that will store the hand of cards
        int[] deck = new int[52]; //creates array that is deck of cards
        for(int o=0; o<52; o++){ //loop to create deck
            deck[0] = 0; //assigns a number 0-51 to each array spot
        }//closes loop
        for(int x=0;x<5;x++){ //loop to get hand
            int deckNum= 51; //num of cards in a deck
            int target=(int) (Math.random()*deckNum); //gets the random number
            //performs swap
            int temp=deck[target]; 
            hand[x]=temp;
            int swap=deck[deckNum];
            deck[target]=deck[deckNum];
            deck[deckNum]=-1;
            deckNum--; //decrements deckNum
        }//close loop
        int n=0; 
        boolean duplicates= FindDuplicates.exactlyOneDup(hand); //calls exactly method to get boolean
        if(duplicates==true){
            for(int q=0; q<5; q++){ //for i less than 10
                for(int p=0; p<5; p++){ //for j less than 10
                    if(hand[q]==hand[p]){ //if theres a duplicate and i does not equal j
                        if(q!=p){
                            n=hand[q];
                            int a =(n%13); //gets card type
                            switch(a){ //switch to increment counters 
                                    case 0: 
                                        ace++; 
                                        break;
                                    case 1: 
                                        king++;
                                        break;
                                    case 2: 
                                        queen++; 
                                        break;
                                    case 3: 
                                        jack++;
                                        break;
                                    case 4: 
                                        ten++;
                                        break;
                                    case 5:
                                        nine++; 
                                        break;
                                    case 6: 
                                        eight++; 
                                        break;
                                    case 7: 
                                        seven++; 
                                        break;
                                    case 8: 
                                        six++; 
                                        break;
                                    case 9:
                                        five++; 
                                        break;
                                    case 10: 
                                        four++;
                                        break;
                                    case 11: 
                                        three++; 
                                        break;
                                    case 12: 
                                        two++; 
                                        break;
                                }//close switch
                        }//close if
                    }// close if 
                }//close for loop 
            }//close for loop
        }//closes if
    }//closes for loop
    
    //prints output
    int nonDups=10000-(ace+king+queen+jack+ten+nine+eight+seven+six+five+four+three+two);
    System.out.println("rank  freq of exactly one pair");
    System.out.println(" A     "+ace);
    System.out.println(" K     "+king);
    System.out.println(" Q     "+queen);
    System.out.println(" J     "+jack);
    System.out.println(" 10    "+ten);
    System.out.println(" 9     "+nine);
    System.out.println(" 8     "+eight);
    System.out.println(" 7     "+seven);
    System.out.println(" 6     "+six);
    System.out.println(" 5     "+five);
    System.out.println(" 4     "+four);
    System.out.println(" 3     "+three);
    System.out.println(" 2     "+two);
    System.out.println("Total not exactly one pair: "+nonDups);
  }//closes method  
} //closes class