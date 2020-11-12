package problem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();
        int result = largestPrimeFactor.findLargestPrime(600851475143L);
        System.out.println(result);


    }



//    The prime factors of 13195 are 5, 7, 13 and 29.
//    What is the largest prime factor of the number 600851475143 ?


    public int findLargestPrime(long number){
        List<Integer> primeNumbers = new ArrayList<>();
        int i = 2;
        while (i <= number){
            long division = number % i;
            if (division == 0){
                primeNumbers.add(i);
                number = number / i;
            }
            else {
                i++;
            }

        }
        return Collections.max(primeNumbers);
    }

}
