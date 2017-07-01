/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.

Note: If the number is a multiple of both 3 and 5, only count it once.
*/

import java.util.Set;
import java.util.HashSet;

public class Solution {

  public int solution(int number) {
    Set<Integer> multiples = new HashSet<>();
    for (int i = 1; i*3 < number; i++){
      multiples.add(i*3);
    }
    for (int j = 1; j*5 < number; j++){
      multiples.add(j*5);
    }
    
    return multiples.stream().mapToInt(Integer::valueOf).sum();
  }
}
