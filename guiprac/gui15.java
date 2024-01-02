package guiprac;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.JComboBox;


public class gui15 extends JFrame implements ActionListener {
	JTextField t1, t2;
	JTextArea t3;
	gui15() {
		setTitle("원 넓이 구하기");
		setLayout(new BorderLayout(10, 10));
		showNorth();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 220);
		setVisible(true);
	}
	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextArea t3 = new JTextArea(5,20);
		t2.setEnabled(false);
		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		p3.add(t3);
		panel.add(p1);
		panel.add(p2);
		
		add(panel, BorderLayout.NORTH);
		add(p3, BorderLayout.CENTER);
		
		JButton cal = new JButton("계산");
		JButton re = new JButton("리셋");
		String[] color = {"red", "blue", "yellow"};
		JComboBox cb = new JComboBox(color);
		cal.addActionListener(this);
		re.addActionListener(this);
		p4.add(cal);
		p4.add(cb);
		p4.add(re);
		add(p4, BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		new gui15();

	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("계산")) {
            double r = Double.parseDouble(t1.getText());
            double result = r * r * 3.14;
            t3.append(String.format("%.2f * %.2f * 3.14 = %.2f%n", r, r, result));
            t2.setText(String.format("%.2f", result));
        } else if (e.getActionCommand().equals("리셋")) {
            t1.setText(" ");
            t2.setText(" ");
            t3.setText(" ");
        }
		
	}
}
 