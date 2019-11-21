 package Vue;

import javax.swing.*;

import Controller.interOcrControleur;
import Model.OcrModel;

import java.awt.*;

public class intOcrVue extends JFrame{
	
	
	public JFrame frame;
	JLabel lblX = new JLabel("X");
	JLabel lbl_Step = new JLabel();
	JLabel lbl_upload = new JLabel("");
	JLabel lbl_lng = new JLabel("");
	JLabel lbl_min = new JLabel("_");
	JLabel lbl_down = new JLabel("");
	JLabel lbl_OCR = new JLabel("What is OCR ?\r\n\r\n");
	JLabel lbl_OCR1 = new JLabel("OCR (Optical Character Recognition)");
	JLabel lblOCR2 = new JLabel("is a technology\r\nthat extracts the text from ");
	JLabel lbl_OCR3 = new JLabel("an image");
	JLabel lbl_what = new JLabel("");
	JLabel lbl_Features = new JLabel("Features");
	JLabel lbl_Features1 = new JLabel("Precise image to text conversion ");
	JLabel lbl_Features2 = new JLabel("keeps  the  layout and formatting ");
	JLabel lbl_Features3 = new JLabel("Supports JPEG , PNG , JPG");
	JLabel label_star = new JLabel("");
	JLabel lbl_Logo = new JLabel("");
	JLabel lbl_back = new JLabel("");
    JLabel lbl_ContactUs = new JLabel("Contact us ");
	JLabel lbl_mail = new JLabel("");
    OcrModel modele;
    interOcrControleur controleur;


	
	public intOcrVue(OcrModel modele) {
		this.modele=modele;
		controleur=new interOcrControleur(this,modele);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Img/Logo.png")));
		frame.getContentPane().setBackground(Color.WHITE);
		lbl_Step.setName("step");
		frame.getContentPane().add(lbl_Step);

		//X Label
		lblX.setBounds(646, 0, 24, 26);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().setLayout(null);
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(lblX);
		lblX.setName("X");
		lblX.addMouseListener(controleur);
		
		//Minimise Label
		lbl_min.setBounds(620, 0, 16, 19);
		lbl_min.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_min.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbl_min.setName("_");
		frame.getContentPane().add(lbl_min);
		lbl_min.addMouseListener(controleur);

		//Logo Label 
		lbl_Logo.setBounds(22, 27, 494, 112);
		lbl_Logo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lg.png")));
		frame.getContentPane().add(lbl_Logo);
		
		//Upload Label
		lbl_upload.setBounds(38, 178, 160, 121);
		lbl_upload.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_upload.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/add.png")));
		lbl_upload.setName("upload");
		frame.getContentPane().add(lbl_upload);
		lbl_upload.addMouseListener(controleur);

		//Language Label
		lbl_lng.setBounds(249, 178, 160, 121);
		lbl_lng.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_lng.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/website.png")));
		lbl_lng.setName("lng");
		frame.getContentPane().add(lbl_lng);
		lbl_lng.addMouseListener(controleur);
		
		//Download Label
		lbl_down.setBounds(459, 178, 128, 121);
		lbl_down.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_down.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/downloadA.png")));
		lbl_down.setName("download");
		frame.getContentPane().add(lbl_down);
		lbl_down.addMouseListener(controleur);

		//What is OCR ? 
		lbl_OCR.setBounds(247, 376, 138, 26);
		lbl_OCR.setForeground(new Color(51, 51, 51));
		lbl_OCR.setFont(new Font("Arial", Font.BOLD, 19));
		frame.getContentPane().add(lbl_OCR);
		lbl_OCR1.setBounds(216, 415, 216, 20);
		frame.getContentPane().add(lbl_OCR1);
		lblOCR2.setBounds(216, 426, 242, 31);
		frame.getContentPane().add(lblOCR2);
		lbl_OCR3.setBounds(216, 448, 241, 20);
		frame.getContentPane().add(lbl_OCR3);
		lbl_what.setBounds(216, 363, 41, 56);
		lbl_what.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/info.png")));
		frame.getContentPane().add(lbl_what);
		
		//Features Label
		lbl_Features.setBounds(43, 376, 96, 26);
		lbl_Features.setForeground(new Color(51, 51, 51));
		lbl_Features.setBackground(new Color(102, 102, 102));
		lbl_Features.setFont(new Font("Arial", Font.BOLD, 19));
		frame.getContentPane().add(lbl_Features);
		lbl_Features1.setBounds(17, 416, 290, 14);
		frame.getContentPane().add(lbl_Features1);
		lbl_Features2.setBounds(17, 435, 212, 14);
		frame.getContentPane().add(lbl_Features2);
		lbl_Features3.setBounds(17, 451, 171, 14);
		frame.getContentPane().add(lbl_Features3);
		label_star.setBounds(17, 376, 24, 26);
		label_star.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/star.png")));
		frame.getContentPane().add(label_star);

		//Contact Us 
		lbl_ContactUs.setBounds(517, 376, 118, 27);
		lbl_ContactUs.setFont(new Font("Arial", Font.BOLD, 19));
		frame.getContentPane().add(lbl_ContactUs);
		lbl_mail.setBounds(482, 376, 67, 37);
		lbl_mail.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/Interface/mail.png")));
		frame.getContentPane().add(lbl_mail);

		//Background Label
		lbl_back.setBounds(0, 0, 664, 535);
		lbl_back.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_back.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
		frame.getContentPane().add(lbl_back);


		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 664, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}
    public void SetStep(String step) {
    	lbl_Step.setText(step);
    }
	public void SetBounds(int x,int y, int width, int height ) {
		lbl_Step.setBounds(x, y, width, height);
	}
	public void MinimizeFrame() {
		frame.setState(frame.ICONIFIED);
	}
	
	public void CloseFrame() {
		System.exit(0);
	}
}



