package days16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JButtonEvent extends JFrame implements ActionListener {
	JLabel result;

	public JButtonEvent() {
		// 이미지파일을 불러와서 자바 Swing 화면에 표시하려면 이미지 파일을 아이콘형태로 변환하여 사용해야합니다.
		ImageIcon korea = new ImageIcon("images/korea1.gif");
		ImageIcon germany = new ImageIcon("images/germany.gif");
		ImageIcon usa = new ImageIcon("images/usa.gif");
		// 버튼을 텍스트를 포함하여 이미지까지 표시하며 생성합니다.
		JButton eventButton = new JButton(korea);

		eventButton.setRolloverIcon(usa);
		eventButton.setPressedIcon(germany);
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(eventButton);

		setTitle("버튼 자체 이벤트 처리 실습");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}

public class Swing05 {
	public static void main(String[] args) {
		new JButtonEvent();
	}
}
