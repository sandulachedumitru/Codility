package lesson4.PermCheck;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void testSolution() {
		// setup
		int n = 100000;
		
		int[] A = {4, 1, 3, 2};
		int [] B = {4, 1, 3};
		int[] C = {};
		int[] D = {1};
		int[] E = {23};
		int[] F = new int[n];
		for (int i = 0; i < n; i++) F[i] = i+1;
		int[] G = {1, 2, 3, 4, 0, 0, 0, 0, 0, 45};
		int[] H = {2, 2, 3, 3};
		
		// test
		assertTrue(Solution.solution(A) == 1);
		assertTrue(Solution.solution(B) == 0);
		assertTrue(Solution.solution(C) == 0);
		assertTrue(Solution.solution(D) == 1);
		assertTrue(Solution.solution(E) == 0);
		assertTrue(Solution.solution(F) == 1);
		assertTrue(Solution.solution(G) == 0);
		assertTrue(Solution.solution(H) == 0);
	}

	@Test
	public void testSolution2() {
		// setup
		int n = 100000;
		
		int[] A = {4, 1, 3, 2};
		int [] B = {4, 1, 3};
		int[] C = {};
		int[] D = {1};
		int[] E = {23};
		int[] F = new int[n];
		for (int i = 0; i < n; i++) F[i] = i+1;
		int[] G = {1, 2, 3, 4, 0, 0, 0, 0, 0, 45};
		int[] H = {2, 2, 3, 3};
		
		// test
		assertTrue(Solution.solution2(A) == 1);
		assertTrue(Solution.solution2(B) == 0);
		assertTrue(Solution.solution2(C) == 0);
		assertTrue(Solution.solution2(D) == 1);
		assertTrue(Solution.solution2(E) == 0);
		assertTrue(Solution.solution2(F) == 1);
		assertTrue(Solution.solution2(G) == 0);
		assertFalse(Solution.solution2(H) == 0);
	}

}
