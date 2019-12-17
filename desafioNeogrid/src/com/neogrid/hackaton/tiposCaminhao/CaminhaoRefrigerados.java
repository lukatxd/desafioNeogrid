package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.hackaton.tiposProduto.TipoProduto;
import com.neogrid.model.Caminhao;
import com.neogrid.model.Produto;

public class CaminhaoRefrigerados extends AbstractTipoCaminhao {

	
	
	public static final CaminhaoRefrigerados INSTANCE = new CaminhaoRefrigerados();

	public CaminhaoRefrigerados() {
		super();
		tiposProdutoAceitos.add(TipoProduto.REFRIGERADOS);
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
