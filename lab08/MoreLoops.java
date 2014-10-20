import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
	Scanner scan=new Scanner(System.in);
	int n=0;

	System.out.print("Enter an int- "); //asks user to enter int
	do{ //runs this code at least once
	    if(!scan.hasNextInt()){ //if user doesnt enter int
	    scan.next(); //get rid of the junk entered by user
	    System.out.print("You did not enter an int; try again- "); //tells user what they did wrong
	    }//closes if statement
	    else{ //if an int is entered
	        break; //breaks out of do while
	    } //ends else statement
	}while(!scan.hasNextInt()); //runs this code while the number entered is not an int

        n=scan.nextInt(); //sets n equal to int entered
    
    int j=0; //counter j is zero

	while(j<n && j<40){ //while j is less than n and less than 40
	    int k=0; //counter k is zero
	    while(k<j+1){ //while is less than j+1
		    System.out.print('*'); //prints a star without making new line
	        k++; //increments k by one
	    } //closes while loop
	    System.out.println(); // skips a line in between rows of stars
	    j++; //increments j by one
    }//closes while loop
	
      
	int k=4; //k is equal to 4

    while(k==4){ //while k is equal to 4 
        System.out.println("k="+k); //prints the value of k
	    k++; //increments k
    }//breaks out of while loop
        

        
        for(int count=0; count<=10; count++){ //for count initially 0, that is less than or = to 10, increment by 1
	        if(n>5 || n<=0){ //if n is greater than 5 or less than or equal to 0
	            System.out.println(n + " is > 5 or <1"); //prints the inequality
	        }//closes if statement		
	        if(n==1||n==2){ //if n is 1 or 2 
	            System.out.print("Case 2 "); //prints case 2 
	           count--; //decrements count to make the loop infinite
	        }//closes if statement    
		    if(n==3){ //if n is 3
	            break; //breaks out of loop
		    }//closes if statement
		    if(n==4){ //if n is four
		        System.out.println("Case 4"); //print case 4
	            System.out.println("Case 5"); //print case 5
		    }//closes if statement
		    if(n==5){ //if n is 5
		        System.out.println("Case 5"); //prints case 5
		    }//closes if statement
	    }//closes the for loop
	
    }//ends main method
}//ends the class
