package Vue;

import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;

import Model.OcrModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MessageVue extends JDialog {
	JLabel Label_Msg = new JLabel();
    JLabel labl_wait = new JLabel();
	public MessageVue() {
		
		setUndecorated(true);
		setLocationByPlatform(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Img/Logo.png")));
		setBounds(100, 100, 370, 222);
		getContentPane().setLayout(null);
		Label_Msg.setBounds(72, 93, 251, 37);
		Label_Msg.setFont(new Font("Arial", Font.BOLD, 14));
		Label_Msg.setText("File generated successfully");
		getContentPane().add(Label_Msg);
		Label_Msg.setBorder(null);
		
		Label_Msg.setForeground(new Color(51,153,153));
		labl_wait.setBounds(0, 225, 371, -225);
		
		getContentPane().add(labl_wait);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 11, 150, 47);
		getContentPane().add(label_1);
		label_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lgR.png")));
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(349, 11, 74, 22);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().add(lblX);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 371, 222);
		getContentPane().add(label);
		label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
		setLocationRelativeTo(null);
	}
	
}
