package lesson1.BinaryGap;
public class Solution2 {
	
	static int solution(int n) {
		
		String nBinStr = Integer.toBinaryString(n);
		char[] chBinStr = nBinStr.toCharArray();
		int binStrLength = nBinStr.length();
		
		System.out.println("nBinStr: " + nBinStr);
		
		boolean isBack = true;
		int indexBack = 0, indexFront = 0;
		int max = 0;
		int countZero = 0;
		
		for (int i = 0; i < binStrLength; i++) {
			if (chBinStr[i] =='1') 
				if (isBack) {
					isBack = false;
					indexBack = i;
				} else {
					indexFront = i;
					countZero = indexFront - indexBack - 1;
					if (max < countZero) max = countZero;
					isBack = true;
					indexBack = indexFront;
					i--;
				}
		} // for

		return max;
	}
	
	static private void print(int n) {
		System.out.println("gap max for " + n + ": " + solution(n));
		System.out.println("---------------");
	}
	
	public static void main(String[] args) {
		print(9);
		print(529);
		print(20);
		print(15);
		print(0);
		
		System.out.println("================================");
		
		print(328);
		print(6);
		print(1162);
		print(5);
	}

}
