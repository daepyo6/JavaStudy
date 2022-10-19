package days10;

import java.util.Scanner;

public class Method21 {

	public static void main(String[] args) {

		int[] a;

		// 1~45 사이의 임의의 난수를 a배열에 여섯개 저장한 후, 오름 차순으로 정렬하여 출력
		
		for (int i = 0; i < 5; i++) {
			a = newNumber();
			sort(a);
			prn(a);
		}


	}

	private static int[] newNumber() {
		int [] a = new int[6];
		int i=0, j;
		
		while (i < a.length) {
			a[i] = (int)(Math.random()*45)+1;
			for (j = 0; j < i; j++)
				if(a[i] == a[j]) break;
			if(i!=j) continue;
			else i++;
		}
		
		return a;
	}

	private static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	private static void prn(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d\t",a[i]);
		}
		System.out.println();
		
	}
	
}
