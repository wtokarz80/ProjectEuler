package problem_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MultiplesOf3And5 {


    public static void main(String[] args) {

        MultiplesOf3And5 multiplesOf3And5 = new MultiplesOf3And5();
        int result = multiplesOf3And5.findSum(3, 5, 1000);
        System.out.println(result);

    }


//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//    The sum of these multiples is 23.
//    Find the sum of all the multiples of 3 or 5 below 1000.


    public int findSum(int three, int five, int below){
        List<Integer> listOfMultiples = new ArrayList<>();
        for(int i = 1; i < below; i++){
            if(i % three == 0 || i % five == 0){
                listOfMultiples.add(i);
            }
        }
        return listOfMultiples.stream().mapToInt(Integer::intValue).sum();

    }

}
