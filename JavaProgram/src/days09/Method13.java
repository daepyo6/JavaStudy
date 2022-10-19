package days09;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		int kor, eng, mat, tot;
		double avg;
		// String grade;
		
		kor = myInput(1); 
		eng = myInput(2); 
		mat = myInput(3);  
		tot = sum(kor, eng, mat);
		avg = avg(kor, eng, mat);
		prnTitle();
		prnScore(kor, eng, mat, tot, avg);

	}

	private static int myInput(int i) {
		int score;
		Scanner sc = new Scanner(System.in);
		if(i==1) System.out.print("국어 점수 입력 : ");
		else if(i==2) System.out.print("영어 점수 입력 : ");
		else System.out.print("수학 점수 입력 : ");
		score = sc.nextInt();
		
		return score;
	}

	private static int sum(int kor, int eng, int mat) {
		return kor+eng+mat;
	}

	private static double avg(int kor, int eng, int mat) {
		return (kor+eng+mat)/3.0;
	}

	private static void prnTitle() {
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("--------------------------------\n");
		System.out.printf("국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("--------------------------------\n");
	}

	private static void prnScore(int kor, int eng, int mat, int tot, double avg) {
		System.out.print(kor +"\t");
		System.out.print(eng +"\t");
		System.out.print(mat +"\t");
		System.out.print(tot +"\t");
		System.out.printf("%.1f\t", avg);
	}

}
