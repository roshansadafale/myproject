package arraypractice;

import java.util.Scanner;

public class ArrayRemoveUsingScanner {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter length ...");
    int size=sc.nextInt();
	int a[] = new int[size];
	System.out.println("enter values...");
	for(int k=0;k<a.length;k++) {
	   a[k]=sc.nextInt();
	}
	
	System.out.println("select value you want to delete");
	int delete=sc.nextInt();
	for (int i = 0; i <= a.length; i++) {

		if (delete == a[i]) {
			for (int j = i; j < a.length-1; j++) {
				a[j] = a[j + 1];
			}
			break;
		}
	}

		for (int i = 0; i < a.length - 1; i++) {
			System.out.print(a[i] + " ");
		}
    
	}
}

