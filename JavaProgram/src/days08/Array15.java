package days08;

import java.util.Scanner;

public class Array15 {

	public static void main(String[] args) {
		
		int [][] score = new int[3][4];
		
		double [] avg = new double[3];
		String [] name = new String[3];
		char [] grade = new char[3];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번 학생 이름 : ");
			name[i] = sc.nextLine();
			
			for (int j = 0; j < score[i].length-1; j++) {
				if(j==0) System.out.println("국어 점수 : ");
				else if(j==1) System.out.println("영어 점수 : ");
				else System.out.println("수학 점수 : ");
				score[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
		char [] g = {'F', 'F', 'F', 'F', 'F', 'F', 'D', 'C', 'B', 'A', 'A'};
		// 이중반복문을 이용 총점 평균 등급 계산
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length-1; j++) {
				score[i][score[i].length-1] += score[i][j];
			}
			avg[i] = score[i][score[i].length-1] / 3.0;
			grade[i] = g[(int)(avg[i]/10)];
		}
		
		
		// 이중반복문을 이용해서 성적표 출력
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\t학 점\n");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < score.length; i++) {
				System.out.print((i+1)+"\t");
				System.out.print(name[i]+"\t\t");
				for (int j = 0; j < score[i].length; j++) 
					System.out.print(score[i][j]+"\t");
				System.out.printf("%.1f\t", avg[i]);
				System.out.println(grade[i]);
			}
		System.out.printf("-----------------------------------------------\n");
		
	}
}
