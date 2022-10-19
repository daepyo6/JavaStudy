package days04;

public class Operator02 {

	public static void main(String[] args) {
		/* 관계연산자(비교연산자)
		 * 좌항 기준 >(초과) <(미만) >=(이상) <=(이하) ==(같다) !=(같지않다)
		 * 좌항과 우항의 크기를 비교하여 true/false 값이 결과가 되는 연산
		 * 맞으면 true, 틀리면 false가 결과 값
		 */
		
		int n1 = 10, n2 = 5;
		boolean res = n1 > n2;
		System.out.println(n1 + " > " + n2 +" : " + res);
		res = n1 < n2;
		System.out.println(n1 + " < " + n2 +" : " + res);
		res = n1 >= n2;
		System.out.println(n1 + " >= " + n2 +" : " + res);
		res = n1 <= n2;
		System.out.println(n1 + " <= " + n2 +" : " + res);
		res = n1 == n2;
		System.out.println(n1 + " == " + n2 +" : " + res);
		res = n1 != n2;
		System.out.println(n1 + " != " + n2 +" : " + res);
		
		System.out.println();
		
		// 문자(char) 데이터들 간에 비교
		
		char c1 = 'A', c2 = 'B';  // A = 65, A = 66
		
		res = c1 > c2;
		System.out.println(c1 + " > " + c2 +" : " + res);
		res = c1 < c2;
		System.out.println(c1 + " < " + c2 +" : " + res);

		// "1234" < "987"
		String s1 = "1234", s2 = "987";
		
		// 에러.
		// res = s1 < s2;
		// System.out.println(s1 + " < " + s2 +" : " + res);
		
		// s1과 s2는 기본 자료들과는 달리 조금 특별한 자료형이며, 이 두변수가 직접 문자를 지정하고 있지 않습니다.
		// 문자들은 별도의 장소에 저장하고, 변수에는 그 문자들의 위치정보(주기억장치 내 위치) 값을 저장합니다.
		// 사용가능한 비교 연산자 : ==, != 
		
		// String 자료간의 비교는 별도로 만들어져 있는 도구 이용
		// String의 크다 작다를 판단 :  compareTo()
		// String의 같다 다르다를 판단 : equals()
		int r = s1.compareTo(s2);
		System.out.println(s1 + " > " + s2 +" : " + r);
		// compareTo()의 결과는 정수. 맨 첫글자부터 비교했을 떄 처음으로 같은글자가 아닌 곳에서
		// 앞글자에서 뒤글자를 빼는 산술연산을 해서 얻은 결과
		// 결과가 양수이면 앞쪽글자가 크다, 음수이면 뒷글자가 크다라고 표현
		// 두 글자가 정확히 일치하면 결과는 0입니다.
		r = s2.compareTo(s1);
		System.out.println(s1 + " > " + s2 +" : " + (r>0));
		System.out.println(s1 + " > " + s2 +" : " + (r<0));
		System.out.println(s1 + " == " + s2 +" : " + (r==0));
		
		res = s1.equals(s2);
		System.out.println(s1 + " == " + s2 +" : " + res);
		res = s1.equals("1234");
		System.out.println(s1 + " == 1234 : " + res);
		
	}

}
