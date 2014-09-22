//Ryan Cooney
//CSE Hw04 9/22/2014
//CourseNumber
//Asks for integer between 186510 and 201440. From this 
//determines the semester and year a course was offered.  

import java.util.Scanner; //imports the scanner tool

public class CourseNumber {
    //creates class required for the program
    
    public static void main(String[] args) {
        //creates main method needed for program
        
        Scanner myScanner; //creates an instance of the scanner
        myScanner= new Scanner(System.in); //calls scanner contruct
        
        String semester; //semester that a class was in 
        
        System.out.print(
        "Enter a six digit number giving the course semester: ");
        //asks for the course semester number
        int yearSemester = myScanner.nextInt();
        //calls a method of the scanner to get course semester as int
        
        int semesterCode = yearSemester%100;
        //gets the last two digits of semester code
        int year = (int) (yearSemester/100);
        //gets the first four digits for the year 
        boolean A = (yearSemester>= 186510 && yearSemester<= 201440);
        //creates a boolean variable to see if number entered
        //is in range of allowable 6 digit numbers
        
        if(A){ //if number is in range
            switch(semesterCode){ //sets up the switch statement depending on month
                
                case 10: //if semestercode is 10 
                    semester= "The course was offered in the Spring semester of "+year;
                    //course is offered in spring semester
                    break; //breaks out of switch
                
                case 20: //if semestercode is 20 
                    semester= "The course was offered in the Summer 1 semester of "+year;
                    //course is offered in summer 1 semester
                    break; //breaks out of switch
                    
                case 30: //if semestercode is 30
                    semester= "The course was offered in the Summer 2 semester of "+year;
                    //course is offered in summer 2 semester
                    break; //breaks out of switch
                    
                case 40: //if semestercode is 40
                    semester= "The course was offered in the Fall semester of "+year;
                    //course is offered in fall semester
                    break; //breaks out of switch
                
                default: //if semestercode is not 10,20,30, or 40
                    semester= semesterCode+" is not a legitimate semester";
                    //lets user know what they entered wrong
                    break; //breaks out of switch
                    
            } //ends switch statement
            
             System.out.println(semester);
            //prints the semester and year
            
        } //end if statement   
        
        else{ //if number is not in range
            System.out.println(yearSemester+" is outside the range [186510,201440]");
            //lets user know the number entered is incorrect
        } //end else statement
        
    } //ends main method
} //ends class   
        
            