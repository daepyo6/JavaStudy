package days16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 배치 관리자
class JFlowLayout extends JFrame{
	
	public JFlowLayout() {
		/*
		// 배치관리자 없이 버튼을 컨테이너에 무작정 올린 형태 (FlowLayout도 적용이 안된 상태)
		JButton btn1 = new JButton();
		JButton btn2 = new JButton();
		Container con = getContentPane();
		//con.setLayout(new FlowLayout());
		con.add(btn1);
		con.add(btn2);
		con.add(new JButton("버튼3"));
		*/
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 10));
		// 50 : 컨트롤끼리의 가로방향 간격, 10 : 컨트롤끼리의 세로방향 간격
		// FlowLayout.LEFT ,FlowLayout.RIGHT : 정렬방식
		for (int i = 0; i < 15; i++) {
			con.add(new JButton("버튼"+(i+1)));
		} 
		
		setTitle("배치 관리자 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
				
	}
	
}

public class Swing06 {
	
	public static void main(String[] args) {
		new JFlowLayout();
	}
}
