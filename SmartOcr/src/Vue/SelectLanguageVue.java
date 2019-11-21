package Vue;

import java.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Controller.SelectLanguageControleur;
import Model.OcrModel;

public class SelectLanguageVue extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	JLabel lblX = new JLabel("X");
	JComboBox cmb_langue = new JComboBox();
	JLabel lbl_Check = new JLabel("");
	JLabel lbl_logo = new JLabel("");
	JLabel lbl_img = new JLabel("");
	JLabel lblNewLabel = new JLabel("");
	SelectLanguageControleur controleur;
	OcrModel modele;

	public SelectLanguageVue(OcrModel modele) {
		this.modele=modele;
		controleur=new SelectLanguageControleur(this,modele);
		setUndecorated(true);
		setBounds(100, 100, 450, 163);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 450, 162);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);

		//X Label
			lblX.setName("X");
			lblX.setBounds(426, 0, 24, 26);
			contentPanel.add(lblX);
			lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		    lblX.addMouseListener(controleur);
		
        //Image Label 
		lbl_img.setName("lbl_name");
		lbl_img.setBounds(106, 63, 32, 26);
		lbl_img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/SelectLang/fra.png")));
		contentPanel.add(lbl_img);

		//Langue Combobox
		cmb_langue.setName("cmb_langue");
		cmb_langue.setBounds(148, 63, 223, 26);
		cmb_langue.setFont(new Font("Arial", Font.BOLD, 12));
		cmb_langue.setForeground(new Color(51, 51, 51));
		cmb_langue.setBackground(new Color(255, 255, 255));
		cmb_langue.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmb_langue.setModel(new DefaultComboBoxModel(new String[] { "French", "English", "Arabic" }));
		contentPanel.add(cmb_langue);
		cmb_langue.addActionListener(controleur);

		//Check Label
		lbl_Check.setName("Check");
		lbl_Check.setBounds(386, 109, 38, 42);
		lbl_Check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_Check.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/checked.png")));
		contentPanel.add(lbl_Check);
		lbl_Check.addMouseListener(controleur);

		//Logo Label
		lbl_logo.setBounds(21, 11, 144, 41);
		lbl_logo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lgR.png")));
		contentPanel.add(lbl_logo);
		
	    
		lblNewLabel.setBounds(0, 0, 450, 162);
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
		contentPanel.add(lblNewLabel);
		
	}
	public void CloseFrame() {
		System.exit(0);
	}

	public void setImage(String path) {
		lbl_img.setIcon(new ImageIcon(getClass().getClassLoader().getResource(path)));
	}
}
