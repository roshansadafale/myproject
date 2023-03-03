package arraypractice;

public class InsertedElement {

	public static void main(String[] args) {
		      //   0  1  2  3  4
		int a[]= {10,20,30,40,50};
		int pos=2;
		int insert=100;
		 for(int i=a.length-1; i<pos-1;i--)
		 {
			 a[i]=a[i-1];
		 }
		 
		 a[pos-1]=insert;
		 for(int i=0; i<a.length;i++) {
			 System.out.print(a[i]+",");
		 }
		
	}

}
