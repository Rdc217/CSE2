//Ryan Cooney
//CSE2 HW11 12/4/14
//MatrixSorter
//Create a 3D array and then use selection sort and insertion sort to sort the arrays.

public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    //show(mat3d);
  }
   
  public static int[][][] buildMat3d(){
      int array[][][]=new int[3][][];
      for(int s=0;s<3;s++){
          array[s]=new int[3+2*s][];
      }
      for(int s=0;s<3;s++){
          for(int j=0;j<array[s].length;j++){
              array[s][j]=new int[s+j+1];
          }
      }
      for(int s=0;s<3;s++){
          for(int j=0;j<array[s].length;j++){
              for(int k=0;k<array[s][j].length;k++){
                    array[s][j][k]=(int) (Math.random()*99)+1;  
              }
          }
      }
    return array;
  } 
   
  public static void show(int[][][] array){
      for(int s=0;s<3;s++){
          System.out.println("----------------Slab "+(s+1));
          for(int j=0;j<array[s].length;j++){
              for(int k=0;k<array[s][j].length;k++){
                    System.out.print(array[s][j][k]);
                    System.out.print(" ");
              }
              System.out.println("");
          }
          System.out.println("");
      }
  } 
    
  public static int findMin(int[][][] array){
      int min=array[0][0][0];
      for(int s=0;s<3;s++){
          for(int j=0;j<array[s].length;j++){
              for(int k=0;k<array[s][j].length;k++){
                if(array[s][j][k]<min){
                    min=array[s][j][k];
                }
              }
          }
      }
      return min;
  }  
    
  public static void sort(int[][] array){
    columnSort(array);
    //rowSort(array);
  }
  
  public static void columnSort(int[][] array){
      for(int a=0;a<array.length;a++){
        
      }
  }
  
  public static void rowSort(int[][] array){
    
  }
    
}