package com.neogrid.hackaton.model;

public interface CaminhaoVisitable {
	
	public boolean accept(ProdutoVisitor visitor);

	public boolean aceitaCarga();

	public boolean podeAceitarProduto(Produto produto);

	public String getDestino();

	public Double getCapacidade();
}
