import java.util.ArrayList;
import java.util.Collections;

class ArrayListSort{

	public static void main (String[] args){
		ArrayList<Integer> years = new ArrayList<>();
		years.add(2015);
		years.add(1987);
		years.add(1962);
		years.add(1985);
		years.add(1991);

		Collections.sort(years, (i1, i2) -> i1 - i2);
		years.forEach(y -> System.out.println(y));

	}

}
