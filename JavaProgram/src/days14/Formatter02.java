package days14;

import java.text.DecimalFormat;

public class Formatter02 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0000.00");
		double number = 123.123456;
		System.out.println(df.format(number));
		
		System.out.println("0000.00 : " + number + " --> " + df.format(number));
		
		/* 양식문자 0 : 표시할 숫자들의 자리표현. 0:숫자 한자리 00:숫자 두자리 등
		 * 1. 표시할 숫자는 많은데 0의 갯수가 모자르면 필요한 만큼 0의 갯수를 자동 추가적용
		 * 		숫자 12345, 양식 000 -> 표시 12345
		 * 2. 숫자 자리수보다 0의 갯수가 많으면 많은 만큼 0으로 채워서 표시
		 * 		숫자 123, 양식 00000 -> 표시 00123
		 * 3. 소수점 아래에 대해서는 반대로 0의 갯수만큼만 소수점 아래 자리수를 표시
		 * 		0갯수로 인해 표시되지 못하는 소수점 자리중 가장 윗자리에서 반올림
		 * 4. 남는 자리에 강제로 0을 채우는 방식은 동일
		 * 		0.1264(0.00) -> 0.13,  0.1(0.00) -> 0.10
		 */
		
		df = new DecimalFormat("0.000");
		number = 123456.71289;
		System.out.println("0.000 : " + number + " --> " + df.format(number));
		
		df = new DecimalFormat("0,000");
		number = 123456789.0;
		System.out.println("0,000 : " + number + " --> " + df.format(number));
		
		number = 89.0;
		System.out.println("0,000 : " + number + " --> " + df.format(number));
		
		// 무효의 0을 표시하지 않는 #을 0대신 사용
		df = new DecimalFormat("#,###");
		System.out.println("#,### : " + number + " --> " + df.format(number));
		
		// 10의 자리든 100의 자리든 표시 할 숫자가 있을 때만 표시 -> 강제 0표시 안함
		// 표시할 숫자가 1000을 넘어갈때만 (,)을 표시
		df = new DecimalFormat("#,###");
		number = 123456.0;
		System.out.println("#,### : " + number + " --> " + df.format(number));
		
		// #을 이용한 소수점 표시 : #의 갯수보다 표시할 숫자가 많으면 # 갯수만큼만 표시
		// #의 갯수보다 표시할 숫자가 적으면 있는 숫자만큼만 표시
		df = new DecimalFormat("#,###.###");
		number = 123456.7128;
		System.out.println("#,###.### : " + number + " --> " + df.format(number));
		
		number = 123456.7;
		System.out.println("#,###.### : " + number + " --> " + df.format(number));
		
		// 단위 또는 기호를 추가해서 숫자 포멧에 담아야 할떄
		df = new DecimalFormat("#,###원");
		number = 1234;
		System.out.println("#,###원: " + number + " --> " + df.format(number));
		
		//음수와 양수 표시
		df = new DecimalFormat("#,###.##+;#,###.##-");
		number = -1234.2;
		System.out.println("#,###.##+;#,###.##- : " + number + " --> " + df.format(number));
		
		// %의 표시
		df = new DecimalFormat("#.#%");
		number = 0.8539;
		System.out.println("#.#% : " + number + " --> " + df.format(number));
		
		number = 123.172839;
		System.out.println("123.172839 -> " + (int)(number*10)/10.0); 	// 반올림 안됨
		df = new DecimalFormat("0.0");
		System.out.println("123.172839 -> " + df.format(number)); 		// 반올림 됨
		
	}

}
