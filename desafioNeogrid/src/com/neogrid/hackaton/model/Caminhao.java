package com.neogrid.hackaton.model;

import java.util.List;

import com.neogrid.hackaton.tiposCaminhao.TipoCaminhao;

public class Caminhao implements CaminhaoVisitable {
	private TipoCaminhao tipoCaminhao;
	private Double capacidade;
	private String destino;
	
	private List<Produto> produtosCarregados;

	public TipoCaminhao getTipoCaminhao() {
		return tipoCaminhao;
	}

	public void setTipoCaminhao(TipoCaminhao tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}

	public boolean aceitaCarga() {
		return this.getTipoCaminhao().aceitaCarga();
	}

	public Double getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(Double capacidade) {
		this.capacidade = capacidade;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public List<Produto> getProdutosCarregados() {
		return produtosCarregados;
	}

	public void setProdutosCarregados(List<Produto> produtosCarregados) {
		this.produtosCarregados = produtosCarregados;
	}

	@Override
	public boolean podeAceitarProduto(Produto produto) {
		return getTipoCaminhao().aceitaProduto(produto);
	}

	@Override
	public void accept(ProdutoVisitor visitor) {
		final Produto produto = (Produto) visitor;
		carregaProduto(produto);
		despachaCaminhao();
	}

	private void despachaCaminhao() {
		
	}

	private void carregaProduto(Produto produto) {
		getProdutosCarregados().add(produto);
		setCapacidade(getCapacidade() - produto.getPeso());		
	}

}
