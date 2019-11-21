package Controller;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import Vue.FileLocationVue;
import Vue.FolderFilterVue;
import Vue.JFileUploadVue;
import Vue.MessageVue;
import Model.FolderFilter;
import Model.OcrModel;

public class FileLocationControleur implements MouseListener {

	private FileLocationVue vue;
	private OcrModel modele;
	private Thread t1;
	private JLabel lbl;
	/**
	 * @wbp.parser.entryPoint
	 */
	public FileLocationControleur(FileLocationVue vue,OcrModel modele) {
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
		
		//Choose Folder
		if(s.compareTo("folder")==0) {
			FolderFilterVue jfu = new FolderFilterVue(modele);
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						FolderFilterVue jfu = new FolderFilterVue(modele);
						jfu.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			vue.dispose();
		}
		
		//Download File
		if(s.compareTo("check")==0) {
			vue.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
	        MessageVue message=new MessageVue();
			OcrModel.FileName = vue.NameF();
			modele.Ocr();
			EventQueue.invokeLater(new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						message.setVisible(true);
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
