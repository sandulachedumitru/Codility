package lesson3.PermMissingElem;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution {

	public static int solution(int[] A) {
		int n = A.length;
		boolean[] count = new boolean[n+2];

		if (n == 0) return 1;
		
		for (int i = 0; i < n; i++)
			count[A[i]] = true;
		
		for (int i = 1; i < n+2; i++)
			if (!count[i]) return i;
		
		return 0; // should not reach this value
	}

	public static void main(String[] args) {
		int[] A = {2, 4, 1, 5};
		int rez;
		rez = solution(A);
		System.out.println("rez = " + rez);
		
		A = new int[1];
		A[0] = 2;
		rez = solution(A);
		System.out.println("rez = " + rez);
		
		A = new int[0];
		rez = solution(A);
		System.out.println("rez = " + rez);
	
		
		
		int n = 1000000;
		Set<Integer> set = new HashSet<>();
		for (int i = 1; i <= n; i++) if (!set.add((new Random()).nextInt(n+2))) i--;
		int[] B = new int[set.size()];
		
		int k = 0;
		for (Integer iter : set) { B[k] = iter; k++; }
		rez = solution(B);
		System.out.println("rez = " + rez);
	}

}
