package days09;

import java.util.Iterator;

public class Method07 {
	
	public static void main(String[] args) {
		
		int [] a = {56, 54, 87, 89, 25, 36, 57, 98};
		// sum 함수 제작
		
		sum(a);
		
	}

	public static void sum(int[] arr) {
		int s = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++)
			s+=arr[i];
		avg = s / (double)arr.length;
		
		System.out.println("sum : " + s +", avg : " + avg);
	}

}
