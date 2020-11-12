package problem_4;

import problem_3.LargestPrimeFactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindrome {

    public static void main(String[] args) {

        LargestPalindrome largestPalindrome = new LargestPalindrome();
        System.out.println(largestPalindrome.findPalindrome());
    }

//    A palindromic number reads the same both ways.
//    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//    Find the largest palindrome made from the product of two 3-digit numbers.

    public int findPalindrome(){
        List<Integer> palindromes = new ArrayList<>();
        for(int i = 100; i <= 999; i++){
            for(int j = 100; j <= 999; j++){
                int rev = 0;
                int digit = i * j;
                int number = i * j;
                while(number != 0)
                {
                    rev = rev * 10;
                    rev = rev + number%10;
                    number = number/10;
                }
                if(digit == rev){
                    palindromes.add(digit);
                }
            }
        }
        return Collections.max(palindromes);
    }

}
