//Ryan Cooney
//CSE2 HW11 12/3/14
//PokerHands
//Use the scanner to get a hand of five cards and then determine what 
//kind of hand the user has.

import java.util.Scanner; //imports the scanner tool

public class PokerHands{ //creates class
	public static void main(String [] args){ //creates main method
		Scanner scan=new Scanner(System.in); //creates the scanner 
		while(true){ //all the code wrapped in an infinite loop to keep it running
			System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- "); //ask for input
			String answer=scan.next();
			int[] hand=new int[5];//array to hold int form of hand
			
			if(answer.equals("y")||answer.equals("Y")){ //if you want a hand
				for(int i=0; i<5; i++){ //loop gets a hand of five
					while(true){ //two infinite loops to allow checking for wrong inputs	
						while(true){
							System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- "); //prompt input
							String suit=scan.next();
							if(suit.equals("c")){ //next four ifs assign a number value to each suit
								hand[i]=0;
								break;
							}
							else if(suit.equals("d")){
								hand[i]=1;
								break;
							}
							else if(suit.equals("h")){
								hand[i]=2;
								break;
							}
							else if(suit.equals("s")){
								hand[i]=3;
								break;
							}
							
							else{
								System.out.println("You did not enter a valid response"); //lets user know what they did wrong
							}
						}
						
						
						System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- "); //asks for input
						String strFace=scan.next();
						if(strFace.equals("10")){ //since 10 is not a char I made a char to represent it
							strFace="t";
						}
						char face= strFace.charAt(0); //makes each face into char for switch
						switch(face){ //switch statement that calculates card number from 0 to 51 inclusive
							case 'a':
								hand[i]=(hand[i]*13)+0;
								break;
							case 'k':
								hand[i]=(hand[i]*13)+1;
								break;
							case 'q':
								hand[i]=(hand[i]*13)+2;
								break;
							case 'j':
								hand[i]=(hand[i]*13)+3;
								break;
							case 't' :
								hand[i]=(hand[i]*13)+4;
								break;
							case '9':
								hand[i]=(hand[i]*13)+5;
								break;
							case '8':
								hand[i]=(hand[i]*13)+6;
								break;
							case '7':
								hand[i]=(hand[i]*13)+7;
								break;
							case '6':
								hand[i]=(hand[i]*13)+8;
								break;
							case '5':
								hand[i]=(hand[i]*13)+9;
								break;
							case '4':
								hand[i]=(hand[i]*13)+10;
								break;
							case '3':
								hand[i]=(hand[i]*13)+11;
								break;
							case '2':
								hand[i]=(hand[i]*13)+12;
								break;
						}
						int counter=0; //counter to see if same card is entered
						for (int j=0; j<i;j++){ //checks to see if a duplicate card has been entered
							if(hand[i]==hand[j]){
								counter++;
							}
						}
						if(counter==0){ //if you are good you break out of infinite loop 
							break;
						}
						else{
							System.out.println("You already entered that card"); //if not you get error statement
						}
					}
				}
			}
			
			else{//quits if you don't want hand
				break;
			}
			
			showOneHand(hand); //calls method to show what hand you have
			int[][] check=getRank(hand); //calls method getRanks
			showRank(check);//calls method showRank
		}
	} //closes main method
	
