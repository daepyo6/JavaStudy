package days11;

class Student3{
	private int bun;
	private String name;
	private int [] scores;
	static int count = 0;
	
	public Student3() {
		this.scores = new int[3];
		count++;
		bun = count;
	}
	
	public Student3(String name) {
		this();
		this.name = name;
		this.scores[0] = 80;
		this.scores[1] = 90;
		this.scores[2] = 100;
	}

	public Student3(String name, int n1, int n2, int n3) {
		this();
		this.name = name;
		this.scores[0] = n1;
		this.scores[1] = n2;
		this.scores[2] = n3;
	}

	public Student3(Student3 s) {
		this();
		this.name = s.name;
		this.scores[0] = s.scores[0];
		this.scores[1] = s.scores[1];
		this.scores[2] = s.scores[2];
	}

	public void copy(Student3 s) {
		this.name = s.name;
		this.scores[0] = s.scores[0];
		this.scores[1] = s.scores[1];
		this.scores[2] = s.scores[2];
	}

	public void prn() {
		int tot = 0;
		System.out.print(bun +"\t"+ name +"\t\t");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] +"\t");
			tot += scores[i];
		}
		System.out.print(tot +"\t");
		System.out.println(tot/(double)scores.length +"\t");
		
	}
	
	
}

public class Class21 {

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3("홍길서");
		Student3 s3 = new Student3("홍길동", 98, 87, 89);
		Student3 s4 = new Student3(s3);
		s1.copy(s2);
		
		//성적표 출력
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("===========================\n");
		System.out.printf("번 호\t이 름\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("===========================\n");
		s1.prn(); s2.prn(); s3.prn(); s4.prn();
		System.out.printf("===========================\n");
		System.out.println("학생 총인원 : " + Student3.count);

	}

}
