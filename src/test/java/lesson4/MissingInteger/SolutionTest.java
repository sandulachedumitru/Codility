package lesson4.MissingInteger;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {

		int[] A = {1, 3, 6, 4, 1, 2}; // 5
		int[] B = {1, 2, 3}; // 4
		int[] C = {-1, 0, 1, 3, 6, 4, 5, 2}; // 7
		int[] D = {-1, 1, 3, 6, 4, 5, 2}; // 7
		int[] E = {1}; // 2
		int[] F = {2}; // 1
		int[] G = {2, 3, 4}; // 1
		int[] H = {5, 3, 4}; // 1
		int[] I1 = new int[100]; // 100
		int[] I2 = new int[100]; // 1
		for (int i = 0; i < I1.length; i++) {
			I1[i] = i;
			I2[i] = i+100;
		}
		I1[50] = 3; // 50
		I2[50] = 120; // 1
		int[] J = {-1, -3}; // 1
		int[] K = {2, 4, 7, 5, 2, 3}; // 1
		int[] L = {3, 5, 8, 6, 3, 4}; // 1
		
		assertTrue(Solution.solution(A) == 5);
		assertTrue(Solution.solution(B) == 4);
		assertTrue(Solution.solution(C) == 7);
		assertTrue(Solution.solution(D) == 7);
		assertTrue(Solution.solution(E) == 2);
		assertTrue(Solution.solution(F) == 1);
		assertTrue(Solution.solution(G) == 1);
		assertTrue(Solution.solution(H) == 1);
		assertTrue(Solution.solution(I1) == 50);
		assertTrue(Solution.solution(I2) == 1);
		assertTrue(Solution.solution(J) == 1);
		assertTrue(Solution.solution(K) == 1);
		assertTrue(Solution.solution(L) == 1);
	}

}
