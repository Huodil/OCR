package Controller;

import java.awt.event.MouseEvent;

import Vue.FileLocationVue;
import Vue.FolderFilterVue;
import Model.OcrModel;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.*;

public class FolderFilterControleur implements MouseListener {
    
	FolderFilterVue vue;
	OcrModel modele;
	
	public FolderFilterControleur(FolderFilterVue vue,OcrModel modele) {
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
		

		if(s.compareTo("Check")==0) {
			FileLocationVue windowl=new FileLocationVue(modele);
			vue.setOutputPath();
			windowl.setTextField(modele.OutputPath);
			System.out.print(modele.OutputPath);
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
			vue.dispose();
		}
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
