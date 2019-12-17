package com.neogrid.hackaton.model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DocaCaminhao {

	public static void docar(Doca doca, Caminhao caminhao) {
		try {
			Files.move(Paths.get(caminhao.getFilepath()),Paths.get(doca.getFilepath()+"//doca"));
		} catch (IOException e) {
			System.out.println("Nao foi possivel mover o caminhao:" + caminhao.getFilepath() + " para as docas.");
		}
	}

}
