
package readnumbers;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class FibonacciFinder {
    
    //This method expects an integer and returns an interger
    //The integer returned is the highest Fibonacci number less than the integer provided
    
    int fibonacciNumber (int value) {
        
        int i;
        int result;
        
        //System.out.println(value);
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);

        //System.out.println(arrayList.get(0));
        
        for (i = 2; i < value; i++){
            
            result = arrayList.get(i - 1) + arrayList.get(i - 2);
            //System.out.println(result);
            
            if (result > value) {
                
                break;
                
            } 
            
            arrayList.add(result);
            //System.out.println(arrayList);
            
        }    
       
        
        int arrayListLength;
        arrayListLength = arrayList.size();
        //System.out.println(arrayListLength);
        
        int lastFibonacciNumber = arrayList.get(arrayListLength - 1);
        //System.out.println(lastFibonacciNumber);
        
        return lastFibonacciNumber;
        
    }




}
