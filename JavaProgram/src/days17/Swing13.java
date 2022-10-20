package days17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Calculator extends JFrame implements ActionListener{
	JTextField jtf;
	int firstNumber;
	int secondNumber;
	String operator;
	
	int res1;
	double res2;
	
	public Calculator() {
		
		Container con = getContentPane();
		//GridLayout g = new GridLayout(5,4);
		Font f = new Font("굴림", Font.BOLD, 20); // 폰트 객체 생성
		//JButton b = new JButton("폰트");
		//b.setFont(f);		// 버튼 글자에 폰트 적용
		//con.add(b);
		con.setLayout(new GridLayout(6,1));
		
		JPanel p0 = new JPanel(new GridLayout(1,1));
		jtf = new JTextField(20);
		jtf.setText("0");
		jtf.setFont(f);
		jtf.setHorizontalAlignment(SwingConstants.RIGHT); // 텍스트 필드 오른쪽 정렬
		jtf.setEditable(false);		// 텍스트 필드 수정 불가능
		p0.add(jtf);
		
		JPanel p1 = new JPanel(new GridLayout(1,1));
		JButton bb = new JButton("<-");
		JButton b10 = new JButton("");
		JButton b11 = new JButton("");
		JButton b12 = new JButton("");
		bb.setFont(f);
		b10.setFont(f);
		b11.setFont(f);
		b12.setFont(f);
		p1.add(bb);
		p1.add(b10);
		p1.add(b11);
		p1.add(b12);
		
		JPanel p2 = new JPanel(new GridLayout(1,4));
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bplus = new JButton("+");
		b7.setFont(f);
		b8.setFont(f);
		b9.setFont(f);
		bplus.setFont(f);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bplus);
		
		JPanel p3 = new JPanel(new GridLayout(1,4));
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton bminus = new JButton("-");
		b4.setFont(f);
		b5.setFont(f);
		b6.setFont(f);
		bminus.setFont(f);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		p3.add(bminus);
		
		JPanel p4 = new JPanel(new GridLayout(1,4));
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton bmult = new JButton("*");
		b1.setFont(f);
		b2.setFont(f);
		b3.setFont(f);
		bmult.setFont(f);
		p4.add(b1);
		p4.add(b2);
		p4.add(b3);
		p4.add(bmult);
		
		JPanel p5 = new JPanel(new GridLayout(1,4));
		JButton bC = new JButton("C");
		JButton b0 = new JButton("0");
		JButton bequal = new JButton("=");
		JButton bdiv = new JButton("/");
		bC.setFont(f);
		b0.setFont(f);
		bequal.setFont(f);
		bdiv.setFont(f);
		p5.add(bC);
		p5.add(b0);
		p5.add(bequal);
		p5.add(bdiv);
		
		con.add(p0);
		con.add(p1);
		con.add(p2);
		con.add(p3);
		con.add(p4);
		con.add(p5);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bplus.addActionListener(this);
		bminus.addActionListener(this);
		bmult.addActionListener(this);
		bdiv.addActionListener(this);
		bequal.addActionListener(this);
		bC.addActionListener(this);
		bb.addActionListener(this);
		
		setTitle("계산기 실습");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String s = e.getActionCommand();
		String oldText = jtf.getText();
		
		switch(s) {
		case "<-":
			// String  	.length() : 글자 개수
			// 			   	.substring(n, m) : 일부글자 추출
			// 조건 0이면 지우면 안됨
			// 한자리 남았을때 지우면 0으로 변경
			if(!(oldText.equals("0")))
				jtf.setText(oldText.substring(0, oldText.length()-1));
			if(oldText.length() == 1)
				jtf.setText("0");
			break;
		case "=":
			secondNumber = Integer.parseInt(jtf.getText());
			switch (operator) {
			case "+":
				res1 = firstNumber + secondNumber;
				jtf.setText(String.valueOf(res1));
				break;
			case "-":
				res1 = firstNumber - secondNumber;
				jtf.setText(String.valueOf(res1));
				break;
			case "*":
				res1 = firstNumber * secondNumber;
				jtf.setText(String.valueOf(res1));
				break;
			case "/":
				res2 = firstNumber / (double)secondNumber;
				jtf.setText(String.valueOf(res2));
				break;
			}
			break;
		case "+": case "-": case "*": case "/":
			operator = s;
			firstNumber = Integer.parseInt(jtf.getText());
			jtf.setText("0");
			break;
		case "C":
			jtf.setText("0");
			break;
		case "0": case "1": case "2": case "3": case "4":
		case "5": case "6": case "7": case "8": case "9":
			if(oldText.equals("0")) 
				jtf.setText(s);
			else jtf.setText(oldText + s);
			break;
		}
		
		
	}
	
}

public class Swing13 {

	public static void main(String[] args) {
		new Calculator();

	}

}
