/*
Description:

You are given an array (which will have a length of at least 3, but could be very large) containing integers. The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N. Write a method that takes the array as an argument and returns N.

For example:

[2, 4, 0, 100, 4, 11, 2602, 36]

Should return: 11

[160, 3, 1719, 19, 11, 13, -21]

Should return: 160
*/
import java.util.ArrayList;

public class FindOutlier{
  static int find(int[] integers){
    ArrayList<Integer> par = new ArrayList<Integer>();
    ArrayList<Integer> impar = new ArrayList<Integer>();
    int i = -1;
    while (par.size() < 1 || impar.size() < 1 || i < 2){
      i++;      
      if ((integers[i] % 2) == 0)
        par.add(i);       
      else 
        impar.add(i);        
    }   
    if (par.size() == 1)
      return integers[par.get(0)];
    else 
      return integers[impar.get(0)];
}}
