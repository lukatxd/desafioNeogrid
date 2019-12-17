package com.neogrid.hackaton.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.neogrid.hackaton.model.Caminhao;
import com.neogrid.hackaton.model.Doca;

public class CaminhaoReader extends AbstractReader {

	@Override
	public Object parse(File fileEntry) {
		Caminhao caminhao = new Caminhao();

		try {
			FileReader fr = new FileReader(fileEntry.toString());
			BufferedReader br = new BufferedReader(fr);

			for (String line = br.readLine(); line != null; line = br.readLine()) {
				br.close();

				File docas = new File("C:\\Neogrid\\hackaton\\teste1\\docas\\" + fileEntry.getName());
				Path currentPath = Paths.get("C:\\Neogrid\\hackaton\\teste1\\" + fileEntry.getName());
				Files.move(currentPath, docas.toPath());
			}

		} catch (FileNotFoundException f) {

		} catch (IOException e) {

		}

		return caminhao;
	}

	@Override
	void addToDoca(Object obj, Doca doca) {
		Caminhao caminhao = (Caminhao) obj;
		doca.addCaminhao(caminhao);
	}
}
