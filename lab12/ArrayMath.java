//Ryan Cooney
//CSE2 LAB 13 
//ArrayMath
//Practice with array arithmetic operators.

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println("OUTPUT: "+display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  public static double[] addArrays(double[] array1, double[] array2){
    int count=array1.length;
    double[] addedArray= new double[count];
    
    for(int i=0; i<count; i++){
        if(array2.length==count){
            addedArray[i]= array1[i]+ array2[i];
        }
        if(array2.length!=count){
            double[] newArray={2.3, 13, 14, 0, 0, 0};
            addedArray[i]= array1[i]+newArray[i];
        }
    }  
    return addedArray;  
  }
  
  public static boolean equals(double[] array1, double[] array2){
    if(array1.length!=array2.length){
        return false;
    }
    
    for(int i=0; i<array1.length; i++){
        if(array1[i]!=array2[i]){
            return false;
        }
    }
    
    return true;
    
  }
  
  
  
}