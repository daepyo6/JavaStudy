package days16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// 윈도우에 텍스트필드1 버튼1 버튼2 텍스트필드2
// 순서로 배치
// 버튼1의 표면에는 ">" 글자표시, 버튼2의 표면에는 "<"글자를 표시
// 버튼1을 클릭하면 텍스트1의 글자가 텍스트2로 옮겨지게
// 버튼2을 클릭하면 텍스트2의 글자가 텍스트1로 옮겨지게
// 글자가 없는 상태에서 클릭하면 아무일도 안일어나게

class TextFieldEx extends JFrame implements ActionListener {
	JTextField jtf1, jtf2;
	JButton bt1, bt2;

	public TextFieldEx() {
		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);

		bt1 = new JButton(">");
		bt2 = new JButton("<");

		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jtf1);
		con.add(bt1);
		con.add(bt2);
		con.add(jtf2);

		bt1.addActionListener(this);
		bt2.addActionListener(this);

		setTitle("텍스트 필드 테스트");
		setSize(500, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = e.getActionCommand();
		String s1 = jtf1.getText();
		String s2 = jtf2.getText();

		if (a.equals(">")) {
			if (!(s1.equals(""))) {
				s1 = jtf1.getText();
				jtf2.setText(s1);
				jtf1.setText("");
			}
		} else {
			if (!(s2.equals(""))) {
				s2 = jtf2.getText();
				jtf1.setText(s2);
				jtf2.setText("");
			}

		}

		/*
		 * if(s1.equals("") && s2.equals("")){ 
		 * 		jtf1.setText(""); 
		 * 		jtf2.setText("");
		 * }else{ 
		 * 		if(e.getSource() == bt1) {
		 *  	jtf1.setText(""); 
		 *  	jtf2.setText(s2 + s1);
		 * }else if(e.getSource() == bt2) { 
		 * 		jtf2.setText(""); 
		 * 		jtf1.setText(s1 + s2); }
		 * }
		 */

	}
}

public class Swing11 {

	public static void main(String[] args) {
		new TextFieldEx();
	}

}
