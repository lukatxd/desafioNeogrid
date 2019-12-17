package com.neogrid.hackaton.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption; 

public class Reader {

	public static void main(String[] args) {
		final File file = new File("C:\\Neogrid\\hackaton\\teste1");
		Reader reader = new Reader();
		reader.readFile(file);
	}
	
	public void readFile(final File file) {
		
		CaminhaoReader caminhaoReader = new CaminhaoReader();
		ProdutoReader produtoReader = new ProdutoReader();
		
	    for (final File fileEntry : file.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            readFile(fileEntry);
	        } else {
	        	if(fileEntry.getName().startsWith("caminhao")) {
	        		caminhaoReader.read(fileEntry);
	        	} else if(fileEntry.getName().startsWith("produto")) {
	        		produtoReader.read(fileEntry);
	        	}
	        }
	        
	    }
	}
	
}