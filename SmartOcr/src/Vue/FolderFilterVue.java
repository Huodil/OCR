package Vue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.FolderFilterControleur;
import Model.OcrModel;

import java.awt.*;


public class FolderFilterVue extends JFrame {
 
	public JFrame frame;
	private JPanel contentPane;
	FolderFilterControleur controleur;
    OcrModel modele;
    JFileChooser fileChooser = new JFileChooser(".");
	JPanel panel = new JPanel();
	JLabel label_1 = new JLabel("");
	JLabel lblX = new JLabel("X");
	JLabel label = new JLabel("");
	JLabel lblNewLabel = new JLabel("");
	public FolderFilterVue(OcrModel modele) {
		
	this.modele=modele;
	controleur=new FolderFilterControleur(this,modele);
	
     
		setUndecorated(true);
		setBackground(Color.RED);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(0, 0, 669, 526);
		contentPane.add(panel);
		panel.setLayout(null);
		setLocationRelativeTo(null);

		//Check Label
		label_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label_1.setBounds(565, 449, 48, 37);
		label_1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/checked.png")));
		panel.add(label_1);
		label_1.setName("Check");
		label_1.addMouseListener(controleur);
        
	    //FileChooser
		fileChooser.setBounds(48, 73, 565, 338);
		panel.add(fileChooser);
		fileChooser.setToolTipText("");
		fileChooser.setName("File");
		fileChooser.setControlButtonsAreShown(false);
		fileChooser.setBorder(null);
		fileChooser.setBackground(Color.RED);
		fileChooser.setFileFilter(new Model.FolderFilter());
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

		//X Label
		lblX.setBounds(635, 11, 24, 26);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel.add(lblX);
		lblX.setName("X");
		lblX.addMouseListener(controleur);
		

		//Logo Label
		label.setBounds(10, 11, 166, 51);
		label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lgR.png")));
		panel.add(label);

		//Background Label
		lblNewLabel.setBounds(0, 0, 669, 526);
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
		panel.add(lblNewLabel);
	}
	public void CloseFrame() {
		dispose();
	}
	public void setOutputPath() {
		modele.OutputPath= fileChooser.getSelectedFile().getAbsolutePath();
	}
}
