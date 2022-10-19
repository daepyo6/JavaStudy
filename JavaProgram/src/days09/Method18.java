package days09;

public class Method18 {

	public static void main(String[] args) {
		cal("합계",98,78,45,12,23,87,69,59);
		System.out.println();
		cal("평균",98,78,45,12,23,31,98,63,25,87);
	}

	private static void cal(String str, int ... is) {
		int sum = 0;
		double avg = 0.0;
		for (int i : is) {
			sum+=i;
		}
		if(str.equals("합계")) 
			System.out.println("Total : " + sum);
		else {
			avg = sum / (double)is.length;
			System.out.println("Average : " + avg);
		}
		
	}

}
