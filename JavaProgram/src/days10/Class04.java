package days10;

class Std{
	private int num;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	public void input(int i, String str, int k, int e, int m) {
		num = i;
		name = str;
		kor = k;
		eng = e;
		mat = m;
		tot = k+e+m;
		avg = tot / 3.0;
	}

	public void prn() {
		System.out.println(num+"\t"+name+"\t\t"+kor+"\t"+eng+
				"\t"+mat+"\t"+tot+"\t"+Math.round(avg*10)/10.0);
	}
}

public class Class04 {
	
	public static void main(String[] args) {
		
		Std s1 = new Std();
		Std s2 = new Std();
		
		s1.input(1, "홍길동", 88, 77, 99);
		s2.input(2, "홍길서", 89, 98, 78);
		System.out.println("===============================");
		System.out.println("번호\t성명\t\t국어\t영어\t수학\t총점\t평균");
		System.out.println("===============================");
		s1.prn();
		s2.prn();
		System.out.println("===============================");
		
	}
}
