package days18;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

class JComboBoxTest extends JFrame implements ItemListener{
	
	JLabel jl;
	ImageIcon ii;
	JComboBox<String> jcb;
	
	public JComboBoxTest() {
		jcb = new JComboBox<String>();
		// 콤보상자에 목록으로 들어갈 데이터는 String, Double, Integer, 그 외 객체 등이 가능합니다.
		// 제네릭형식으로 지정하는 것이 보통입니다.
		
		jcb.addItem("banana");		//.addItem : 콤보상자의 목록 추가
		jcb.addItem("apple");
		jcb.addItem("pear");
		jcb.addItem("cherry");
		jcb.addItem("grape");
		
		Font f = new Font("굴림", Font.BOLD, 20);
		jcb.setFont(f);
		
		// 콤보상자 목록중 하나를 선택하면 나타날 이미지를 최초상태로 설정. 라벨에 이미지를 이용하여 표시
		ii = new ImageIcon("images/banana.jpg");
		jl = new JLabel(ii); // 라벨의 이미지는 최초 상태인 바나나로...
		
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(jcb);
		con.add(jl);
		
		jcb.addItemListener(this);
		// 콤보상자에 선택된 아이템을 얻으려면 ActionListener로는 불가능합니다.
		//jcb.addActionListener(this);
		
		setTitle("콤보박스 실습");
		setSize(500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s = (String) e.getItem();	// 상태가 변한 컨트롤의 현재 선택값 추출
		// 제네릭을 사용했기 때문에 (String)같은 강제캐스팅이 필요없을거 같지만, 현재 메서드 내부에서는
		// ItemEvent 형식의 참조변수에 저장되었다가 꺼내어지는 것이기 때문에 강제캐스팅이 필요합니다.
		//System.out.println(s);
		ImageIcon n1 = new ImageIcon("images/" +s+".jpg"); 
		jl.setIcon(n1);		// 라벨에 setIcon 으로 이미지 아이콘을 교체합니다.

	}
	
	
}

public class Swing18 {

	public static void main(String[] args) {
		new JComboBoxTest();

	}

}
