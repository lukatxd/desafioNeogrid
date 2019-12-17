package com.neogrid.hackaton.model;

import com.neogrid.hackaton.tiposProduto.TipoProduto;

public class Produto implements ProdutoVisitor {
	private TipoProduto tipoProduto;
	private Double peso;
	private String destino;
	private String filePath;

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	@Override
	public void visit(CaminhaoVisitable caminhao) {
		if (Validator.validaCarga((Caminhao) caminhao, this)) {
			caminhao.accept(this);
		}
	}

}
