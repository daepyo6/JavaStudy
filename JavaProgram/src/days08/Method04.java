package days08;

public class Method04 {
	
	

	public static void main(String[] args) {
		
		prnTitle();
		prnScore("홍길동", 87, 89, 97);

	}

	public static void prnScore(String name, int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		double avg = tot/3.0;
		
		System.out.print( 1 +"\t");
		System.out.print(name+"\t\t");
		System.out.print(kor+"\t");
		System.out.print(eng+"\t");
		System.out.print(mat+"\t");
		System.out.print(tot+"\t");
		System.out.printf("%.1f\n", avg);	

	}

	public static void prnTitle() {
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("-----------------------------------------------\n");
		
	}

}
