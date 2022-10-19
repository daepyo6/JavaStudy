package days04;

public class Operator03 {

	public static void main(String[] args) {
		/* 논리연산자 &&(and) ||(or) !(not)
		 * 다수개의 관계 연산식의 결과 값을 연산하여 하나의 boolean값을 결과로 얻는 연산
		 * 피연산자 : boolean, 결과 : boolean
		 */
		
		boolean res = true && false;
		System.out.println( true + " && " + false + " -> " + res );
		
		System.out.println();
		/* AND연산 - &&
		*	좌항과 우항이 모두 true일 때만 true이고, 나머진 false
		*	좌항, 우항에 하나라도 false가 있으면 결과는 false
		*/
		System.out.println( "F && F : " + (false&&false) );
		System.out.println( "T && F : " + (true&&false) );
		System.out.println( "F && T : " + (false&&true) );
		System.out.println( "T && T : " + (true&&true) );
		System.out.println();
		
		/* OR 연산 ||
		 * 좌항과 우항 중 하나라도 true가 있으면 결과는 true
		 * 둘다 모두 false일 때 결과가 false
		 */
		System.out.println( "F || F : " + (false||false) );
		System.out.println( "T || F : " + (true||false) );
		System.out.println( "F || T : " + (false||true) );
		System.out.println( "T || T : " + (true||true) );
		System.out.println();
		
		/* NOT 연산 !
		 * true/false 값을 현재의 반대 값으로 변경하는 연산
		 */
		res = false;
		System.out.println("NOT 연산 : "+ res + " -> " + !res);
		System.out.println();
		
		// 입력받은 점수가 50이상 100이하면 true, 아니면 false
		int s =80;
		
		boolean res1 = s >= 50;
		boolean res2 = s <= 100;
		
		res = res1 && res2;
		System.out.println("res1 && res2 = " + res);
		
		// 입력받은 점수 100이상 이거나 40미만이라면 true, 아니면 false
		s = 30;
		res1 = s>=100;
		res2 = s<40;
		res = res1||res2;
		System.out.println("res1 || res2 = " + res);
		
		// 점수가 80점 이상이면서 90점 이하이면 true, 아니면 false
		int number = 80;
		res = (number>=80) && (number<=90);
		System.out.println("점수가 80점 이상이면서 90점 이하 : " + res);
		
		// 점수가 100점 이상이거나 50점 미만이면 true, 아니면 false
		res = (number>=50) || (number<50);
		System.out.println("점수가 100점 이상이거나 50점 미만 : " + res);
		
		int kor = 35, eng = 98, mat = 95;
		int tot = kor+eng+mat;
		double avg = tot/3.0;
		
		// 평균이 80점 이상이면서 영어점수가 75점 이상이고, 국어점수가 80점 이상이면 true, 아니면 false
		res = (avg>=80) && (eng>=75) && (kor>=80);
		System.out.println("평균이 80점 이상이면서 영어점수가 75점 이상이고, 국어점수가 80점 이상 : " + res);
		
		// 국어 50이상, 영어 60이상, 수학 70이상이면 true, 아니면 false
		res = (kor>=50) && (eng>=60) && (mat>=70);
		System.out.println("국어 50이상, 영어 60이상, 수학 70이상 : " + res);
		
		// 세 과목중 한과목이라도 40미만이면 true, 모두 40이상 이면 false
		res = (kor<40) || (eng<40) || (mat<40);
		System.out.println("세 과목중 한과목이라도 40미만 : " + res);
		
		// 평균 60이상이면서 모든 과목이 40이상이면 true, 아니면 false
		res = (avg>=60) && ((kor>=40) && (eng>=40) && (mat>=40));
		System.out.println("평균 60이상이면서 모든 과목이 40이상 : " + res);
		
		// 평균 60미만이거나 한 과목이라도 40미만이면 true, 아니면 false
		res = (avg<60) || ((kor<40) || (eng<40) || (mat<40));
		System.out.println("평균 60미만이거나 한 과목이라도 40미만 : " + res);
		
		// 국어점수가 짝수이면 true, 아니면 false
		kor = 90;
		res = (kor%2) == 0;
		System.out.println("국어점수가 짝수 : " + res);
		System.out.println();
		
		// year변수에 저장된 년도가 윤년이면 true, 평년이면 false를 출력
		// 윤년은 해당연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수인 해
		int year = 2002;
		res = (year%4)==0 && (year%100)!=0 || (year%400)==0;
		System.out.println( year + "년은 윤년인가 : " + res);
	}

}
