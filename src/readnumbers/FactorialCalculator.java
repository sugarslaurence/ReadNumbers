package readnumbers;

public class FactorialCalculator {

    //This method expects an integer and returns an interger
    //The integer returned is the highest Fibonacci number less than the integer provided
    
    int FactorialValue (int value) {
       
       int i;
       int result = 1;
       int sum = 1;  
       
       
       for (i = 1; i <= value; i++) {
           
           //System.out.println(value);

           result = result * i;
           
           //System.out.println(result);  
           
       }
    //System.out.println(result);
    return result;  
    
    }

    
}
