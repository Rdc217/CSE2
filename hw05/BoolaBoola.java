//Ryan Cooney
//CSE2 Hw05 9/28/14
//BoolaBoola.java   
//Three boolean variables to which true or false
//is randomly assigned. Combine the variables with 
//random choices of && and || and store the result.
//Program should present expression to user and ask
//user to state a result.

import java.util.Scanner; //imports the scanner tool

public class BoolaBoola {
    //creates class required for program
    
    public static void main(String[] args) {
        //creates main method needed for program    
        
        Scanner myScanner; //creates and instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        boolean Boola1= (Math.random() < .5); //creates random boolean
        boolean Boola2= (Math.random() < .5); //random boolean2
        boolean Boola3= (Math.random() < .5); //random boolean3
        double andOr=Math.random();   
        //creates variable to decide combination of and and or
        String one="Does "+Boola1+" || "+Boola2+" && "+Boola3+" have the value True(T/t) or False(F/f)? ";
        //creates one of the combinations of and and or
        String two="Does "+Boola1+" || "+Boola2+" || "+Boola3+" have the value True(T/t) or False(F/f)? ";
        //creates one of the combinations of and and or
        String three="Does "+Boola1+" && "+Boola2+" || "+Boola3+" have the value True(T/t) or False(F/f)? ";
        //creates one of the combinations of and and or
        String four="Does "+Boola1+" && "+Boola2+" && "+Boola3+" have the value True(T/t) or False(F/f)? ";
        //creates one of the combinations of and and or
        boolean one2=((Boola1||Boola2)&&Boola3);
        //evaluates one of the and or situations
        boolean two2=((Boola1||Boola2)||Boola3);
        //evaluates one of the and or situations
        boolean three2=((Boola1&&Boola2)||Boola3);
        //evaluates one of the and or situations
        boolean four2=((Boola1&&Boola2)&&Boola3);
        //evaluates one of the and or situations
        
        if(andOr<.25){ //decides if string one
            System.out.print(one); //prints string one
            String input = myScanner.next(); 
            //asks for user to enter true or false
            char trueFalse= input.charAt(0);
            //gets char from string
            switch(trueFalse){ //begin switch statement
                case 't': //if t is entered
                    if(one2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement    
                    break; //breaks out of switch
                    
                case 'T': //if T is entered
                    if(one2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'F': //if F is entered
                    if(one2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement
                    break; //breaks out of switch
                    
                case 'f': //if f is entered
                    if(one2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch 
                    
                default: //if not one of the cases
                    System.out.println("Wrong; try again");
                    //lets user know they are wrong
                    break; //breaks out of switch
            } //ends switch
        } //ends if
        
        else if(.25<=andOr && andOr<.5){ //decides if string twp
            System.out.print(two); //prints string one
            String input = myScanner.next(); 
            //asks for user to enter true or false
            char trueFalse= input.charAt(0);
            //gets char from string
            switch(trueFalse){ //begin switch statement
                case 't': //if t is entered
                    if(two2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'T': //if T is entered
                    if(two2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'F': //if F is entered
                    if(two2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement
                    break; //breaks out of switch
                    
                case 'f': //if f is entered
                    if(two2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch   
                
                default: //if not one of the cases
                    System.out.println("Wrong; try again");
                    //lets user know they are wrong
                    break; //breaks out of switch
            } //ends switch
        } //ends else if
        
        else if(.5<=andOr && andOr<.75){ //decides if string twp
            System.out.print(three); //prints string one
            String input = myScanner.next(); 
            //asks for user to enter true or false
            char trueFalse= input.charAt(0);
            //gets char from string
            switch(trueFalse){ //begin switch statement
                case 't': //if t is entered
                    if(three2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'T': //if T is entered
                    if(three2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement  
                    break; //breaks out of switch
                    
                case 'F': //if F is entered
                    if(three2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'f': //if f is entered
                    if(three2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch 
                    
                default: //if not one of the cases
                    System.out.println("Wrong; try again");
                    //lets user know they are wrong
                    break; //breaks out of switch    
            } //ends switch
        } //ends else if
        
        else if(.75<=andOr && andOr<1){ //decides if string twp
            System.out.print(four); //prints string one
            String input = myScanner.next(); 
            //asks for user to enter true or false
            char trueFalse= input.charAt(0);
            //gets char from string
            switch(trueFalse){ //begin switch statement
                case 't': //if t is entered
                    if(four2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch
                    
                case 'T': //if T is entered
                    if(four2==true){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement  
                    break; //breaks out of switch
                    
                case 'F': //if F is entered
                    if(four2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement  
                    break; //breaks out of switch
                    
                case 'f': //if f is entered
                    if(four2==false){ //if the user is correct
                        System.out.println("Correct");
                        //let user know they are correct
                    } //end if statement
                    else{ //if wrong 
                        System.out.println("Wrong; try again");
                        //lets user know they are wrong
                    } //ends else statement 
                    break; //breaks out of switch   
                
                default: //if not one of the cases
                    System.out.println("Wrong; try again");
                    //lets user know they are wrong
                    break; //breaks out of switch
            } //ends switch        
        } //ends else if
    } //ends the class   
} //ends the main method