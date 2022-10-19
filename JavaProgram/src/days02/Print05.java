package days02;

public class Print05 {
	public static void main(String[] args) {	
		System.out.println("\t\t    ###성적표###");
		System.out.println("-----------------------------------------------");
		System.out.println("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균");
		System.out.println("-----------------------------------------------");
		System.out.println("  1\t홍길동\t\t88\t45\t100\t"+ (88+45+100) +"\t "+ (88+45+100)/3.0);
		System.out.println("  2\t홍길남\t\t89\t100\t100\t"+ (89+100+100) +"\t "+ (int)((89+100+100)/3.0*10)/10.0);
		System.out.println("  3\t홍길서\t\t100\t88\t88\t"+ (100+88+88) +"\t "+ (100+88+88)/3.0);
		System.out.println("-----------------------------------------------");
	}
}
