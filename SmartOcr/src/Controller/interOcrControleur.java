package Controller;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

import Vue.FileLocationVue;
import Vue.JFileUploadVue;
import Vue.SelectLanguageVue;
import Vue.intOcrVue;
import Model.OcrModel;

public class interOcrControleur implements MouseListener{
	
	private intOcrVue vue;
	private OcrModel modele;
	
	//Constructeur interOcrControleur
	public interOcrControleur(intOcrVue vue, OcrModel modele) {
		this.vue=vue;
		this.modele=modele;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String s=((JLabel) arg0.getSource()).getName();

		 //Close frame
		if(s.compareTo("X")==0) {
			vue.CloseFrame();
		}
		
		//Minimise Frame
		if(s.compareTo("_")==0) {
			vue.MinimizeFrame();
		}
		
		//Upload file
		if(s.compareTo("upload")==0){
			JFileUploadVue jfu = new JFileUploadVue(modele);
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						JFileUploadVue jfu = new JFileUploadVue(modele);
						jfu.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}
		
		//Choose Language
		if(s.compareTo("lng")==0){
			SelectLanguageVue windowl=new SelectLanguageVue(modele);
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						windowl.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
				
		//Download file
		if(s.compareTo("download")==0){
			FileLocationVue windowl=new FileLocationVue(modele);
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						windowl.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String s=((JLabel) arg0.getSource()).getName();
		//Upload file
				if(s.compareTo("upload")==0){
					vue.SetStep("Step 1");
					vue.SetBounds(76, 312, 54, 26);
				}
				
				//Choose Language
				if(s.compareTo("lng")==0){
					vue.SetStep("Step 2");
					vue.SetBounds(289, 312, 56, 16);
				}
						
				//Download file
				if(s.compareTo("download")==0){
					vue.SetStep("Step 3");
					vue.SetBounds(493, 312, 56, 16);
				}
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String s=((JLabel) arg0.getSource()).getName();
		//Upload file
				if(s.compareTo("upload")==0){
					vue.SetStep("");
				}
				
				//Choose Language
				if(s.compareTo("lng")==0){
					vue.SetStep("");
				}
						
				//Download file
				if(s.compareTo("download")==0){
					vue.SetStep("");
				}
		
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
