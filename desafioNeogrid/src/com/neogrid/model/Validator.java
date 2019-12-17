package com.neogrid.model;

public class Validator {

	public static boolean validaCarga(Caminhao caminhao, Produto produto) {
		return caminhao.aceitaCarga() && caminhao.podeAceitarProduto(produto)
		&& caminhao.getDestino().equals(produto.getDestino()) && caminhao.getCapacidade() > produto.getPeso();
	}

}
