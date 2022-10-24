package days18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

class JCheckBoxTest extends JFrame implements ActionListener{
	
	JTextField jtf;
	JCheckBox jcb1;
	JCheckBox jcb2;
	JCheckBox jcb3;
	JCheckBox jcb4;
	// 리스너를 이용하기 위해 참조변수는 클래스 전역에서 사용이 가능한 멤버변수로 설정
	
	public JCheckBoxTest() {
		
		jcb1 = new JCheckBox("JSP");
		jcb2 = new JCheckBox("ASP");
		jcb3 = new JCheckBox("PHP");
		jcb4 = new JCheckBox("SERVLET");
		jtf = new JTextField(30);
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jcb1.setFont(f);
		jcb2.setFont(f);
		jcb3.setFont(f);
		jcb4.setFont(f);
		jtf.setFont(f);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		jcb1.addActionListener(this);
		jcb2.addActionListener(this);
		jcb3.addActionListener(this);
		jcb4.addActionListener(this);
		
		
		con.add(jcb1);
		con.add(jcb2);
		con.add(jcb3);
		con.add(jcb4);
		con.add(jtf);
		
		setTitle("체크박스 실습");
		setSize(800, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "";
		
		if(jcb1.isSelected() == true)
			s = s + jcb1.getActionCommand() + " ";
		if(jcb2.isSelected() == true)
			s = s + jcb2.getActionCommand() + " ";
		if(jcb3.isSelected() == true)
			s = s + jcb3.getActionCommand() + " ";
		if(jcb4.isSelected() == true)
			s = s + jcb4.getActionCommand() + " ";
		
		jtf.setText(s);
		
	}
	
	
	
}

public class Swing16 {

	public static void main(String[] args) {
		new JCheckBoxTest();

	}

}
