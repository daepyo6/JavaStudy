package days09;

// 메서드 오버로딩(Overloading)
// 메소드의 이름은 같고, 매개변수의 타입, 갯수, 순서가 다르면 다른 메소드로 인지하는 문법
// 일관된 메소드 이름을 사용하여 사용자에게 직관적인 이름을 사용하게 함
// 전달인수(매개변수)의 자료형, 순서 등이 서로 달라도 가능


public class Method15 {

	public static void main(String[] args) {
		
		int maxValue = max(56,87,23);
		System.out.println(maxValue);
		
		maxValue = max(56,87,94,45);
		System.out.println(maxValue);
		
		maxValue = max(56,96);
		System.out.println(maxValue);
		
		double maxValueD = max(123.45, 456.56);
		System.out.println(maxValueD);
	}

	private static double max(double d, double e) {
		double max = (d>e) ? d : e;
		return max;
	}

	private static int max(int i, int j) {
		int max = (i>j) ? i : j;
		return max;
	}

	private static int max(int i, int j, int k, int l) {
		int max1 = (i>j) ? i : j;
		int max2 = (k>l) ? k : l;
		if(max1 < max2) max1 = max2;
		return max1;
	}

	private static int max(int i, int j, int k) {
		int max = (i>j) ? i : j;
		if(k>max) max = k;
		return max;
	}



}
