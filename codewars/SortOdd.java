/*
You have an array of numbers.
Your task is to sort ascending odd numbers but even numbers must be on their places.

Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.

Example

sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
*/

import java.util.Arrays;

public class SortOdd {
  public static int[] sortArray(int[] arr) {
    int[] copy = Arrays.stream(arr).filter(n -> n % 2 == 1).sorted().toArray();    
    if (copy == null)
      return arr;    
    int j = 0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] % 2 == 1){
        arr[i] = copy[j];
        j++;
      }
    }
    return arr;
  }
}
