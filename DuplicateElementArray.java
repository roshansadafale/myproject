package arraypractice;

public class DuplicateElementArray {

	public static void main(String[] args) {
		int a[] = { 12, 10, 15, 5, 7, 10, 5 };
		int temp = 0;
         System.out.println("duplicate element are");
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				
				if( a[i]==a[j]) {
					System.out.print(" " +a[i]);

	}
		
		}
			
				
			}
	
	
}
}
