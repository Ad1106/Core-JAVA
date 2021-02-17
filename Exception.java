// there are two types of exception in java ..... one is input mismatch exception and other is arithmetic exception ..... 


//we can use one try block and several catch block




import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        try{
            int x=cin.nextInt(),y=cin.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().toString().substring(6));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}