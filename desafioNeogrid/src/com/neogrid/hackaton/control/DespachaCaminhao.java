package com.neogrid.hackaton.control;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.neogrid.hackaton.model.Caminhao;
import com.neogrid.hackaton.model.Doca;

public class DespachaCaminhao {

	public static void despacha(Doca doca, Caminhao caminhao) {
		File caminhaoFile = new File(caminhao.getFilepath());
		String caminhaoName = caminhaoFile.getName();
		
		Path currentCaminhaoPath = Paths.get(doca.getDocaPath()+"//"+caminhaoName);
		Path despachadoPath = Paths.get(doca.getFilepath()+"//veiculo_saida//" + caminhaoName);
		try {
			Files.move(currentCaminhaoPath, despachadoPath);
		} catch (IOException e) {
		}
	}

}
