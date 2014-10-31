public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90)); 
    }

    public static int addDigit(int number,int digit){
        if(digit>=0 && digit<=9){
            if(number<0){
                int posNumber=number*(-1);    
                String str= ""+digit+""+posNumber;
                int output = Integer.parseInt(str);
                output=output*(-1);
                return(output);
            }            
            String str= ""+digit+""+number;
            int output = Integer.parseInt(str);
            return(output);
        }
        
        else{
            return(number);
        }
    }
    
    public static int join(int number, int digit){
          if(number<0 && digit<0){
                int posNumber=number*(-1); 
                int posDigit= digit*(-1);
                String str= ""+posNumber+""+posDigit;
                int output = Integer.parseInt(str);
                return(output);
            }            
            String str= ""+number+""+digit;
            int output = Integer.parseInt(str);
            return(output);
    }
    
    
    
    
}  

    