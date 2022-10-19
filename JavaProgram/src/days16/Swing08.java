package days16;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class JGridLayout extends JFrame{
	public JGridLayout() {
		Container con = getContentPane();
		// 화면 배치를 행과 열의 갯수로 배치하고 조절합니다.
		con.setLayout(new GridLayout(3, 5, 20, 20));
		// 3행 5열의 가로세로 간격 20px씩의 배치
		
		for (int i = 1; i <= 15; i++) {
			con.add(new JButton("버튼"+i));
		}
		
		setTitle("JGridLayout 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Swing08 {
	public static void main(String[] args) {
		new JGridLayout();
	}
}
