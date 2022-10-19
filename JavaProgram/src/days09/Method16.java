package days09;

public class Method16 {

	public static void main(String[] args) {
		int sumValue = sum(5,8,7,4,5,54,1,58,54);
		System.out.println(sumValue);
		sumValue = sum(5,8,7,4,5,54,1,58,54,78,1,77,45,15,98,88,455);
		System.out.println(sumValue);

	}

	private static int sum(int ... a) {
		// 전달되는 전달인수 갯수만큼의 배열이 생성되고 그 배열에 전달인수가 저장
		// 배열의 이름은 매개변수 a
		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s+=a[i];
		}
		return s;
	}

}