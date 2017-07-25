
package readnumbers;

import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ReadNumbers {

  
    public static void main(String[] args) throws IOException {
        
        String file_name = "/Users/laurencesugars/Documents/ListOfNumbers.txt";
        
        
        //This line initialises the method: ReadFile
        ReadFile file = new ReadFile (file_name);
        //System.out.println(file);
        
        
        //This line parses file to the OpenFile method and in returns creates an array of integers called FileLines
        int [] fileLines = file.OpenFile();
        
        int k, sum;
        k = 0;
        sum = 0;
        
        //Arrays.sort(fileLines);
        
        //This code prints out all values of k
            
        for (k = 0; k < fileLines.length; k ++) {
            //System.out.println(fileLines[k]);

            }
        
        
        //This code finds sum of integers in array    
        
            while (k < fileLines.length) {
                sum = sum + fileLines[k];
                //System.out.println(fileLines[j]);
                k++;

            }
        
            //System.out.println(sum);
        
        //This code finds average of integers in array
        
            int average;
            average = sum/fileLines.length;
        
        
            //System.out.println(average);
        
        
        //This code orders integers in array
            
            for (k = 0; k < fileLines.length; k++) {
            
            //System.out.println(fileLines[k]);
            
            }
        
        
        //This code finds median value of integers in array
    
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
    
        //This code finds the highest and value integer in array (if sorted)
            
            int lastEntry;
            lastEntry = fileLines.length - 1;
        
            //System.out.println(fileLines[0] + " " + fileLines[lastEntry]);
               
        
        //This code finds all prime numbers in array
    
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
          
    
        //This code calculates factorials of the integers in the array    
    
        FactorialCalculator factorial = new FactorialCalculator();
        
        for (k = 0; k < fileLines.length; k++) {
            
        int factorialValue = factorial.FactorialValue(fileLines[k]);
        
            //System.out.println(factorialValue);

        }
        
        //Same as above but calculates factorial of a list using while
        
//        FactorialCalculator factorial2 = new FactorialCalculator();
//        
//        k = 0;
//        
//        while (k < fileLines.length) {
//        
//            int factorialValue2 = factorial2.FactorialValue(fileLines[k]);
//            k++;
//            //System.out.println(factorialValue2);
//        
//        }
         
        //This code calculated the finds the highest Fibonacci number less than the integer in the array
        
        FibonacciFinder fibonacci = new FibonacciFinder();
        
        ArrayList <Integer> HighestValues = new ArrayList <>();
        
            for (k = 0; k < fileLines.length; k++) {
                
            
                int fibonacciValue = fibonacci.fibonacciNumber(fileLines[k]);
                    //System.out.println(fibonacciValue); 
                    HighestValues.add(fibonacciValue);
                    }
                    
                    Collections.sort(HighestValues);
                    //System.out.println(HighestValues);
         
                    
        //This writes to a file
        
        WriteFile dataClean = new WriteFile(file_name);
        //Remove 'true' if you just want to overwrite the file
        
        dataClean.writeToFile(null);
        
        
        //This reorders numbers from low to high and over writes file with reordering
        
        Arrays.sort(fileLines);
        
        WriteFile data = new WriteFile(file_name);
        
        for (k = 0; k < fileLines.length; k ++) {
            //System.out.println(fileLines[k]);
            
            String s = Integer.toString(fileLines[k]);
            
            data.writeToFile(s);
            
            
            }
        
        
        
    }   
}
