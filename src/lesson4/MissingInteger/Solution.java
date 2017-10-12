package lesson4.MissingInteger;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	
	// solution is good because I misunderstand the problem
	public static int solution1(int[] A) {
		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int i = 0 ; i < A.length; i++) {
			hset.add(A[i]);          

			while (hset.contains(num)) {
				num++;
			}
		}

		return num;
	}
	
	// solution is good because I misunderstand the problem
	public static int solution2(int[] A) {
		int n = A.length;
		int rez = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++)
			set.add(A[i]);

		int[] comp = new int[set.size()];
		int k = 0;

		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (Integer i : set) {
			if (min > i) min = i;
			if (max < i) max = i;
			comp[k++] = i;
		}

		if (min <= 0 && max <= 0) return 1;

		rez = min;
		for (int i = 0; i < comp.length; i++) {
			if (comp[i] != rez && rez > 0) break;
			rez++;
		}

		if (rez-1 == max) {
			if ((min - 1) >= 1) rez = min - 1;
		}

		System.out.println("min: " + min + "\t\tmax: " + max + "\t\trez: " + rez);
		return rez;
	}

	// solution is good because I misunderstand the problem
	public static int solution3(int[] A) {
		int n = A.length;
		int rez = 0;
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++)
			if (A[i] > 0 ) set.add(A[i]);

		if (set.size() == 0) return 1;

		int[] comp = new int[set.size()];
		int k = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (Integer i : set) {
			if (min > i) min = i;
			if (max < i) max = i;
			comp[k++] = i;
		}
		set = null;

		rez = min;
		for (int i = 0; i < comp.length; i++) {
			if (comp[i] != rez) return rez;
			rez++;
		}

		if (rez-1 == max) {
			if ((min - 1) >= 1) rez = 1;
		}

		return rez;
	}
	
	public static int solution4(int[] A) {
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
		System.out.println("A: " + solution4(A));

		int[] B = {1, 2, 3}; // 4
		System.out.println("B: " + solution4(B));

		int[] C = {-1, 0, 1, 3, 6, 4, 5, 2}; // 7
		System.out.println("C: " + solution4(C));

		int[] D = {-1, 1, 3, 6, 4, 5, 2}; // 7
		System.out.println("D: " + solution4(D));

		int[] E = {1}; // 2
		System.out.println("E: " + solution4(E));

		int[] F = {2}; // 1
		System.out.println("F: " + solution4(F));

		int[] G = {2, 3, 4}; // 1
		System.out.println("G: " + solution4(G));

		int[] H = {5, 3, 4}; // 1
		System.out.println("H: " + solution4(H));

		int[] I1 = new int[100];
		int[] I2 = new int[100];
		for (int i = 0; i < I1.length; i++) {
			I1[i] = i;
			I2[i] = i+100;
		}
		System.out.println("I1: " + solution4(I1)); // 100
		System.out.println("I2: " + solution4(I2)); // 1
		I1[50] = 3;
		I2[50] = 120;
		System.out.println("I1: " + solution4(I1)); // 50
		System.out.println("I2: " + solution4(I2)); // 1

		int[] J = {-1, -3};
		System.out.println("J: " + solution4(J)); // 1
		
		int[] K = {2, 4, 7, 5, 2, 3}; // 1
		System.out.println("K: " + solution4(K));
		
		int[] L = {3, 5, 8, 6, 3, 4}; // 1
		System.out.println("L: " + solution4(L));
	}
}
