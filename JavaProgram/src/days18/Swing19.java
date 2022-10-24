package days18;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class resume extends JFrame implements ActionListener{
	public resume() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		Font f = new Font("굴림", Font.BOLD, 20);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		
		JLabel jl1 = new JLabel("성        명  :  ");
		jl1.setFont(f);
		jp1.add(jl1);
		JLabel jl2 = new JLabel("성        별  :  ");
		jl2.setFont(f);
		jp1.add(jl2);
		JLabel jl3 = new JLabel("취        미  :  ");
		jl3.setFont(f);
		jp1.add(jl3);
		JLabel jl4 = new JLabel("전 화 번 호  :  ");
		jl4.setFont(f);
		jp1.add(jl4);
		JLabel jl5 = new JLabel("거 주 지 역  :  ");
		jl5.setFont(f);
		jp1.add(jl5);

		// 성명 텍스트 필드
		JTextField jtf1 = new JTextField(20);
		JPanel jp20 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 25));
		jp20.add(jtf1);
		jp2.add(jp20);
		
		// 성별 라디오버튼
		JRadioButton jrb1 = new JRadioButton("남성");
		jrb1.setFont(f);
		JRadioButton jrb2 = new JRadioButton("여성");
		jrb2.setFont(f);
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1); bg.add(jrb2);
		JPanel jp21 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
		jp21.add(jrb1); jp21.add(jrb2);
		jp2.add(jp21);
		
		// 취미 체크박스
		JCheckBox jcb1 = new JCheckBox("독서");
		jcb1.setFont(f);
		JCheckBox jcb2 = new JCheckBox("게임");
		jcb2.setFont(f);
		JCheckBox jcb3 = new JCheckBox("운동");
		jcb3.setFont(f);
		JCheckBox jcb4 = new JCheckBox("수면");
		jcb4.setFont(f);
		JPanel jp22 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
		jp22.add(jcb1); jp22.add(jcb2); jp22.add(jcb3); jp22.add(jcb4);
		jp2.add(jp22);
		
		// 전화번호 텍스트필드
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("010");		
		jcb.addItem("011");
		jcb.addItem("016");
		jcb.addItem("019");
		jcb.setFont(f);
		JLabel jl21 = new JLabel(" - ");
		JTextField jf21 = new JTextField(7);
		JLabel jl22 = new JLabel(" - ");
		JTextField jf22 = new JTextField(7);
		JPanel jp23 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
		jp23.add(jcb); jp23.add(jl21); jp23.add(jf21); jp23.add(jl22); jp23.add(jf22);
		jp2.add(jp23);
		
		// 거주지역 표시
		JComboBox<String> jcb21 = new JComboBox<String>();
		JPanel jp24 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
		jcb21.addItem("서울");		
		jcb21.addItem("경기");
		jcb21.addItem("대전");
		jcb21.addItem("대구");
		jcb21.addItem("부산");
		jcb21.setFont(f);
		jp24.add(jcb21);
		jp2.add(jp24);
		
		// 확인버튼 
		JButton jb = new JButton("확인");
		JPanel jp25 = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
		jb.setFont(f);
		jp25.add(jb);
		jp2.add(jp25);
		
		con.add(jp1, BorderLayout.WEST);
		con.add(jp2, BorderLayout.CENTER);
		
		setTitle("실습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
}

public class Swing19 {

	public static void main(String[] args) {
		new resume();

	}

}
