
package readnumbers;


public class PrimeIdentifier {
    
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

                isPrime = false;
                
                break;
                }
        }
        System.out.println(isPrime);
        return isPrime; 
    
    }
    
}
