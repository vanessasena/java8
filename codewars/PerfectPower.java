/*
Got timeout when running at codewars
*/
import java.util.Arrays;

public class PerfectPower {
  public static int[] isPerfectPower(int n) {
    int[] result = null;
    
    for (int i = 2; i <= n/2 && result == null; i++){
      result = factor(n , i, 0);
    }    
    return result;
  }
  
  public static int[] factor(int n, int m, int k){
    if (n == 1)
      return new int[]{m, k};
    else {
      if (n % m == 0)
        return factor(n/m, m, ++k);
      else
        return null;    
    }
  }

	public static void main(String[] args){
		System.out.println(Arrays.toString(isPerfectPower(3)));
	}
  
  
}

  

