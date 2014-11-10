//Ryan Cooney   
//CSE2 Lab11
//Learning how to use arrays

import java.util.Scanner;
public class Arrays{
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in); //creates the scanner
        
        int[] numbers = new int[10];
        
        System.out.print("Enter 10 ints- ");
        
        for(int i=0; i<10; i++){
            numbers[i]=scan.nextInt();
        }
        
        int low = min(numbers);
        System.out.println("The lowest entry is "+numbers[low]);
        
        int high= max(numbers);
        System.out.println("The highest entry is "+numbers[high]);
        
        int bigSum=0;
        for(int i=0; i<10; i++){
            bigSum+=numbers[i];
        }
        System.out.println("The sum is "+bigSum);
        
        int[] numbers2 = new int[10];
        for(int i=0; i<10; i++){
            numbers2[10-1-i]=numbers[i];
        }
        for(int i=0; i<10; i++){
            System.out.println(numbers[i]+"    "+numbers2[i]);
        }
        
    }
    public static int min(int[] numbers){
        int minimum = 0;
        for(int i=0; i<10; i++){
            if(numbers[i]<numbers[minimum]){
                minimum=i;
            }
        }
        return minimum;
    }
    
    public static int max(int[] numbers){
        int maximum = 0;
        for(int i=0; i<10; i++){
            if(numbers[i]>numbers[maximum]){
                maximum=i;
            }
        }
        return maximum;
    }
}    
