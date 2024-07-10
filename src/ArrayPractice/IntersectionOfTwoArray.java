package ArrayPractice;

public class IntersectionOfTwoArray {
	public static void main(String[] args) {
		int[] a = { 3, 2, 5, 7, 33, 55 };
		int b[] = { 1, 2, 3, 5, 8, 12 };
//		3,2,5
		int size = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					size++;
				}
			}
		}
		int c[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					c[i] = a[i];
				}
			}
		}
		System.out.println("---------------");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
