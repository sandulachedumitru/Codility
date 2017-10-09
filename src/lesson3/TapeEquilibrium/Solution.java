package lesson3.TapeEquilibrium;

import java.util.Random;

public class Solution {
	
	public static int solution(int[] a) {
		if (a == null) return -1;
		
		int n = a.length;
		int totalSumOfArray = 0;
		int firstSplit = 0;
		int secondSplit = 0;
		int minDiff = 0;
		int diff = 0;
		
		if (n <= 1) return -1;
		
		for (int i = 0; i < n; i++)
			totalSumOfArray += a[i];
		
		minDiff = Integer.MAX_VALUE;
		
		for (int i = 0; i < n-1; i++) {
			firstSplit += a[i];
			secondSplit = totalSumOfArray - firstSplit;
			
			diff = Math.abs(firstSplit - secondSplit);
			if (minDiff > diff) minDiff = diff;
			
//			System.out.println("firs: " + firstSplit + "\t\tsec: " + secondSplit + "\t\tdiff: " + diff + "\t\tmindiff: " + minDiff + "\t\ttotal: " + totalSumOfArray);
		}
		
		return Math.abs(minDiff);
	}

	public static void main(String[] args) {
		int[] A = {3, 1, 2, 4, 3};
		System.out.println("Min diff A: " + solution(A));
		
		int[] B = {1};
		System.out.println("Min diff B: " + solution(B));
		
		int[] C = null;
		System.out.println("Min diff C: " + solution(C));
		
		int[] E = {3, -1, 2, -4, 3};
		System.out.println("Min diff E: " + solution(E));
		
		int[] F = {3, -1, 2, -4, -3};
		System.out.println("Min diff F: " + solution(F));
		
		int[] G = {-3, 1};
		System.out.println("Min diff G: " + solution(G));
		
		int n = 100000;
		int[] D = new int[n];
		for (int i = 0; i < n; i++) {
			D[i] = ((new Random()).nextInt(2000)) - 1000;
		}
		System.out.println("Min diff D: " + solution(D));
	}

}
