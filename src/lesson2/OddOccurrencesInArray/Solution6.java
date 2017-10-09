package lesson2.OddOccurrencesInArray;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;


public class Solution6 {
	// A is non-empty
	// N is odd
	// It contains pairs, need to return value of unpaired element

	public static void main(String[] args) {

//		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 5, 23, 7, 9, 23, 5 }));
		
		int n = 50000000; int C[] = new int[n];
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			C[i] = rand.nextInt(4);
		}
		
		System.out.println("Done");
		Date begin = new Date();
		System.out.println("Unpaired element is: " + solution(C));
		Date end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");
		
		System.out.println("Done");
		begin = new Date();
		System.out.println("Unpaired element is: " + Solution5.solution5(C));
		end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");
	}


	// Time: O(N)
	// Space: O(1)
	public static int solution(int[] A) {
		int elem = 0, var = 0;

		for (int i = 0; i < A.length; i++) {
			var = elem;
			
			elem ^= A[i];
//			System.out.println("A[i]: " + A[i] + "[" + Integer.toBinaryString(A[i]) + "]");
//			System.out.println("var: " + var + "[" + Integer.toBinaryString(var) + "]");
//			System.out.println("elem: " + elem + "[" + Integer.toBinaryString(elem) + "]");
//			System.out.println();
		}
		return elem;
	}

	// Time: O(N)
	// Space: O(N)
	public static int solution2(int[] A) {
		HashSet<Integer> dups = new HashSet<Integer>();
		int elem = -1;

		for (int i = 0; i < A.length; i++) {
			if (dups.add(A[i])) {
				elem = A[i];
			}
		}
		return elem;
	}

	// Time: O(N^2)
	// Space: O(1)
	public static int solution3(int[] A) {
		for (int i = 0; i < A.length; i++) {

			for (int j = 0; j < A.length; j++) {
				if (A[i] == A[j] && i != j) {
					A[i] = -1;
					A[j] = -1;
					j = A.length;
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			if (A[i] != -1)
				return A[i];
		}

		return 0; // should never happen
	}

}