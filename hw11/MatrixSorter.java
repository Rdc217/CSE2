//Ryan Cooney
//CSE2 HW11 12/4/14
//MatrixSorter
//Create a 3D array and then use selection sort and insertion sort to sort the 3rd slab.

public class MatrixSorter{ //creates class
  public static void main(String arg[]){ //creates main method
    int mat3d[][][]; //intializes the 3d array
    mat3d=buildMat3d(); //calls method to build 3d array
    show(mat3d); //prints the array
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d)); //calls method to find min across whole array and prints it
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);//calls method to sort the 3rd slab of array
    show(mat3d); //prints the array
  }
   
  public static int[][][] buildMat3d(){ //method returns the built 3d array
      int array[][][]=new int[3][][]; //creates new array with 3 slabs
      for(int s=0;s<3;s++){ //allocates number of rows for each slab
          array[s]=new int[3+2*s][];
      }
      for(int s=0;s<3;s++){ //number of slabs
          for(int j=0;j<array[s].length;j++){ //loop that gets number of members in row
              array[s][j]=new int[s+j+1];
          }
      }
      for(int s=0;s<3;s++){ //set of loops that sets a random number to each member of each row
          for(int j=0;j<array[s].length;j++){
              for(int k=0;k<array[s][j].length;k++){
                    array[s][j][k]=(int) (Math.random()*99)+1;  
              }
          }
      }
    return array; //returns your 3d array
  }//closes method 
   
  public static void show(int[][][] array){ //method to print the array
      for(int s=0;s<3;s++){ //number of slabs
          System.out.println("----------------Slab "+(s+1)); //prints slab line
          for(int j=0;j<array[s].length;j++){ //number of rows
              for(int k=0;k<array[s][j].length;k++){ //members of rows
                    System.out.print(array[s][j][k]); //prints each member of each row of each slab
                    System.out.print(" ");//space in between numbers
              }
              System.out.println(""); //skips line
          }
          System.out.println(""); //skips line
      }
  } 
    
  public static int findMin(int[][][] array){ //method to find the smallest number in whole 3d array
      int min=array[0][0][0]; //first member of first slab is min
      for(int s=0;s<3;s++){
          for(int j=0;j<array[s].length;j++){
              for(int k=0;k<array[s][j].length;k++){ //three loops that check each row, slab and member
                if(array[s][j][k]<min){ //if the member you are at is less than the current min
                    min=array[s][j][k]; //sets min to that number
                }
              }
          }
      }
      return min; //returns the min
  }  
    
  public static void sort(int[][] array){ //method to sort the 3rd slab
    for(int a=0;a<array.length;a++){ //runs the selection sort
      for(int i=0;i<array[a].length;i++){//pointer to check every value
        int index=i; //index to use in arrays
        for(int j=i;j<array[a].length;j++){//pointer to check for min
            if(array[a][j]<array[a][index]){ //if you find your min
              index=j; //set the index to that spot
            }
        }
        //code for the swap
        int min=array[a][index]; 
        array[a][index]=array[a][i]; 
        array[a][i]=min;
      }
    }
    
    for(int j=1;j<array.length;j++){ //loop for the insertion sort
      int[] key=makeTemp(array[j]); //creates an array copy to use as your key
      int i; //intitalizes i
      for(i=j-1; (i>=0) && (array[i][0]>array[j][0]);i--){ //checks the array spot before it see if its smaller
        array[i+1]=makeTemp(array[i]); //performs swap
      }
      array[i+1]=key; //finishs swap
    }
    
  }//close method
  
  public static int[] makeTemp(int[] array){ //method that creates your temp array
    int[] temp= new int[array.length]; //creates new array of the inputs length
    for(int i=0;i<array.length;i++){ //loop to copy the array
      temp[i]=array[i];
    }
    return temp; //returns the array
  }//closes the method
  
    
}