package days11;

// 복소수  5+3i
// i -> 루트-1 : -1의 제곱근(허수)

class Complex{
	private int real;
	private int image;
	
	void prn(/* Complex this */) {
		System.out.println("(" +this.real+"+"+this.image+"i)");
	}

	public void init(int real, int image /* , Complex this */) {
		this.real = real;
		this.image = image;
	}
	
	public Complex(/* Complex this */) {
		// TODO Auto-generated constructor stub
	}
	
	public Complex(int real, int image /* , Complex this */) {
		this.real = real;
		this.image = image;
	}

	public Complex add(Complex c /* , Complex this */) {
		Complex temp = new Complex();
		temp.real = c.real + this.real;
		temp.image = c.image + this.image;
		return temp;
	}

	public Complex subtract(Complex c /* , Complex this */) {
		Complex temp = new Complex();
		temp.real =  this.real - c.real;
		temp.image = this.image - c.image;
		return temp;
	}
	
}

// 생략없이 표시할 수 있는 this는 모두 표시해주세요
public class Class16 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		c1.init(5, 6);
		Complex c2 = new Complex(3, 4); //실수부는 실수부끼리 허수부는 허수부끼리 합산
		
		Complex c3 = c1.add(c2);
		c1.prn();
		c2.prn();
		c3.prn();
		System.out.println();
		
		c3 = c1.subtract(c2); //실수부는 실수부끼리 허수부는 허수부끼리 뺄셈
		c1.prn();
		c2.prn();
		c3.prn();
	}

}
