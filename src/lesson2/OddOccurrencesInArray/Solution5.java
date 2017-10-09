package lesson2.OddOccurrencesInArray;
import java.util.Date;
import java.util.Random;

public class Solution5 {
	public static int solution5(int[] A) {
		int n = A.length;

		ElementList list = new ElementList(A);

		Element index;

		index = list.getBottom();
		while (index != null) {
			boolean flag = true;
			Element index2 = index.forward;
			Element last = new Element(index);
			while (flag && (index2 != null)) {
				if (index.val == index2.val) {
					list.removeElement(index2);
					last = new Element(index);
					list.removeElement(index);

					flag = false;
				} else 
					index2 = index2.forward;
			}
			index = last.forward;
		}

		System.out.println("Unpaired element []:");
		index = list.getBottom();
		boolean isFirst = true; int valReturn = -1;
		while (index != null) {
			if (isFirst) { valReturn = index.val; isFirst = false; }
			System.out.print(index.val + "   ");
			index = index.forward;
		}
		System.out.println();

		return valReturn;
	}

	public static void main(String[] args) {
		int A[] = {9, 3, 9, 3, 9, 7, 9};
		System.out.println("Unpaired element is: " + solution5(A));
		System.out.println("------------------------------------------");

		int B[] = {5, 9, 3, 0, 9, 3, 9, 7, 9, 7, 5};
		System.out.println("Unpaired element is: " + solution5(B));
		System.out.println("------------------------------------------");

		int n = 40000000*2+1; int C[] = new int[n];
		for (int i = 0; i < n; i++) {
			Random rand = new Random();
			C[i] = rand.nextInt(4);
		}
		System.out.println("Done");
		Date begin = new Date();
		System.out.println("Unpaired element is: " + solution5(C));
		Date end = new Date();
		System.out.println("done in " + (end.getTime() - begin.getTime())/1000f + "s");

	} // method main

}

class Element {
	int val;
	Element backward, forward;

	Element() { }

	Element (Element elem) {
		if (elem != null) {
			val = elem.val;
			backward = elem.backward;
			forward = elem.forward;
		}
	}

	Element copy() {
		Element elem = new Element();

		elem.val = this.val;
		elem.backward = this.backward;
		elem.forward = this.forward;

		return elem;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null) return false;
		if (obj == this) return true;
		if (obj instanceof Element) {
			Element other = (Element) obj;
			if (
					(other.val == this.val) &&
					(other.backward == this.backward) &&
					(other.forward == this.forward)
					) return true;
			return false;
		}
		return false;
	}

} // class Element

class ElementList {
	private int noElements;
	private Element bottom = null, top = null;

	ElementList() {}

	ElementList(int noElements) {
		this.noElements = noElements;

		Element bottom = null, top = bottom;
		for (int i = 1; i <= noElements; i++) {
			Element elem = new Element();
			elem.val = 0;
			elem.backward = top;
			elem.forward = null;

			if (bottom == null) bottom = elem;

			if (top != null) top.forward = elem;
			top = elem;
		}
		this.bottom = bottom;
		this.top = top;
	}

	ElementList(int[] array) {
		noElements = array.length;

		Element bottom = null, top = bottom;
		for (int i = 1; i <= noElements; i++) {
			Element elem = new Element();
			elem.val = array[i-1];
			elem.backward = top;
			elem.forward = null;

			if (bottom == null) bottom = elem;

			if (top != null) top.forward = elem;
			top = elem;
		}
		this.bottom = bottom;
		this.top = top;
	}

	int length() {
		return noElements;
	}

	public Element getBottom() {
		return bottom;
	}

	public Element getTop() {
		return top;
	}

	void removeElement(Element elem) {
		if ((elem == bottom) && (elem == top)) {
			bottom = null;
			top = null;
			noElements = 0;
		} else {
			if (elem == bottom) {
				bottom = elem.forward;
				bottom.backward = null;

			} else 
				if (elem == top) {
					top = elem.backward;
					top.forward = null;
				} else {
					Element elemBackward, elemForward;

					elemBackward = elem.backward;
					elemForward = elem.forward;

					elemBackward.forward = elemForward;
					elemForward.backward = elemBackward;
				}
			noElements--;
		}
		elem.forward = null;
		elem.backward = null;
		elem.val = 0;
	}
}