package days09;

import java.util.Scanner;

public class Method19 {

	public static void main(String[] args) {

		int[][] scores = {};
		double[] avg = {};
		String[] grade = {};

		// 학생 수와 과목 수는 정해지지 않음
		int s = getStudentNumber(); // 학생수 입력
		int k = getSubjectNumber(); // 과목수 입력

		scores = new int[s][k + 1];
		avg = new double[s];
		grade = new String[s];

		input(scores); // s명의 학생의 k개의 과목점수 입력
		cals(scores, avg, grade); // 총점, 평균, 학점 계산
		output(k, scores, avg, grade); // 양식에 맞개 출력

	}

	private static int getStudentNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("학생 수를 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	private static int getSubjectNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수를 입력 : ");
		int num = sc.nextInt();
		return num;
	}

	private static void input(int[][] scores) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length - 1; j++) {
				System.out.printf("%d번째 사람 %d과목 점수 입력 : ", i + 1, j + 1);
				scores[i][j] = sc.nextInt();
			}
		}
	}

	private static void cals(int[][] scores, double[] avg, String[] grade) {
		String[] g = { "F", "F", "F", "F", "F", "F", "D", "C", "B", "A", "A" };

		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length - 1; j++) {
				scores[i][scores[i].length - 1] += scores[i][j];
			}
			avg[i] = scores[i][scores[i].length - 1] / (double) (scores[i].length - 1);
			grade[i] = g[(int) (avg[i] / 10)];
		}
	}

	private static void output(int sub, int[][] scores, double[] avg, String[] grade) {
		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t");
		for (int i = 0; i < sub; i++)
			System.out.printf("%d과목\t", i + 1);
		System.out.printf("총 점\t평 균\t학 점\n");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < scores.length; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < scores[i].length; j++)
				System.out.print(scores[i][j] + "\t"); // 총점까지 출력
			System.out.printf("%.1f\t", avg[i]);
			System.out.println(grade[i]);
		}
		System.out.printf("-----------------------------------------------\n");

	}

}
