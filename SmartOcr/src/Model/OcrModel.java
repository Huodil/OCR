package Model;

import java.awt.EventQueue;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JLabel;

import Vue.*;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;


public class OcrModel  {
	
	public static String InputPath="";
	public static String Language="fr/fra";
	public static String OutputPath="";
	public static String FileName="";
	
	//OCR Traitement
	public void Ocr() {
		
		ITesseract instance = new Tesseract();
		instance.setDatapath("../Tess4J/tessdata");
		ImageResizer im=new ImageResizer();
		File inputFile= new File(InputPath);
		File outputFile=new File("image2.png");
		instance.setLanguage(Language);
		try {
			outputFile=im.resize(inputFile,outputFile);
			String resultt = instance.doOCR(outputFile);
			FileWriter file=new FileWriter(OutputPath+"\\"+FileName+".txt");
			file.write(resultt);    		
            file.close();
		} catch (IOException | TesseractException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


}
