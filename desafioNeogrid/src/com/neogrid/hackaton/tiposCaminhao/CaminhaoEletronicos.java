package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.hackaton.model.Caminhao;
import com.neogrid.hackaton.model.Produto;
import com.neogrid.hackaton.tiposProduto.TipoProduto;

public class CaminhaoEletronicos extends AbstractTipoCaminhao {
	
	public static CaminhaoEletronicos INSTANCE = new CaminhaoEletronicos();

	public CaminhaoEletronicos() {
		super();
		tiposProdutoAceitos.add(TipoProduto.ELETRONICOS);
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
