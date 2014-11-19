import java.util.Scanner; //imports the scanner tool
public class FindDuplicates{ //creates the class
  public static void main(String [] arg){ //creates main method
    Scanner scan=new Scanner(System.in); //creates a scanner construct
    int num[]=new int[10]; //creates integer array of size 10 
    String answer=""; 
    do{//runs code
      System.out.print("Enter 10 ints- "); //prompts user to enter ints
      for(int j=0;j<10;j++){//for each value of array
        num[j]=scan.nextInt(); //calls scanner to get value for each part of array
      }//closes for loop
      String out="The array "; 
      out+=listArray(num); //return a string of the form "{2, 3, -9}" //add the return of list array to out 
      if(hasDups(num)==true){ //if true
        out+="has "; //tells user there are dups
      }//close if
      else{ //if false
        out+="does not have "; //tells user there are no dups
      } //close if
      out+="duplicates.";
      System.out.println(out); //prints the string out
      out="The array "; 
      out+=listArray(num); //return a string of the form "{2, 3, -9}" //add the return of list array to out    
      if(exactlyOneDup(num)==true){ //if exactly one dup returns true
        out+="has ";
      }
      else{ //if it returns false
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out); //prints out
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- "); //asks user if they want to go again
      answer=scan.next(); //calls scanner to get answer
    }while(answer.equals("Y") || answer.equals("y")); //while user enters Y or y
  }//closes main method

  public static String listArray(int num[]){ //method that creates a string listing the contents of the array
    String out="{"; //the bracket in the list
    for(int j=0;j<num.length;j++){ //for loop to get each part of array in the string
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} "; //end bracket of array
    return out; //return out
  } //closes method
  
  public static boolean hasDups(int[] num ){ //method to see if has dups
    int dup=-1; //counter for number of dups accounts for a double count
    for(int i=0; i<10; i++){ //for i less than 10
       for(int j=0; j<10; j++){ //for j less than 10
          if(num[i]==num[j]){ //if theres a duplicate and i does not equal j
              if(i!=j){
                dup++;//increments dup by 1
              }//close if
          }// close if 
       }//close for loop 
    }//close for loop
    if(dup>0){ //if theres a dup return true
        return true;
    }//close if
    else{//if there is no dup
        return false;
    }//close else
  }//ends method   
  
  public static boolean exactlyOneDup(int[] num ){ //method to see if has only one dup 
    int dup=-1; //counter for number of dups accounts for a double count
    for(int i=0; i<num.length; i++){ //for i less than 10
       for(int j=0; j<num.length; j++){ //for j less than 10
          if(num[i]==num[j]){ //if theres a duplicate and i does not equal j
              if(i!=j){
                dup++;//increments dup by 1
              }//close if
          }// close if 
       }//close for loop 
    }//close for loop
    if(dup==1){ //if theres one dup exactly return true
        return true;
    }//close if
    else{//if there is not one dup exactly
        return false;
    }//close else
  }//ends method   
}//closes class