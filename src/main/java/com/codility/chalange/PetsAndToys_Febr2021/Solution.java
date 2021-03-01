package com.codility.chalange.PetsAndToys_Febr2021;

public class Solution {

	public static void main(String[] args) {
		int[] P1 = {1, 1, 2};
		int[] T1 = {2, 1, 1};
		int[] A1 = {0, 2};
		int[] B1 = {1, 1};
		System.out.println(solution(P1, T1, A1, B1));
		
		int[] P2 = {2, 2, 1, 1, 1};
		int[] T2 = {1, 1, 1, 2, 2};
		int[] A2 = {0, 1, 2, 3};
		int[] B2 = {1, 2, 0, 4};
		System.out.println(solution(P2, T2, A2, B2));
		
		int[] P3 = {1, 1, 2, 2, 1, 1, 2, 2};
		int[] T3 = {1, 1, 1, 1, 2, 2, 2, 2};
		int[] A3 = {0, 2, 4, 6};
		int[] B3 = {1, 3, 5, 7};
		System.out.println(solution(P3, T3, A3, B3));
		
		int[] P4 = {2, 2, 2, 2, 1, 1, 1, 1};
		int[] T4 = {1, 1, 1, 1, 2, 2, 2, 2};
		int[] A4 = {0, 1, 2, 3, 4, 5, 6};
		int[] B4 = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(solution(P4, T4, A4, B4));
	}
	
    public static boolean solution(int[] P, int[] T, int[] A, int[] B) {
    	boolean result = isEquals(P, T);
    	
    	if (!result) {
        	for (int j = 0; j < A.length; j++) {
                result = true;
                
                for (int i = 0; i < A.length; i++) {
                	int P1 = A[i];
                	int P2 = B[i];
                	
                	int temp = T[P1];
                	T[P1] = T[P2];
                	T[P2] = temp;
                }
                
                result = isEquals(P, T);
        		
        		if (result) break;
        	}
    		
    	}
    	
    	return result;
    }
    
    private static boolean isEquals(int[] P, int[] T) {
    	boolean result = true;
    	
        for (int k = 0; k < P.length; k++) {
        	if (P[k] != T[k]) {
        		result = false;
        		break;
        	}
        }
        return result;
    }
    
    
}
