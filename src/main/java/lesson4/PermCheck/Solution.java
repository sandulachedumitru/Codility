package lesson4.PermCheck;

public class Solution {
	
	public static int solution(int[] a) {
		int n = a.length;
		
		if (n == 0) return 0;
		
		int[] comp = new int[n];
		for (int i = 0; i < n; i++) {
			int index = a[i]-1;
			if (index < 0 || n <= index) return 0;
			comp[index] = index + 1;
		}
		
		for (int i = 0; i < n; i++)
			if (i+1 != comp[i]) return 0;
		return 1;
	}
	
	// not passed the "int[] H = {2, 2, 3, 3}" test
	public static int solution2(int[] a) {
		int n = a.length;
		
		if (n == 0) return 0;
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
			int index = a[i]-1;
			if (index < 0 || n <= index) return 0;
		}
		
		int rez = n*(n+1)/2;
		
		if (rez == sum) return 1;
		return 0;
	}
	
	public static void main(String[] args) {
		
		int n = 100000;
		
		int[] A = {4, 1, 3, 2};
		System.out.println("A: " + solution(A));
		
		int [] B = {4, 1, 3};
		System.out.println("B: " + solution(B));
		
		int[] C = {};
		System.out.println("C: " + solution(C));
		
		int[] D = {1};
		System.out.println("D: " + solution(D));
		
		int[] E = {23};
		System.out.println("E: " + solution(E));
		
		int[] F = new int[n];
		for (int i = 0; i < n; i++) F[i] = i+1;
		System.out.println("F: " + solution(F));
		
		int[] G = {1, 2, 3, 4, 0, 0, 0, 0, 0, 45};
		System.out.println("G: " + solution(G));
		
		int[] H = {2, 2, 3, 3};
		System.out.println("H: " + solution(H));
	}
}
