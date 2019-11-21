package Vue;

import java.awt.*;
import javax.swing.*;

import Controller.AccueilControlleur;
import Model.OcrModel;

public class AccueilVue extends JFrame {
		
		public JFrame frame;
		JLabel Label_back1 = new JLabel("");
		JLabel lblGo = new JLabel("");
		JLabel label_back = new JLabel("");
		JLabel Label_logo = new JLabel("");
		JLabel lblX = new JLabel("X");
		JLabel label_gif = new JLabel("");
		JLabel label_min = new JLabel("_");
		AccueilControlleur controleur;
		OcrModel modele;
		public AccueilVue(OcrModel modele) {
			
			this.modele=modele;        
	        controleur=new  AccueilControlleur(this,modele);
			initialize();
		}
		public void initialize() {
			frame = new JFrame();
			frame.setUndecorated(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Img/Logo.png")));
			frame.setBounds(100, 100, 670, 520);
			frame.setLocationRelativeTo(null);
			frame.getContentPane().setBackground(new Color(255, 255, 255));
			frame.getContentPane().setLayout(null);
			
			//Logo Label			
			Label_logo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lg.png")));
			Label_logo.setBounds(30, 7, 442, 118);
			frame.getContentPane().add(Label_logo);
			
			
			//Go Label			
			lblGo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblGo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Acc/go.png")));
			lblGo.setBounds(532, 411, 100, 52);
			lblGo.setName("go");
			frame.getContentPane().add(lblGo);
			lblGo.addMouseListener(controleur);
			
			//Minimise Label			
			label_min.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			label_min.setFont(new Font("Tahoma", Font.BOLD, 15));
			label_min.setBounds(620, 0, 16, 19);
			label_min.setName("_");
			frame.getContentPane().add(label_min);
			label_min.addMouseListener(controleur);
			
			//Gif Label			
			label_gif.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Acc/OCR_.gif")));
			label_gif.setBounds(110, 136, 467, 232);
			frame.getContentPane().add(label_gif);
			
			//X Label
			lblX.setForeground(new Color(51, 51, 51));
			lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblX.setBounds(646, 0, 24, 26);
			lblX.setName("X");
			frame.getContentPane().add(lblX);
			lblX.addMouseListener(controleur);
			
			//Background Label			
			label_back.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
			label_back.setBounds(0, 0, 670, 520);			
			frame.getContentPane().add(label_back);
			
		}
		
		public void MinimizeFrame() {
			frame.setState(frame.ICONIFIED);
		}
		
		public void CloseFrame() {
			System.exit(0);
		}

	}


