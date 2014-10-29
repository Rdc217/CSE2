/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    System.out.println("You entered "+x+"%");
    //print out the proportion remaining for select percentages
    percent=(1-(x/100)); //percent remaining calculation
    int percent1= (int) (percent*100);
    if(percent1==93)  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    if(percent1==59)//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    if(percent1==86)//when the user enters 14
      System.out.println("The proportion remaining is "+0.86);
    if(percent1==67)//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    if(percent1==40)//when the user enters 60
      System.out.println("The proportion remaining is "+0.40);
   }
}

/* Error report: 
 *   When the user entered 7,41 , and 33 the number
 *   after finding the proportion remaining was
 *   not exactly 93,59,and 67 respectively.  
 *   So I multplied all numbers by 100 and converted
 *   to an int and multiplied the number on the right of ==
 *   by 100 to fix it.   
 /