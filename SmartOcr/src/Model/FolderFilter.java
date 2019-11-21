package Model;

import java.io.File;

public class FolderFilter extends javax.swing.filechooser.FileFilter {
	@Override
	public boolean accept(File file) {
		return file.isDirectory();
	}

	@Override
	public String getDescription() {
		return "We only take directories";
	}

}