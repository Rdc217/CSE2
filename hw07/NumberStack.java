//Ryan Cooney
//CSE Hw07 10/20/2014
//Root
//Uses three different kinds of loop to print a stack of ints
//based on an int that you enter. 

import java.util.Scanner; //imports the Scanner tool

public class NumberStack {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        System.out.print("Enter a integer between 1 and 9: ");
        //asks the user to enter int betw 1 and 9
    
        if(myScanner.hasNextInt()){ //input is an int
            int number = myScanner.nextInt();
            //calls method of scanner to get number
            
            if (number>=1 && number<=9){ //if int is between 1 and 9
                
                for(int stacks=1; stacks<= number; stacks++){ //this loop makes the number of stacks
                    for(int lines=1; lines<=stacks; lines++){ //this loop makes the number of rows per stack
                        
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
                    }//closes for loop
                    
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
                }//ends for loop    
            
            
                int stacks=1; //initialiizes the counter for the number of stacks
                
                while(stacks<= number){ //while the number of stacks is less or equal to number you entered
                        int lines=1; // initializes the counter of lines per stack
                        
                        while(lines<=stacks){ //while the number of lines is equal to or less than number of stacks
                            int space1=1; //counter for the number of spaces to left of number
                            int leftNumber=1; //counter for number of numbers to left of stack number
                            int rightNumber=1; //counter for the number of numbers to right of stack number
                            int space2=1; //counter for number of spaces to right of numbers  
                            
                            while(space1<=(number-stacks)){ //while space1 is less than or equal to number you entered minus stacks
                                System.out.print(" "); //prints the space 
                                space1++; //increments space1 by 1
                            } //ends while loop
                        
                            while(leftNumber<stacks){ //while leftNumber is less than the number of stacks
                                System.out.print(stacks); //prints the stack number 
                                leftNumber++; //increments left number by 1
                            }//closes while loop
                            
                            System.out.print(stacks); //prints one stack number
                            
                            while(rightNumber<stacks){ //while rightNumber is less than the number of stacks
                                System.out.print(stacks); //prints the stack number 
                                rightNumber++; //increments  rightnumber by 1
                            }//closes while loop
                            
                            while(space2<=(number-stacks)){ //while space2 is less than or equal to number you entered minus stacks
                                System.out.print(" "); //prints the space 
                                space2++; //increments space2 by 1
                            } //ends while loop
                            
                            System.out.println(""); //skips a line
                        
                            lines++; //increments lines by one
                        }//closes while loop
                        
                        int space1=1; //counter for the number of spaces to left of dashes
                        int leftDash=1; //counter for number of dashes to left of middle dash
                        int rightDash=1; //counter for the number of dashes to right of middle dash
                        int space2=1; //counter for number of spaces to right of dashes
                        
                        
                        while(space1<=(number-stacks)){ //while space1 is less than or equal to number you entered minus stacks
                            System.out.print(" "); //prints the space 
                            space1++; //increments space1 by 1
                        } //ends while loop
                        
                        while(leftDash<stacks){ //gets the number of dashes to the left
                            System.out.print("-"); //prints a dash
                            leftDash++; //increments leftdash by 1
                        }//closes while loop
                            
                        System.out.print("-"); //prints the middle dash
                            
                        while(rightDash<stacks){ //gets the dashes to the right of the middle dash
                            System.out.print("-"); //prints a dash
                            rightDash++; //increments right dash by 1
                        }//closes while loop
                            
                        while(space2<=(number-stacks)){ //while space2 is less than or equal to number you entered minus stacks
                            System.out.print(" "); //prints the space 
                            space2++; //increments space2 by 1
                        } //ends while loop
                        
                        System.out.println("");//skips a line
                
                    stacks++; //increments stacks by one
                }//ends while loop      
                
                int stacks2=1; //initializes number of stacks as 1
                
                do{ //runs the code to get the number of stacks you want
                        int lines=1; // initializes the counter of lines per stack
                        
                        do{ //runs the code to get the number of lines you want per stack
                            int space1=1; //counter for the number of spaces to left of number
                            int leftNumber=1; //counter for number of numbers to left of stack number
                            int rightNumber=1; //counter for the number of numbers to right of stack number
                            int space2=1; //counter for number of spaces to right of numbers  
                            
                            do{ //runs the code to print the spaces before the numbers in a line
                                if(space1<=(number-stacks2)){//if statement to restrict the output to only when the while loop is inside its parameters  
                                    System.out.print(" "); //prints the space 
                                    space1++; //increments space2 by 1
                                }//closes if statement
                            }while(space1<=(number-stacks2)); //while space1 is less than or equal to number you entered minus stacks
                        
                            do{ //runs the code to print the numbers to the left of the middle number
                                if(leftNumber<stacks2){//if statement to restrict the output to only when the while loop is inside its parameters  
                                    System.out.print(stacks2); //prints the stack number 
                                    leftNumber++; //increments  rightnumber by 1
                                }//closes if statement  
                            }while(leftNumber<stacks2);//while leftNumber is less than the number of stacks
                            
                            System.out.print(stacks2); //prints one stack number
                            
                            do{ //runs the code to print the numbers to the right of the middle number 
                                if(rightNumber<stacks2){//if statement to restrict the output to only when the while loop is inside its parameters
                                    System.out.print(stacks2); //prints the stack number 
                                    rightNumber++; //increments  rightnumber by 1
                                }//closes if statement
                            }while(rightNumber<stacks2); //while rightNumber is less than the number of stacks
                            
                            do{ //runs the code to print the spaces to the left of the numbers in a line
                                if(space2<=(number-stacks2)){ //if statement to restrict the output to only when the while loop is inside its parameters  
                                    System.out.print(" "); //prints the space 
                                    space2++; //increments space2 by 1
                                }//closes if statement
                            }while(space2<=(number-stacks2)); //while space2 is less than or equal to number you entered minus stacks
                            
                            System.out.println(""); //skips a line
                        
                            lines++; //increments lines by one
                        }while(lines<=stacks2); //while the number of lines is equal to or less than number of stacks
                        
                        int space1=1; //counter for the number of spaces to left of dashes
                        int leftDash=1; //counter for number of dashes to left of middle dash
                        int rightDash=1; //counter for the number of dashes to right of middle dash
                        int space2=1; //counter for number of spaces to right of dashes
                        
                        
                        do{ //runs the code to get the number of spaces before the dashes
                            if(space1<=(number-stacks2)){ //if statement to restrict the output to only when the while loop is inside its parameters  
                                System.out.print(" "); //prints the space 
                                space1++; //increments space2 by 1
                            }//ends if statement 
                        }while(space1<=(number-stacks2)); //while space1 is less than or equal to number you entered minus stacks
                        
                        do{ //runs the code to get the number of dashes to the left of the middle dash
                            if(leftDash<stacks2){//if statement to restrict the output to only when the while loop is inside its parameters  
                                System.out.print("-"); //prints a dash
                                leftDash++; //increments leftdash by 1
                            }//closes if statement
                        }while(leftDash<stacks2);//gets the number of dashes to the left
                            
                        System.out.print("-"); //prints the middle dash
                            
                        do{ //runs the code to get the dashes to the right of the middle dash
                            if(rightDash<stacks2){//if statement to restrict the output to only when the while loop is inside its parameters  
                                System.out.print("-"); //prints a dash
                                rightDash++; //increments leftdash by 1
                            }//closes if statement
                        }while(rightDash<stacks2);//gets the dashes to the right of the middle dash
                            
                        
                        do{ //runs the code to get the number of spaces to the right of the dashes
                            if(space2<=(number-stacks2)){ //if statement to restrict the output to only when the while loop is inside its parameters  
                                System.out.print(" "); //prints the space 
                                space2++; //increments space2 by 1
                            }//ends if statement    
                        }while(space2<=(number-stacks2)); //while space2 is less than or equal to number you entered minus stacks
                        
                        System.out.println("");//skips a line
                
                    stacks2++; //increments stacks by one
                }while(stacks2<= number); //while the number of stacks is less than the number you entered
                    
            }//closes the if statement
       
            else{ //if anything not in this range is entered
                System.out.println("You did not enter an integer between 1 and 9");
                //lets user know what they did wrong
            }//close else statement
        
        }//closes the if statement
        
        else{ //if not an int
            System.out.println("You did not enter an integer between 1 and 9");
            //lets user know what they did wrong
        } //closes else statement
        
    }//ends main method
}//ends class    