package exec6;

import java.io.IOException;
import java.util.Arrays;

public class asd {

	public static void main(String[] args) throws IOException {

		int[] array = { 1, 4, 2, 8, 4, 7, 5 /* put in the numbers you want to sort */ };

		Arrays.sort(array); /* You will need to import this function */

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}