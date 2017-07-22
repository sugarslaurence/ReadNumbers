
package readnumbers;

import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class ReadNumbers {

  
    public static void main(String[] args) throws IOException {

        
        String file_name = "/Users/laurencesugars/Documents/ListOfNumbers.txt";
        
        ReadFile file = new ReadFile (file_name);
        //System.out.println(file);
        
        int [] fileLines = file.OpenFile();
        
        int k, sum;
        k = 0;
        sum = 0;
        
        Arrays.sort(fileLines);
        
        //finds sum of list    
        
            while (k < fileLines.length) {
                sum = sum + fileLines[k];
                //System.out.println(fileLines[j]);
                k++;

            }
        
            //System.out.println(sum);
        
        //finds average of list
        
            int average;
            average = sum/fileLines.length;
        
        
            //System.out.println(average);
        
        
        //prints ordered list of array
            
            for (k = 0; k < fileLines.length; k++) {
            
            //System.out.println(fileLines[k]);
            
            }
        
        
        //prints median
    
            double midPoint;

            if (fileLines.length % 2 != 0) {
                
                midPoint = ((fileLines.length + 1)/2);
                
            }
            
            else  {
                
                double medianOne, medianTwo;
                medianOne = (fileLines.length/2) + 1;
                medianTwo = (fileLines.length)/2;
                midPoint = (medianOne + medianTwo)/2;

                }
                
                 //System.out.println(midPoint);
    
        //prints first and last entry
            
            int lastEntry;
            lastEntry = fileLines.length - 1;
        
            //System.out.println(fileLines[0] + " " + fileLines[lastEntry]);
               
        
        //prints all prime numbers
    
            PrimeIdentifier prime = new PrimeIdentifier();
            
            ArrayList<Integer> arrayList = new ArrayList<>();
            
            for (k = 0; k < fileLines.length; k++) {
                
                boolean wasPrime;
                
                wasPrime = prime.primeValue(fileLines[k]);
                //System.out.println(wasPrime);
                
                if (wasPrime == true) {
                    
                    arrayList.add(fileLines[k]);
                    
                }
                
            }
            
            //System.out.println(arrayList);
          
    
        //calculates factorial of a list
    
        FactorialCalculator factorial = new FactorialCalculator();
        
        for (k = 0; k < fileLines.length; k++) {
            
        int factorialValue = factorial.FactorialValue(fileLines[k]);
        
            //System.out.println(factorialValue);

        }
        
        //calculates factorial of a list using while
        
        FactorialCalculator factorial2 = new FactorialCalculator();
        k = 0;
        while (k < fileLines.length) {
        
            int factorialValue2 = factorial2.FactorialValue(fileLines[k]);
            k++;
            //System.out.println(factorialValue2);
        
    }
        
    }   
}
