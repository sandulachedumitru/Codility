package lesson4.FrogRiverOne;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() {
		// setup
		int[] A = {1, 3, 1, 4, 2, 3, 5, 4}; int Xa = 5;
		int[] B = {1, 3, 1, 4, 2, 6, 5, 4}; int Xb = 5;
		int[] C = {}; int Xc = 0;
		int[] D = {0, 1}; int Xd = 0;
		int[] E = {0, 1}; int Xe = 1;
		int[] F = {1}; int Xf = 1;
		int[] G = {2}; int Xg = 2;
		int[] H = {3}; int Xh = 2;
		
		// test
		assertTrue(Solution.solution(Xa, A) == 6);
		assertTrue(Solution.solution(Xb, B) == -1);
		assertTrue(Solution.solution(Xc, C) == -1);
		assertTrue(Solution.solution(Xd, D) == -1);
		assertTrue(Solution.solution(Xe, E) == -1);
		assertTrue(Solution.solution(Xf, F) == 0);
		assertTrue(Solution.solution(Xg, G) == -1);
		assertTrue(Solution.solution(Xh, H) == -1);
	}

}
