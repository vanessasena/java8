/*
Description:

There is an array with some numbers. All numbers are equal except for one. Try to find it!

FindUniqueNumber.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
FindUniqueNumber.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
It’s guaranteed that array contains more than 3 numbers.
*/

import java.util.Arrays;

 public class FindUniqueNumber {
    public static double findUniq(double arr[]) {
      Arrays.sort(arr);
      return arr[0] == arr[1] ? arr[ arr.length - 1] : arr[0];
    }
}
