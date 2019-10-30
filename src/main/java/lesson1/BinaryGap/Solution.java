package lesson1.BinaryGap;
public class Solution {
	
	public static void main(String[] args) {
		int n = 529;
		
		String nBinStr = Integer.toBinaryString(n);
		char[] ch = nBinStr.toCharArray();
		int strLength = nBinStr.length();
		
		System.out.println("nBinStr: " + nBinStr);
		
		boolean esteSpate = true;
		int indexSpate = 0, indexFata = 0;
		int max = 0;
		int countZero = 0;
		for (int i = 0; i < strLength; i++) {

			if (ch[i] =='1') 
				if (esteSpate) {
					esteSpate = false;
					indexSpate = i;
				} else {
					indexFata = i;
					countZero = indexFata - indexSpate - 1;
					if (max < countZero) max = countZero;
					esteSpate = true;
					indexSpate = indexFata;
					i--;
				}

		} // for
		
		System.out.println("gap max: " + max);
	}

}
