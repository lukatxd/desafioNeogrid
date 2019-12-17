package com.neogrid.hackaton.tiposArquivo;

import java.io.File;

import com.neogrid.hackaton.model.Doca;

public enum TipoArquivo {
	CAMINHAO("cami", new CaminhaoReader()), PRODUTO("prod", new ProdutoReader());
	
	String value;
	AbstractReader reader;
	TipoArquivo(String value, AbstractReader reader){
		this.value = value;
		this.reader = reader;
	}
	
	public static TipoArquivo getTipo(File fileEntry) {
		String prefix = fileEntry.getName().substring(0,3);
		return TipoArquivo.valueOf(prefix.toLowerCase());
	}
	
	public Object parse(File fileEntry) {
		return reader.parse(fileEntry);
	}
	
	public void addToDoca(Object obj, Doca doca) {
		reader.addToDoca(obj, doca);
	}
}
