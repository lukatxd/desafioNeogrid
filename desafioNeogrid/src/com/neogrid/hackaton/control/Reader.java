package com.neogrid.hackaton.control;

import java.io.File;

import com.neogrid.hackaton.model.Doca;

public class Reader {

	public Doca readFileAndCreateDoca(final File file) {

		CaminhaoReader caminhaoReader = new CaminhaoReader();
		ProdutoReader produtoReader = new ProdutoReader();
		Doca doca = new Doca();

		for (final File fileEntry : file.listFiles()) {
			if (fileEntry.getName().startsWith("caminhao")) {
				doca.addCaminhao(caminhaoReader.read(fileEntry));
			} else if (fileEntry.getName().startsWith("produto")) {
				doca.addProduto(produtoReader.read(fileEntry));
			}
		}

		return doca;
	}
}