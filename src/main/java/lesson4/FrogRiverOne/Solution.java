package lesson4.FrogRiverOne;

import java.util.Random;

public class Solution {

	public static int solution(int X, int[] A) {
		int VALUE_NOT_FOUND = -1;
		int ARRAY_INIT = -1;

		int n = A.length;
		int[] comp = new int[X+1];
		int sum = 0;
		
		// verify 1 <= A[k] <= X
		if (X <= 0 || n == 0 ) return VALUE_NOT_FOUND;
		for (int i = 0; i < n; i++)
			if (A[i] < 1 || X < A[i]) return VALUE_NOT_FOUND;
		
		// initialises comp[k]
		for (int i = 0; i < comp.length; i++)
			comp[i] = ARRAY_INIT;
		
		if (n == 1) sum = A[0];
		else
			for (int i = 0; i < n; i++) {
				if (comp[A[i]] == ARRAY_INIT) {
					comp[A[i]] = i;
					sum += A[i];
				}
			}
		comp[A[0]] = 0;

		int max = VALUE_NOT_FOUND;
		if (sum == X*(X+1)/2)
			for (int i = 1; i < comp.length; i++)
				if (max < comp[i]) max = comp[i];

		return max;
	}

	public static void main(String[] args) {
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4}; int Xa = 5;
		System.out.println("A: " + solution(Xa, A));
		
		int[] B = {1, 3, 1, 4, 2, 6, 5, 4}; int Xb = 5;
		System.out.println("B: " + solution(Xb, B));

		int[] C = {}; int Xc = 0;
		System.out.println("C " + solution(Xc, C));
		
		int[] D = {0, 1}; int Xd = 0;
		System.out.println("D: " + solution(Xd, D));
		
		int[] E = {0, 1}; int Xe = 1;
		System.out.println("E: " + solution(Xe, E));

		int[] F = {1}; int Xf = 1;
		System.out.println("F: " + solution(Xf, F));

		int[] G = {2}; int Xg = 2;
		System.out.println("G: " + solution(Xg, G));
		
		int[] H = {3}; int Xh = 2;
		System.out.println("H: " + solution(Xh, H));
		
		int[] I = new int[100000]; int Xi = 9999;
		for (int i = 0; i < I.length; i++)
			I[i] = (new Random()).nextInt(Xi) + 1;
		System.out.println("I: " + solution(Xi, I));
	}
}
