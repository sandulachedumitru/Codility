package lesson3.FrogJmp;
public class Solution {
	
	public static int solution(int X, int Y, int D) {
		if (D == 0) return 0;
		
		int deltaXY = Math.abs((Y-X));
		int rest = (deltaXY % D) == 0 ? 0 : 1;
		int steps = deltaXY == 0 ? 0 : deltaXY / D + rest;
		
		return steps;
	}

	public static void main(String[] args) {
		print(10, 85, 30);
		print(100, 85, 30);
		print(0, 85, 30);
		print(100, 100, 30);
		print(0, 0, 30);
		print(0, 0, 0);
		print(90, 0, 30);
	}
	
	private static void print(int X, int Y, int D) {
		System.out.println("[X, Y, D]=[" + X + ", " + Y + ", " + D + "] --> steps: "+ solution(X, Y, D));
	}

}
