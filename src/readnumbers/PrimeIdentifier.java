
package readnumbers;


public class PrimeIdentifier {
    
    //This method returns either true or false depending on whether the parsed value is prime or not
    
    boolean primeValue (double value) {
 
        boolean isPrime = true; 
        
        int k;
 
        //System.out.println(value);
        
        for (k = 2; k < value; k++) {
                
                //System.out.println(value);
                
                double j;
                j = value/k;
                
                //System.out.println(j);
                
                if (j == (int)(j)) {
                //Determines if j is an integer    

                isPrime = false;
                
                break;
                }
        }
        //System.out.println(isPrime);
        return isPrime; 
    
    }
    
}
