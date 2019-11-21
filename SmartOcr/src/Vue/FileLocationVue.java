package Vue;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import Model.OcrModel;
import Controller.FileLocationControleur;

public class FileLocationVue extends JDialog{

	private final JPanel contentPanel = new JPanel();
	private JTextField txt_location;
	private JFileChooser jFC = new JFileChooser();
	JLabel lblX = new JLabel("X");
	JTextArea txtrEnterNameFile = new JTextArea();
	JLabel lblNewLabel = new JLabel("");
	JLabel lbl_logo = new JLabel("");
	JLabel lbl_check = new JLabel("");
	JLabel lbl_folder = new JLabel("");
	FileLocationControleur controleur;
	OcrModel modele;
	
	public FileLocationVue(OcrModel modele) {
		
		this.modele=modele;
		controleur=new FileLocationControleur(this,modele);
		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		
		//Label X
		lblX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));		
		lblX.setBounds(426, 0, 24, 26);
		contentPanel.add(lblX);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPanel.add(lblX);
		lblX.setName("X");
	
        //Folder Location TextField
		txt_location = new JTextField();
		txt_location.setName("location");
		txt_location.setDisabledTextColor(Color.DARK_GRAY);
		txt_location.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_location.setBorder(null);
		txt_location.setBounds(89, 106, 213, 26);
		contentPanel.add(txt_location);
		txt_location.setColumns(10);

		//Download File Label
				JLabel lbl_down = new JLabel("");
				lbl_down.setName("download");
				lbl_down.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/DownloadFile/pencil.png")));
				lbl_down.setBounds(323, 158, 58, 32);
				contentPanel.add(lbl_down);
				
		//Choose File Label
		lbl_folder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_folder.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/DownloadFile/Dwn.png")));
		lbl_folder.setBounds(323, 100, 48, 32);
		contentPanel.add(lbl_folder);
		lbl_folder.setName("folder");
		lbl_folder.addMouseListener(controleur);
		
		//Name TextArea
		txtrEnterNameFile.setSelectedTextColor(new Color(153, 153, 153));
		txtrEnterNameFile.setBounds(89, 164, 213, 26);
		contentPanel.add(txtrEnterNameFile);
		txtrEnterNameFile.setName("name");
		
		//Check Label
		lbl_check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lbl_check.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/checked.png")));
		lbl_check.setBounds(392, 231, 48, 42);
		contentPanel.add(lbl_check);
        lbl_check.setName("check");
        lbl_check.addMouseListener(controleur);
        
		//Logo Label
		lbl_logo.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/lgR.png")));
		lbl_logo.setBounds(22, 11, 158, 42);
		contentPanel.add(lbl_logo);

		//Background Label
		lblNewLabel.setForeground(new Color(153, 153, 153));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Img/background.png")));
		lblNewLabel.setBounds(0, 0, 450, 300);
		contentPanel.add(lblNewLabel);
	}

	public void CloseFrame() {
		dispose();
	}
	
	public String NameF() {
		return txtrEnterNameFile.getText();
	}

	public void setTextField(String string) {
		this.txt_location.setText(string);
	}
}


