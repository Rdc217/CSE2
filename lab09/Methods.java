//Ryan Cooney
//CSE2 Lab09 10/24/14
//Methods
//Practice with methods!

import java.util.Scanner; //imports the scanner tool
public class Methods{ //creates the class
    public static void main(String [] arg){ //creates the main method
        Scanner scan = new Scanner(System.in); //creates the scanner
        int a,b,c; //initializes integers a b and c
        System.out.println("Enter three ints"); //asks for three ints
        a=getInt(scan); //calls the method getInt to get a
        b=getInt(scan); //calls the method getInt to get b
        c=getInt(scan); //calls the method getInt to get c
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b)); //calls the method larger to print which of a and b are bigger
        System.out.println("The larger of "+a+", "+b+" and "+c+" is "+larger(a,larger(b,c))); //calls the method larger twice to get which of a b and c are larger
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+" and "+c+" are in ascending order"); //calls the method ascending to get if a b and c are in ascending order
    }// ends the main method 
    
    public static int getInt(Scanner scan){ //creates the getInt method
        while(!scan.hasNextInt()){ //while what you enter is not an int       
            if(!scan.hasNextInt()){ //if what you enter is not an int
                scan.next();//calls scanner again
                System.out.print("You did not enter an int; try again- ");//lets user know what they did wrong  
            }//closes the if statemetn
            else{ //if you enter an int
                break; //breaks out of while
            }//closes else statement
        }//closes while loop
        
        int number= scan.nextInt(); //uses the scanner to get number
        return (number); //returns the value of number
    }//closes this method
    
    public static int larger(int a,int b){ //creates method larger to determine larger of two numbers
        if(a>b){ //if a is greater than b
            return(a); //return a
        }//close if
        
        else{ //if b is bigger than a
            return(b); //return b
        }//closes else
    }//ends the method
    
    public static boolean ascending(int a,int b,int c){ //creates the method ascending to see if a b and c are in ascending order 
        if(a<b && b<c){ // if a is less than b and b is less than c
            return (true); //return as true
        }//close if 
        
        else{ // if not true
            return(false); //return false
        }// close else
        
    }//ends the method    
}//ends the class
