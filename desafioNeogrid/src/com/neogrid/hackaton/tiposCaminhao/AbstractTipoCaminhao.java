package com.neogrid.hackaton.tiposCaminhao;

import java.util.ArrayList;
import java.util.List;

import com.neogrid.hackaton.model.Caminhao;
import com.neogrid.hackaton.model.Produto;
import com.neogrid.hackaton.tiposProduto.TipoProduto;

public abstract class AbstractTipoCaminhao {

	List<TipoProduto> tiposProdutoAceitos;
	
	AbstractTipoCaminhao(){
		tiposProdutoAceitos = new ArrayList<>();
	}
	
	boolean aceitaProduto(Produto produto) {
		return tiposProdutoAceitos.contains(produto.getTipoProduto());
	}
	
	abstract boolean aceitaCarga();
	abstract void executeStrategy(Caminhao caminhao, Produto produto);
	
}
