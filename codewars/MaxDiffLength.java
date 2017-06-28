/*
You are given two arrays a1 and a2 of strings. Each string is composed 
with letters from a to z. Let x be any string in the first array and y be 
any string in the second array.

Find max(abs(length(x) − length(y)))

If a1 or a2 are empty return -1 in each language except in Haskell where 
you will return Nothing.

#Example:

s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
mxdiflg(s1, s2) --> 13
*/

import java.util.Arrays;
import java.util.IntSummaryStatistics;

class MaxDiffLength {
    
    public static int mxdiflg(String[] a1, String[] a2) {
      if (a1.length == 0 || a2.length == 0)
        return -1;
      IntSummaryStatistics summary1 = Arrays.stream(a1).mapToInt(String::length).summaryStatistics();
    	IntSummaryStatistics summary2 = Arrays.stream(a2).mapToInt(String::length).summaryStatistics();
      int dif1 = summary1.getMax() - summary2.getMin();
      int dif2 = summary2.getMax() - summary1.getMin();
	    return dif1 > dif2 ? dif1 : dif2;
    }
}