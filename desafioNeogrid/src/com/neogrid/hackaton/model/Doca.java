package com.neogrid.hackaton.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.neogrid.hackaton.control.DespachaCaminhao;

public class Doca {

	private List<Caminhao> caminhoes;
	private List<Produto> produtos;
	private String filepath;
	private String docaPath;

	public void addCaminhao(Caminhao caminhao) {
		if (caminhoes == null) {
			caminhoes = new ArrayList<Caminhao>();
		}
		caminhoes.add(caminhao);
	}

	public void addProduto(Produto produto) {
		if (produtos == null) {
			produtos = new ArrayList<Produto>();
		}
		produtos.add(produto);
	}

	public List<Caminhao> getCaminhoes() {
		return caminhoes;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void carregaCaminhoes() {
		Iterator<Produto> it = produtos.iterator();
		for (Caminhao caminhao : getCaminhoes()) {
			DocaCaminhao.docar(this, caminhao);
			while (it.hasNext()) {
				Produto produto = it.next();
				boolean embarcouProduto = produto.visit(caminhao);
				if (embarcouProduto) {
					it.remove();
				}
			}
			despachaCaminhao(caminhao);
		}
	}

	private void despachaCaminhao(Caminhao caminhao) {
		DespachaCaminhao.despacha(this, caminhao);
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	public String getDocaPath() {
		return getFilepath()+"//docas";
	}

}
