package Vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.JFileUploadControleur;
import Model.OcrModel;

public class JFileUploadVue extends JFrame{
	
	private JPanel contentPane;
	JPanel panel = new JPanel();
	JFileChooser JFc =new JFileChooser();
	JLabel lbl_Logo = new JLabel("");
    JLabel lblX = new JLabel("X");
    JLabel lbl_Check = new JLabel("");
    public JFrame frame;
    OcrModel modele;
    JFileUploadControleur controleur;
    
	 public JFileUploadVue(OcrModel modele) {
		    
		    this.modele=modele;
		    controleur=new JFileUploadControleur(this,modele);
		    initialize();
		}
	 public void initialize() {
		    setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Img/Logo.png")));
			setUndecorated(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(0, 0, 532, 373);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			setLocationRelativeTo(null);
			panel.setBounds(0, 0, 532, 373);
			contentPane.add(panel);
			panel.setLayout(null);
			
			 //File Chooser
			 JFc.setControlButtonsAreShown(false);
			 JFc.setBorder(null);
			 JFc.setBounds(40, 60, 449, 257);
			 
			 //Filtre des images
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", new String[] {"JPG", "JPEG", "PNG"});
			JFc.addChoosableFileFilter(filter);
		    JFc.setAcceptAllFileFilterUsed(false);
         panel.add(JFc);
	            
	        //Logo Label
	        lbl_Logo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lgR.png")));
	        lbl_Logo.setBounds(10, 11, 166, 51);
	        panel.add(lbl_Logo);
	        
	        //X Label
	        lblX.setBounds(498, 11, 24, 26);
	        lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
	        panel.add(lblX);
	        lblX.setName("X");
	        lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	        lblX.addMouseListener(controleur);
	        
	        //Check Label
         lbl_Check.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/checked.png")));
         lbl_Check.setBounds(464, 332, 48, 37);
         lbl_Check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         lbl_Check.setName("Check");
         panel.add(lbl_Check);
         lbl_Check.addMouseListener(controleur);
         
         JLabel label = new JLabel("");
         label.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
         label.setBounds(0, -15, 566, 384);
         panel.add(label);	        
	 }
		
		public void CloseFrame() {
			System.exit(0);
		}

		public void getPath() {
			modele.InputPath= JFc.getSelectedFile().getAbsolutePath();
		}
}
