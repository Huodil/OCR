package Model;

import java.awt.EventQueue;

import Vue.AccueilVue;
import Vue.MessageVue;

public class Main {
	
	public static void main(String[] args) {
		OcrModel modele=new OcrModel();
		AccueilVue vue=new AccueilVue(modele);
	    vue.frame.setVisible(true);
		/*MessageVue windowl=new MessageVue();
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
		}); */
		
	}

}
