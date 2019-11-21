package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import Model.OcrModel;
import Vue.JFileUploadVue;

public class JFileUploadControleur implements MouseListener{

	private JFileUploadVue vue;
	private OcrModel modele;
	
	//JFileUploadControleur Constructeur 
	public JFileUploadControleur(JFileUploadVue vue, OcrModel modele) {
		this.vue=vue;
		this.modele=modele;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String s=((JLabel) e.getSource()).getName();
		
		//Close frame
		if(s.compareTo("X")==0) {
			vue.dispose();
		}
		
		//Check 
		if(s.compareTo("Check")==0) {
			vue.getPath();
		}
		vue.dispose();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
