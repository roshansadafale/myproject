package arraypractice;

public class ArrayRemoveOneElement {

	public static void main(String[] args) {
		int delete = 30;

		int a[] = { 10, 40, 30, 80, 60, 20 };

		for (int i = 0; i <= a.length; i++) {

			if (delete == a[i]) {
				for (int j = i; j < a.length-1; j++) {
					a[j] = a[j + 1];
				}
				break;
			}
		}
            //traverse in array
			for (int i = 0; i < a.length - 1; i++) {
				System.out.print(a[i] + " ");
			}

		}

	}

