package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.hackaton.tiposProduto.TipoProduto;
import com.neogrid.model.Caminhao;
import com.neogrid.model.Produto;

public class CaminhaoAlimentos extends AbstractTipoCaminhao {

	public static final CaminhaoAlimentos INSTANCE = new CaminhaoAlimentos();

	public CaminhaoAlimentos() {
		super();
		tiposProdutoAceitos.add(TipoProduto.ALIMENTOS);
	}

	@Override
	boolean aceitaCarga() {
		return true;
	}

	@Override
	void executeStrategy(Caminhao caminhao, Produto produto) {
		return;
	}

}
