package arraypractice;

import java.util.Scanner;

public class InsertElement2 {

	public static void main(String[] args) {
		   //leng  0 1 2  3   4 5  
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length ...");
	    int size=sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter values...");
		for(int k=0;k<a.length;k++) {
		   a[k]=sc.nextInt();
		}
		System.out.println("select value you want to insert");
		int insert=sc.nextInt();
		 
		   // pos   1 2  3  4  5  6
		int pos=5;
		//int insert=50;
		for(int i=a.length-1; i<pos-1; i++)
		{
			a[i]=a[i-1];
		}
		a[pos-1]=insert;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+",");
		}

	}

}
