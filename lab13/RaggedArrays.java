//Ryan Cooney
//CSE2 LAB13
//RaggedArrays
//Sorting a mutlidemensional array with random numbers in ascending order.

public class RaggedArrays{ //creates class
    
    public static void main(String [] args){ //creates main method
        
        int[][] array= new int[5][]; //declares the mutlidimensional array to be used
        
        
        for(int i=0; i<5; i++){ //for one to five
            array[i]= new int[(i*3)+5]; //allocates each member of multidim array
        } //close for
        
        for(int i=0; i<array.length; i++){ //loop to get value into each member
            for(int j=0; j<array[i].length; j++){
                array[i][j]=(int) (Math.random()*40);
            }
        }
        
        System.out.println("The array before sorting");
        for(int i=0; i<array.length; i++){ //loop to print the whole array
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for(int i=0; i<array.length; i++){ //loops that sort the array members
            for(int j=0; j<array[i].length; j++){
                for(int k=0; k<array[i].length; k++){
                    int check=array[i][j];
                    if(array[i][k]>check){
                        array[i][j]=array[i][k];
                        array[i][k]=check;
                    }
                }
            }
        }
        
        System.out.println("The array after sorting");
        for(int i=0; i<array.length; i++){ //loop to print the whole array
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("");
        }
        
    }//close main method    
}//close class    