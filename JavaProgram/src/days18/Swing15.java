package days18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class JTextFieldTextArea extends JFrame implements ActionListener{

	JTextField jtf;
	JTextArea jta;
	
	public JTextFieldTextArea() {
		jtf = new JTextField(10);
		jta = new JTextArea(7, 20);	// 7행 20열의 텍스트 에리어
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jtf.setFont(f);
		jta.setFont(f);
		
		JButton k = new JButton("확인");
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		k.addActionListener(this);
		
		con.add(jtf);
		con.add(jta);
		con.add(k);
		
		setTitle("텍스트 필드 텍스트 에어리어");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = jtf.getText();
		if( s!=null && !s.equals("")) {
			jta.append(s + "\n");	// append : 기존 내용을 새 내용에 이어쓰기 위한 메서드
			jtf.setText("");
		}
		
	}

}

public class Swing15 {

	public static void main(String[] args) {
		new JTextFieldTextArea();

	}

}
