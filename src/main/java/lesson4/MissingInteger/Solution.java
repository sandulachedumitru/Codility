package lesson4.MissingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static int solution(int[] A) {
		int n = A.length;
		int rez = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++)
			if (A[i] > 0 ) set.add(A[i]);

		if (set.size() == 0) return 1;
		
		rez = 1;
		for (int i = 0; i < set.size(); i++) {
			if (!set.contains(rez)) return rez;
			rez++;
		}

		return rez;
	}

	public static void main(String[] args) {
		int[] A = {1, 3, 6, 4, 1, 2}; // 5
		System.out.println("A: " + solution(A));

		int[] B = {1, 2, 3}; // 4
		System.out.println("B: " + solution(B));

		int[] C = {-1, 0, 1, 3, 6, 4, 5, 2}; // 7
		System.out.println("C: " + solution(C));

		int[] D = {-1, 1, 3, 6, 4, 5, 2}; // 7
		System.out.println("D: " + solution(D));

		int[] E = {1}; // 2
		System.out.println("E: " + solution(E));

		int[] F = {2}; // 1
		System.out.println("F: " + solution(F));

		int[] G = {2, 3, 4}; // 1
		System.out.println("G: " + solution(G));

		int[] H = {5, 3, 4}; // 1
		System.out.println("H: " + solution(H));

		int[] I1 = new int[100];
		int[] I2 = new int[100];
		for (int i = 0; i < I1.length; i++) {
			I1[i] = i;
			I2[i] = i+100;
		}
		System.out.println("I1: " + solution(I1)); // 100
		System.out.println("I2: " + solution(I2)); // 1
		I1[50] = 3;
		I2[50] = 120;
		System.out.println("I1: " + solution(I1)); // 50
		System.out.println("I2: " + solution(I2)); // 1

		int[] J = {-1, -3};
		System.out.println("J: " + solution(J)); // 1
		
		int[] K = {2, 4, 7, 5, 2, 3}; // 1
		System.out.println("K: " + solution(K));
		
		int[] L = {3, 5, 8, 6, 3, 4}; // 1
		System.out.println("L: " + solution(L));
	}
}