	public static void showOneHand(int hand[]){ 
		String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};//two arrays have different values to be put in out
		String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ","4 ","3 ","2 "};
		String out=""; //what we will be printing
		for(int s=0;s<4;s++){ //checks the suit
  			out+=suit[s]; //puts the suit in out
  			for(int rank=0;rank<13;rank++){ //checks rank
    			for(int card=0;card<5;card++){ //loop to find what rank card you have and add it to out
     				if(hand[card]/13==s && hand[card]%13==rank)
      					out+=face[rank];
  				}
  			}
  		out+='\n'; //adds space to out	
		}
	System.out.println(out); //prints out
  	}//closes method
  	
  	public static int[][] getRank(int hand[]){ //this method creates array that stores the stats of you cards
  		int[][] check=new int[13][5]; //creates new array
  		for(int i=0;i<check.length;i++){ //initializes all values of array as 0
  			for(int j=0; j<check[i].length;j++){
  				check[i][j]=0;
  			}
  		} 
  		
		for(int j=0;j<5;j++){ //this for loop counts the frequency of each face along with the suit(s) 	
		  	for(int i=0;i<13;i++){
		  		int faceCheck=hand[j]%13;
		  		int suitCheck=(int)(hand[j]/13);
		  		if(faceCheck==i || hand[j]==i){
		  			check[i][0]++;
			  		if(suitCheck==0){
			  			check[i][1]++;
			  		}
			  		if(suitCheck==1){
			  			check[i][2]++;
			  		}
			  		if(suitCheck==2){
			  			check[i][3]++;
			  		}
			  		if(suitCheck==3){
			  			check[i][4]++;
			  		}
		  		}	
		  	}
		}
  		return check; //returns check
  	}//closes method
  	
  	public static void showRank(int[][] array){ //tells user what kind of hand they have
  		//all the counters that are needed names explain what they are for
  		int pair=0; 
  		int straight=0;
  		int fourKind=0;
  		int flushc=0;
  		int flushd=0;
  		int flushh=0;
  		int flushs=0;
  		int fullHouse=0;
  		int royal=0;
  		int genFlush=0;
  		int highCard=0;
  		String out=""; //string for the output to be printed
  		
  		for(int i=0;i<13;i++){ //loop that counts different hand patterns
  			if(array[i][0]==2){//check to see if you have a pair
  				pair++;
  			}
  			if(array[i][0]==4){ //check to see if you have four of a kind
  				fourKind++;
  			}
  			if(array[i][0]==3){ //check to see if you have three of kind
  				fullHouse++;
  			}
  		}
  		
  		for(int i=0;i<=8;i++){ //loop to check if you have a straight
  			if((array[i][0]==1)&&(array[i+1][0]==1)&&(array[i+2][0]==1)&&(array[i+3][0]==1)&&(array[i+4][0]==1)){
  				straight++;
  			}
  		} 
  		
  		for(int i=0;i<13;i++){ //loop to check if you have a flush
  			if(array[i][1]==1){ //clubs
  				flushc++;
  			}
  			if(array[i][2]==1){//diamonds
  				flushd++;
  			}
  			if(array[i][3]==1){//hearts
  				flushh++;
  			}
  			if(array[i][4]==1){//spades
  				flushs++;
  			}
  		}
  		
  		for(int i=0;i<5;i++){ ///loop to check is your flush is royal
  			if(array[i][0]==1){
  				royal++;
  			}
  		}
  		
  		if(pair==1){ //if your pair is one 
  			out="You have a Pair"; //changes output
  			highCard++;//increments high card so you know you don't have that kind of hand
  		} 
  		if(pair==2){ //if you have two pairs
  			out="You have Two Pair";
  			highCard++;
  		}
  		if(straight==1){ //if you have a straight
  			out="You have a Straight";
  			highCard++;
  		}
  		if((flushc==5)||(flushd==5)||(flushh==5)||(flushs==5)){ //if one of the flushes is 5 you have a flush
  			out="You have a Flush";
  			highCard++;
  			genFlush++; //counter for if you have a flush in general
  		}
  		if((pair==1)&&(fullHouse==1)){ //if you have a pair and three of a kind you have a full house
  			out="You have a Full House";
  			highCard++;
  		}
  		if(fourKind==1){ //if you have four of a kind
  			out="You have Four of a Kind";
  			highCard++;
  		}
  		if((straight==1)&&(genFlush==1)){ //if you have a straight and a flush in general 
  			out="You have a Straight Flush";
  			highCard++;
  		} 
  		if(royal==5&&genFlush==1){ //if royal is 5 and you have a flush then you have a royal flush
  			out="You have a Royal Flush";
  			highCard++;
  		}
  		if(highCard==0){ //if high card was never incremented then you have a high card hand
  			out="You have High Card";
  		}
  		System.out.println(out); //prints your output
  	}//closes method
}//closes class	