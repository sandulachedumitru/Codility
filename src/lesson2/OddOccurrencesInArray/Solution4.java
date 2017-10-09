package lesson2.OddOccurrencesInArray;
import java.util.Date;
import java.util.Random;

public class Solution4 {

	public static void main(String[] args) {
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Unpaired element is: " + Solution5.solution5(A));
		System.out.println("------------------------------------------");

		int B[] = {5, 9, 3, 0, 9, 3, 9, 7, 9, 7, 5};
		System.out.println("Unpaired element is: " + Solution5.solution5(B));
		System.out.println("------------------------------------------");

		int n = 10000000*2+1; int C[] = new int[n];
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			C[i] = rand.nextInt(1000);
		}
		System.out.println("Done");
		Date begin = new Date();
		System.out.println("Unpaired element is: " + Solution5.solution5(C));
		Date end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");
		System.out.println("------------------------------------------");
		
		System.out.println("Done");
		Date begin2 = new Date();
		System.out.println("Unpaired element is: " + Solution2.solution(C));
		Date end2 = new Date();
		System.out.println("done in " + (end2.getTime() - begin2.getTime())/1000f + "s");

	} // method main

}

