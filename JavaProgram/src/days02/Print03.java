package days02;

public class Print03 {

	public static void main(String[] args) {

		System.out.printf("\t\t      ###성적표###\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("번 호\t 성 명\t\t국 어\t영 어\t수 학\t총 점\t평 균\n");
		System.out.printf("-----------------------------------------------\n");
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",1,"홍길동",8 ,45 ,100,8+45+100,(8+45+100)/3.0);
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",2,"홍길남",89 ,100 ,9 ,89+100+9,(89+100+9)/3.0);
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",3,"홍길서",100 ,8 ,78, 100+8+78,(100+8+78)/3.0);
		System.out.printf("%3d\t%3s\t\t%3d\t%3d\t%3d\t%3d\t%5.1f\n",4,"홍길북",100 ,100 ,100, 100+100+100,(100+100+100)/3.0);
		System.out.printf("-----------------------------------------------\n");

	}

}
