package arraypractice;

public class SecondLargestElement {

	public static void main(String[] args) {

		int a[] = { 12, 10, 15, 5, 7, 50, 34 };
		int temp = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();
		System.out.print("Second Largest " + a[1]);

	}
}
