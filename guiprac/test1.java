package guiprac;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test1 extends JFrame {
	test1() {
		setTitle("test1");
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("테스트1");
		JButton b = new JButton("버튼");
		p.add(l);
		p.add(b);
		add(p);
		
		
	}
	public static void main(String[] args) {
		

	}

}
