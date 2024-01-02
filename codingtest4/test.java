package codingtest4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class test extends JFrame {
    private JTextField textField;

    public test() {
        setTitle("키패드");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setBackground(Color.WHITE); 
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                textField.setBackground(Color.YELLOW);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                textField.setBackground(Color.WHITE);
            }
        });

        String[] buttonLabels = {
                "1", "2", "3",
        };
        String[] buttonLabels2 = {
        		"4", "5", "6"
        };
        String[] buttonLabels3 = {
        		"7", "8", "9"
        };
        String[] buttonLabels4 = {
        		"0", ".", "CE"
        };


        JPanel buttonPanel = new JPanel();
        JPanel buttonPanel2 = new JPanel();
        JPanel buttonPanel3 = new JPanel();
        JPanel buttonPanel4 = new JPanel();

        for (String label : buttonLabels) {
            JButton button1 = new JButton(label);
            button1.addActionListener(new ButtonClickListener());
            buttonPanel.add(button1);
        }
        for (String label : buttonLabels2) {
            JButton button2 = new JButton(label);
            button2.addActionListener(new ButtonClickListener());
            buttonPanel2.add(button2);
        }
        for (String label : buttonLabels3) {
            JButton button3 = new JButton(label);
            button3.addActionListener(new ButtonClickListener());
            buttonPanel3.add(button3);
        }
        for (String label : buttonLabels4) {
            JButton button4 = new JButton(label);
            button4.addActionListener(new ButtonClickListener());
            buttonPanel4.add(button4);
        }

        setLayout(new GridLayout(5, 1));
        add(textField);
        add(buttonPanel);
        add(buttonPanel2);
        add(buttonPanel3);
        add(buttonPanel4);

        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton sourceButton = (JButton) e.getSource();
            String buttonText = sourceButton.getText();

            if (buttonText.equals("CE")) {
                textField.setText("");
            } else {
                textField.setText(textField.getText() + buttonText);
            }
        }
    }
    
    //private class MouseOver implements ActionListner {
    	
    //}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new test());
    }
}
