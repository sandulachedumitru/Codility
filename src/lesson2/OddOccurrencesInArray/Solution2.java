package lesson2.OddOccurrencesInArray;
import java.util.Date;
import java.util.Random;

public class Solution2 {
	public static int solution(int[] A) {
		int n = A.length;

		boolean copy[] = new boolean[n];
		for (int i = 0; i < n; i++) copy[i] = false;

		for (int i = 0; i < n-1; i++) {
			boolean flag = true;
			int k = i+1;
			if (copy[i] == false) 
				while (flag && (k < n)) {
					if (copy[k] == false)
						if (A[i] == A[k]) {
							copy[i] = true;
							copy[k] = true;
							flag = false;
						}
					k++;
				} // while
		} // for

		boolean flag = true;
		int i = 0;
		int k = -1;
		while (flag && (i < n)) {
			if (copy[i] == false) {
				k = i;
				flag = false;
			}
			i++;
		}

		return A[k];
	}

	public static void main(String[] a) {
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Unpaired element is: " + solution(A));
		
		int B[] = {5, 9, 3, 0, 9, 3, 9, 7, 9, 7, 5};
		System.out.println("Unpaired element is: " + solution(B));
		
		int n = 10000000*2+1; int C[] = new int[n];
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			C[i] = rand.nextInt(1000);
		}
		System.out.println("Done");
		Date begin = new Date();
		System.out.println("Unpaired element is: " + solution(C));
		Date end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");


	} // method main
	

}
