package lesson2.CyclicRotation;
import java.util.Date;
import java.util.Random;

public class Solution {
	// timing O(n)
	// spacing O(n);
	public static int[] solution(int[] A, int K) {
		int n = A.length;
		int[] rez = new int[n];
		int j = K;

		if ((K > n) && (n != 0)) {
			j = K % n;
		}

		for (int i = 0; i < n; i++) {
			if (j >= n) 
				j = j - n;

			rez[j] = A[i];
			j++;
		}

		return rez;
	}

	// timing O(n*K) k<=n
	// spacing O(1);
	public static void solution2(int[] A, int K) {
		int temp;
		int n = A.length;

		if ((K > n) && (n != 0)) {
			K = K % n;
		}

		for (int j = 1; j <= K; j++) {
			temp = A[n-1];
			for (int i = n-1; i >= 1; i--) {
				A[i] = A[i-1];
			}
			A[0] = temp;
		}
	}

	public static void main(String[] args) {
//		int A[] = {3, 8, 9, 7, 6};
//		
//		System.out.print("A = "); print(A);
//		System.out.print("rez = "); print(solution(A, K));
//		
//		solution2(A, K);
//		System.out.print("A = "); print(A);		
		
		int n = 100000000;
		int A[] = new int[n];
		int K = 50;
		
		for (int i = 0; i < n; i++) {
			A[i] = (new Random()).nextInt(n);
		}
		System.out.println("Done - Initialization");
		
		Date begin, end;

		begin = new Date();
		solution(A, K);
		end = new Date();
		System.out.println("Done - solution() in " + (end.getTime() - begin.getTime())/1000f + "s");
		
		begin = new Date();
		solution2(A, K);
		end = new Date();
		System.out.println("Done - solution2() in " + (end.getTime() - begin.getTime())/1000f + "s");
	}

	private static void print(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) 
			System.out.print(array[i] + ", ");
		System.out.println("]");
	}

}
