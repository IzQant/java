package guiprac;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Swingprac extends JFrame {
	Swingprac() {
		setTitle("안녕, 스윙!");
		
		JButton b = new JButton("버튼");
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Swingprac();
	}
}
