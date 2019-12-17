package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.hackaton.model.Caminhao;
import com.neogrid.hackaton.model.Produto;
import com.neogrid.hackaton.tiposProduto.TipoProduto;

public class CaminhaoGeral extends AbstractTipoCaminhao {

	public static final CaminhaoGeral INSTANCE = new CaminhaoGeral();

	CaminhaoGeral(){
		super();
		tiposProdutoAceitos.add(TipoProduto.ALIMENTOS);
		tiposProdutoAceitos.add(TipoProduto.ELETRONICOS);
	}
	
	@Override
	boolean aceitaCarga() {
		return true;
	}

	@Override
	void executeStrategy(Caminhao caminhao, Produto produto) {
		caminhao.setTipoCaminhao(TipoCaminhao.getTipo(produto.getTipoProduto().name()));
	}

}
