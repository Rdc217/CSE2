//Ryan Cooney
//CSE Hw05 9/26/2014
//BurgerKing.java
//Prompts user to enter whether they want burger, soda, or fries.
//The program then prompts user to give details on their choice.

import java.util.Scanner; //imports the scanner tool

public class BurgerKing {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner construct
        
        System.out.print(
        "Enter a letter to indicate a choice of Burger (B or b) Soda (S or s) Fries (F or f) ");
        //prompts user to enter a string indicating your order
        //they want to play
        String order = myScanner.next();
        //calls a method of the scanner to ask for string
        
        if(order.length()==1){
            //order must be of length one
            if(order.equals("B")||order.equals("b")||order.equals("S")||order.equals("s")||order.equals("F")||order.equals("f")){
                //if the string entered it actually a choice
            
                if(order.equals("B")||order.equals("b")){
                    //if the person wants a hamburger
                    System.out.print(
                    "Enter A or a for all the fixins, C or c for cheese, or N or n for none of the above ");
                    //asks what user wants on burger
                    String burger=myScanner.next();
                    //calls a method of scanner to ask for string
                    if(burger.length()==1){
                        //burger must be of length one
                        if(burger.equals("A")||burger.equals("a")||burger.equals("C")||burger.equals("c")||burger.equals("N")||burger.equals("n")){
                            //if the string entered is actually a choice
                            if(burger.equals("A")||burger.equals("a")){    
                                //if they got all the fixins
                                System.out.println("You ordered a burger with all the fixins");
                                //lets user know what they ordered
                            }//ends if statement    
                        
                            if(burger.equals("C")||burger.equals("c")){    
                                //if they got cheese
                                System.out.println("You ordered a burger with cheese");
                                //lets user know what they ordered
                            }//ends if statement  
                            
                            if(burger.equals("N")||burger.equals("n")){    
                                //if they got a plain burger
                                System.out.println("You ordered a plain burger");
                                //lets user know what they ordered
                            }//ends if statement  
                            
                        } //ends if statement
                    
                        else{// if not one of the choices
                            System.out.println("'"+burger+"'"+"is not one of 'A','a','C','c','N', or 'n'");
                            //lets user know what they did wrong
                         }//ends else statement
                        
                    }//ends if statement
                    
                    else{ //if not of length one
                        System.out.println("A single character is expected");
                        //lets user know what they did wrong
                    } //ends else statement
                
                }//ends if statement
                
                if(order.equals("S")||order.equals("s")){
                    //if the person wants a soda
                    System.out.print(
                    "Enter P or p for Pepsi, C or c for Coke, S or s for Sprite, or M or m for Mountain Dew ");
                    //asks what soda user wants
                    String soda=myScanner.next();
                    //calls a method of scanner to ask for string
                    if(soda.length()==1){
                        //soda must be of length one
                        if(soda.equals("P")||soda.equals("p")||soda.equals("C")||soda.equals("c")||soda.equals("S")||soda.equals("s")||soda.equals("M")||soda.equals("m")){
                                //if the string entered is actually a choice
                            if(soda.equals("P")||soda.equals("p")){    
                                //if they got a pepsi
                                System.out.println("You ordered a Pepsi");
                                //lets user know what they ordered
                            }//ends if statement    
                        
                            if(soda.equals("C")||soda.equals("c")){    
                                //if they got coke
                                System.out.println("You ordered a Coke");
                                //lets user know what they ordered
                            }//ends if statement  
                            
                            if(soda.equals("S")||soda.equals("s")){    
                                //if they got a sprite
                                System.out.println("You ordered a Sprite");
                                //lets user know what they ordered
                            }//ends if statement
                                
                            if(soda.equals("M")||soda.equals("m")){    
                                //if they got a mountain dew
                                System.out.println("You ordered a Mountain Dew");
                                //lets user know what they ordered
                            }//ends if statement 
                    
                        }//ends if statement 
                    
                        else{// if not one of the choices
                        System.out.println("'"+soda+"'"+"is not one of 'P','p','C','c','S','s','M', or 'm'");
                        //lets user know what they did wrong
                         }//ends else statement
                    
                    }//ends if statement
                    
                    else{ //if not of length one
                        System.out.println("A single character is expected");
                        //lets user know what they did wrong
                    } //ends else statement
               
                }//ends if statement
                
                if(order.equals("F")||order.equals("f")){
                    //if user wants fries
                    System.out.print(
                    "Do you want a large or small order of fries (L,l,S,s) ");
                    String fries=myScanner.next();
                    //calls a method of scanner to ask for string
                    if(fries.length()==1){
                        //fries must be of length one
                        if(fries.equals("L")||fries.equals("l")||fries.equals("S")||fries.equals("s")){
                            //if the string entered is actually a choice
                            if(fries.equals("L")||fries.equals("l")){    
                                //if they got a large
                                System.out.println("You ordered large Fries");
                                //lets user know what they ordered
                            }//ends if statement
                            
                            if(fries.equals("S")||fries.equals("s")){    
                                //if they got a small
                                System.out.println("You ordered small Fries");
                                //lets user know what they ordered
                            }//ends if statement
                        
                            
                        }//ends if statement
                    
                         else{// if not one of the choices
                        System.out.println("'"+fries+"'"+"is not one of 'L','l','S', or 's'");
                        //lets user know what they did wrong
                         }//ends else statement
                        
                    }//ends if statement
                    
                    else{ //if not of length one
                        System.out.println("A single character is expected");
                        //lets user know what they did wrong
                    } //ends else statement
                    
                }//ends if statement    
                        
            } //ends if statement
                
            else{// if not one of the choices
                System.out.println("'"+order+"'"+"is not one of 'B','b','S','s','F', or 'f'");
                //lets user know what they did wrong
            }//ends else statement    
                
        }//end if statement
            
        else{ //if not of length one
            System.out.println("A single character is expected");
            //lets user know what they did wrong
        } //ends else statement    
            
    }//ends the main method
}//ends the class    