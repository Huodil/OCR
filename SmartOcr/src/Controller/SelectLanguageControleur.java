package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import Model.OcrModel;
import Vue.SelectLanguageVue;

public class SelectLanguageControleur implements ActionListener, MouseListener{
     
	private SelectLanguageVue vue;
	private OcrModel modele;
	
	public SelectLanguageControleur(SelectLanguageVue vue, OcrModel modele) {
		this.vue=vue;
		this.modele=modele;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String s=((JComboBox) arg0.getSource()).getSelectedItem().toString();
		
		//French
		if(s.equals("French")) {
			vue.setImage("Img/SelectLang/fra.png");
			modele.Language="fr/fra";
		}
		
		//English
		if(s.equals("English")) {
			vue.setImage("Img/SelectLang/eng.png");	
			modele.Language="en/eng";
		}
		
		//Arab		
		if(s.equals("Arabic")) {
			vue.setImage("Img/SelectLang/ar.png");	
			modele.Language="ar/ara";
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String s=((JLabel) arg0.getSource()).getName();
		//Close
				if(s.compareTo("Check")==0 ||s.compareTo("X")==0 ){
					vue.dispose();
				}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
