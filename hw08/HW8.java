//Ryan Cooney   
//CSE2 hw08 10/26/14
//HW8
//More practice with methods


import java.util.Scanner; //imports the scanner tool
public class HW8{ //creates the class
  public static void main(String []arg){ //creates the main method
		char input; //intializes char input
		Scanner scan=new Scanner(System.in); //creates the scanner
		System.out.print("Enter 'C' or 'c' to continue- ");//asks user to enter inputs
		input=getInput(scan,"Cc"); //sets the value of input to output of method getInput
		System.out.println("You entered '"+input+"'");//lets user know what they entered
		System.out.print("Enter 'y', 'Y', 'n', or 'N'- "); //asks user for another input
		input=getInput(scan,"yYnN",5); //sets input equal to output of method getInput and give up after 5 attempts
		if(input!=' '){ //if input isnt equal to ' ' 
   		System.out.println("You entered '"+input+"'"); //lets user know what they entered
		}//closes if statement
		input=getInput(scan,"Choose a digit.","0123456789"); //sets input equal to output of method getInput
		System.out.println("You entered '"+input+"'"); //prints the value of input
  }//ends the main method  
  
  public static char getInput(Scanner scan, String word){ //creates method getInput
	  while(true){//sets up infinite loop	
	  	while(scan.hasNextInt()){ //while an int is entered
	  		System.out.print("You did not enter a character from the list '"+word+"'; try again ");//lets user know what they did wrong
	  		scan.next();//calls scanner again
	  	}//closes while loop	
	  	String str = scan.next(); //calls scanner to get a string
	  	if(str.length()!=1){//if the string isnt of length one
	  		System.out.print("You should enter exactly one character- ");//lets user know what they did wrong
	  		continue;//continues to top of loop
	    }//closes if
    	char input = str.charAt(0);//gets first char in string
    	if(input=='C' || input=='c'){ //if C or c
    		return (input); //returns input
    	}//closes if 
    	else{//if not C or c
    		System.out.print("You did not enter a character from the list '"+word+"'; try again ");//lets user know what they did wrong
    		continue;//continues to top of loop
    	}//closes else
   }//close while loop
  }//closes the method		
  	
  public static char getInput(Scanner scan, String word, int tries){ //creats method getInput
	  int counter=0;//counter is initially zero
	  while(counter<tries){//while counter is less than tries	
	  	while(scan.hasNextInt()){//if an int is entered
	  		++counter;//increments counter
	  		if(counter<tries){//if counter is less than tries
	  		System.out.print("You did not enter a character from the list '"+word+"'; try again- ");//lets user know what they did wrong
	  		}//closes if
	  		if(counter==tries){//if the counter is equal to tries
	  			break;//breaks out of while loop
	  		}//closes if
	  		scan.next(); //calls scanner again
	  	}//closes while loop	
	  	String str = scan.next(); //calls scanner to get string
	  	if(str.length()!=1){//if the string is not of length one
	  		System.out.print("You should enter exactly one character- "); //lets user know what they did wrong
	  		++counter; //increments counter
	  		continue;//continues to top of loop
	    }//closes if
    	char input = str.charAt(0); //gets first char from string 
    	if(input=='y' || input=='Y' || input=='n' || input=='N'){//if input is y,Y,n, or N
    		return (input); //returns input
    	}//ends if
    	else{//if not yYnN
    		System.out.print("You did not enter a character from the list '"+word+"'; try again- ");//lets user know what they did wrong
    		++counter; //increments counter by 1
    		continue; //continues on to top of loop
    	}//closes else
   }//closes while
   
   System.out.println(""); //skips a line
   System.out.println("You have failed after five tries"); //lets user know they failed
   String str=" "; //string is a space
   char input=str.charAt(0); //gets first char of string
   return (input); //returns input as a string with value space
  }//closes the method	
  
  public static char getInput(Scanner scan, String word, String digits){ //creates method getInput
	  	System.out.println(word); //asks user for digit
	  	System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-"); //prompts user to enter digit
	  while(true){//sets up infinite loop	
	  	while(!scan.hasNextInt()){ //while user does not enter int
	  		System.out.println("You did not enter a character from the list '"+digits+"'");//lets user know what they did wrong
	  		System.out.println(word); //asks user to choose digit
	  		System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-");//asks user for input
	  		scan.next(); //calls scanner again
	  	}//closes while
	  	int number=scan.nextInt(); //calls scanner to get an int
	  	if(number<0 || number>9){ //if a number is entered that is not a digit
	  		System.out.println("You did not enter a character from the list '"+digits+"'"); //lets user know what they did wrong
	  		System.out.println(word); //asks user to choose digit
	  		System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'-"); //prompts user to enter input
	  		continue; //continues to beginning of loop
	  	}//closes if	
	  	else{ //if number is in range
	  	String str= ""+number; //puts the number in the string
    	char input = str.charAt(0); //input is the first character in the string
	  	return(input); //returns the value of input
	  	}//closes else
   } //ends while loop
  }//closes the method  
}//ends the class