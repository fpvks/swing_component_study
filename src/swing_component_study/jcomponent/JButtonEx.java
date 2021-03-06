package swing_component_study.jcomponent;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JButtonEx extends JFrame {

	private JPanel contentPane;

	public JButtonEx() {
		initComponents();
	}
	private void initComponents() {
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton = new JButton("call~~~");
		String imagePath = System.getProperty("user.dir") + "\\images\\";
		btnNewButton.setIcon(new ImageIcon(imagePath + "normalIcon.gif"));
		btnNewButton.setRolloverIcon(new ImageIcon(imagePath + "rolloverIcon.gif"));
		btnNewButton.setPressedIcon(new ImageIcon(imagePath + "pressedIcon.gif"));
		contentPane.add(btnNewButton);
	}

}
