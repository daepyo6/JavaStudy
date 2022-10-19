package days07;

public class Array07 {
	 
	public static void main(String[] args) {
		int [] a = {56, 87, 96, 87, 45, 89, 69, 36, 13, 98, 100, 12};
		int x = 20, y = 30;
		int temp = x;
		x=y;
		y=temp;
		System.out.println(x + " " + y);
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		System.out.println();
	
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] < a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		
		

	}

}
