package readnumbers;

public class FactorialCalculator {

    int FactorialValue (int value) {
       
       int i;
       int result = 1;
       int sum = 1;  
       
       
       for (i = 1; i <= value; i++) {
           
           //System.out.println(value);

           result = result * i;
           
           
           
           //System.out.println(total);  
           
       }
    //System.out.println(result);
    return result;  
    
    }

    
}
