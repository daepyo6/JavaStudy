package days12;

import java.util.Arrays;

// 객체 배열
class Student{
	int bunho;
	String name;
	int [] scores;
	
	static int count = 0;
	
	public Student() {
		scores = new int[3];
		bunho = ++count;
		name = "std" + bunho;
	}
	
	Student(int k, int e, int m){
		this();
		scores[0] = k;
		scores[1] = e;
		scores[2] = m;
	}
	
	void setBunho(int b) {
		bunho = b;
	}
	
}

public class Class27 {

	public static void main(String[] args) {
		
		int [] a = new int[5];
		String [] str = new String[5];
		
		System.out.println(a[0]);
		System.out.println(str[0]);
		
		Student [] std = new Student[5]; // 객체 배열 생성
		System.out.println(std[0]);
		//std[0].bunho = 1;
		//std[0].setBunho(10);
		
		//Student [] std = new Student[5]; 이 명령은 객체 5개를 만든게 아니라 참조변수 5개를 만든 것
		//std[0] = new Student(); 다섯개의 참조변수가 객체로 활용되려면 이 명령이 각각 실행되어야 합니다.
		std[0] = new Student(98,97,96);
		std[1] = new Student(78,57,36);
		std[2] = new Student(88,47,46);
		std[3] = new Student(58,27,56);
		std[4] = new Student(48,67,76);
		
		//결론 : 배열만 만들면 끝이 아니라 배열의 한칸 한칸에 뉴인스턴스의 주소를 채워줘야 
		//         배열의 요소갯수만큼 객체의 사용이 가능
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student(100, 100, 100);
		}
		
		
	}

}
