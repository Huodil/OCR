package Controller;

import java.awt.EventQueue;
import java.awt.Frame;
import  java.awt.event.*;
import  javax.swing.*;
import Model.OcrModel;
import Vue.AccueilVue;
import Vue.intOcrVue;

public class AccueilControlleur implements MouseListener{
 
	private AccueilVue vue;
	private OcrModel modele;
	
	//Constructeur de AccueilControlleur
	public AccueilControlleur(AccueilVue vue,OcrModel modele) {
		this.vue=vue;
		this.modele=modele;
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		String s= ((JLabel) arg0.getSource()).getName();
		
	    //Close frame
		if(s.compareTo("X")==0) {
			vue.CloseFrame();
		}
		
		//Minimise Frame
		if(s.compareTo("_")==0) {
			vue.MinimizeFrame();
		}
		
		//Open interOcr
		if(s.compareTo("go")==0){
			intOcrVue window = new intOcrVue(modele);
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						intOcrVue window = new intOcrVue(modele);
						window.frame.setVisible(true);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			vue.frame.dispose();
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
