package lesson2.OddOccurrencesInArray;
public class Solution {
	public static void main(String[] a) {
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		int n = A.length;
		
		boolean copy[] = new boolean[n];
		for (int i = 0; i < n; i++) copy[i] = false;
		
		for (int i = 0; i < n-1; i++) {
			boolean flag = true;
			int k = i+1;
			if (copy[i] == false) 
				while (flag && (k < n)) {
					if (copy[k] == false)
						if (A[i] == A[k]) {
							copy[i] = true;
							copy[k] = true;
							flag = false;
						}
					k++;
				} // while
		} // for
		
		boolean flag = true;
		int i = 0;
		int k = -1;
		while (flag && (i < n)) {
			if (copy[i] == false) {
				k = i;
				flag = false;
			}
			i++;
		}
		
		System.out.println("Unpaired element is: " + A[k]);
		
 	} // method main

}
