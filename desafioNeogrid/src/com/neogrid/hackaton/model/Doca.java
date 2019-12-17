package com.neogrid.hackaton.model;

import java.util.ArrayList;
import java.util.List;

import com.neogrid.hackaton.control.DespachaCaminhao;

public class Doca {

	private List<Caminhao> caminhoes;
	private List<Produto> produtos;

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
		for (Caminhao caminhao : getCaminhoes()) {
			DocaCaminhao.docar(caminhao);
			for (Produto produto : getProdutos()) {
				boolean embarcouProduto = produto.visit(caminhao);
				if(embarcouProduto) {
					getProdutos().remove(produto);
				}
			}
			despachaCaminhao(caminhao);
		}
	}

	private void despachaCaminhao(Caminhao caminhao) {
		DespachaCaminhao.despacha(caminhao);
	}

}
