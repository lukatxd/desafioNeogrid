package com.neogrid.hackaton.tiposArquivo;

import java.io.File;

import com.neogrid.hackaton.model.Doca;
import com.neogrid.hackaton.model.Produto;

public class ProdutoReader extends AbstractReader {

	@Override
	public Object parse(File fileEntry) {
		Produto produto = new Produto();

		return produto;
	}

	@Override
	void addToDoca(Object obj, Doca doca) {
		Produto produto = (Produto) obj;
		doca.addProduto(produto);
	}
}
