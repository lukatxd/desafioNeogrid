package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.model.Caminhao;
import com.neogrid.model.Produto;

public class CaminhaoPasseio extends AbstractTipoCaminhao{

	public static final CaminhaoPasseio INSTANCE = new CaminhaoPasseio();

	public CaminhaoPasseio() {
		super();
	}

	@Override
	boolean aceitaCarga() {
		return false;
	}

	@Override
	void executeStrategy(Caminhao caminhao, Produto produto) {
		return;
	}

}
