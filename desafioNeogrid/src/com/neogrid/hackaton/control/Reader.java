package com.neogrid.hackaton.control;

import java.io.File;

import com.neogrid.hackaton.model.Doca;

public class Reader {

	public Doca readFileAndCreateDoca(final File file) {

		Doca doca = new Doca();
		for (final File fileEntry : file.listFiles()) {
			try {
				TipoArquivo tipoArq = TipoArquivo.getTipo(fileEntry);
				Object obj = tipoArq.parse(fileEntry);
				tipoArq.addToDoca(obj, doca);
			} catch (Exception e) {
				continue;
			}
		}

		return doca;
	}
}