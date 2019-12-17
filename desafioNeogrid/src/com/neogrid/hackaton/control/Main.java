package com.neogrid.hackaton.control;

import java.io.File;

import com.neogrid.hackaton.model.Doca;

public class Main {
	
	public static void main(String[] args) {
		
		File testeBaseDir = new File("dados");
		for(File file : testeBaseDir.listFiles()) {
			Doca doca = readTestFolderAndCreateDoca(file);
			doca.carregaCaminhoes();
		}
	}

	private static Doca readTestFolderAndCreateDoca(File file) {
		Doca doca = null;
		for(File txtFile : file.listFiles()) {
			if(!txtFile.isDirectory()) {
				Reader reader = new Reader();
				doca = reader.readFileAndCreateDoca(file);
				
			}
		}
		return doca;
	}

}
