package lesson2.OddOccurrencesInArray;
/*
 * solutia este foarte ineficienta deoarece trebuie mutate intruna 
 * blocuri de memorie ptr a face lista continua
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

public class Solution3 {
	public static int solution3(int[] A) {
		int n = A.length;

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) list.add(A[i]);

		int m = n, i = 0;
		boolean flag1 = true;
		while (flag1 && (i < m-1)) {
			boolean flag2 = true;
			int k = i+1;
			while (flag2 && (k < m)) {
				if (list.get(i) == list.get(k)) {
					list.remove(k);
					list.remove(i);

					flag2 = false;
					m = m-2; //m -= 2;
					i = i-1;
				}
				k++;
			}
			i++;
		}

		System.out.println("Unpaired element:");
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "   ");
		}
		System.out.println();

		iterator = list.iterator();
		if (iterator.hasNext()) return iterator.next();
		return -1;
	}
	
	public static void main(String[] args) {
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Unpaired element is: " + solution3(A));

		int B[] = {5, 9, 3, 0, 9, 3, 9, 7, 9, 7, 5};
		System.out.println("Unpaired element is: " + solution3(B));

		int n = 10000000*2+1; int C[] = new int[n];
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			C[i] = rand.nextInt(1000);
		}
		System.out.println("Done");
		Date begin = new Date();
		System.out.println("Unpaired element is: " + solution3(C));
		Date end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");

	} // method main

}
