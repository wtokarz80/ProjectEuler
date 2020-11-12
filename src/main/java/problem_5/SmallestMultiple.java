package problem_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SmallestMultiple {

    public static void main(String[] args) {
        SmallestMultiple smallestMultiple = new SmallestMultiple();
        System.out.println(smallestMultiple.findSmallestNumber());

    }


//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public int findSmallestNumber(){
        int number = 20;
        while (true){
            List<Integer> numbers = new ArrayList<>();
            for(int i = 1; i <= 20; i++){
                int result = number % i;
                if (result == 0){
                    numbers.add(number);
                }
            }
            if (numbers.size() == 20){
                return number;
            }
            numbers.clear();
            number++;

        }

    }

}
