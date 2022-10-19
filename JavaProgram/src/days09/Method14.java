package days09;

public class Method14 {

	public static void main(String[] args) {
		int [] a = {65,87,89,12,45,36,57,45};
		int tot = sum(a);
		double avg = average(a);
		prn(a, tot, avg);

	}

	private static int sum(int[] a) {
		int s = 0;
		for (int i = 0; i < a.length; i++)
			s+=a[i];
		return s;
	}

	private static double average(int[] a) {
		return sum(a) / (double)a.length;
	}

	private static void prn(int[] a, int tot, double avg) {
		System.out.print("배열의 요소 : ");
		for (int i : a) System.out.print(i + " ");
		System.out.println("\ntot : " + tot + ", avg : " + avg);
		
	}

}
