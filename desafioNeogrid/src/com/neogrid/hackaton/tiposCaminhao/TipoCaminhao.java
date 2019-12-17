package com.neogrid.hackaton.tiposCaminhao;

import com.neogrid.model.Produto;

public enum TipoCaminhao {
	GERAL(CaminhaoGeral.INSTANCE),
	ALIMENTOS(CaminhaoAlimentos.INSTANCE),
	REFRIGERADOS(CaminhaoRefrigerados.INSTANCE),
	ELETRONICOS(CaminhaoEletronicos.INSTANCE),
	PASSEIO(CaminhaoPasseio.INSTANCE);
	
	AbstractTipoCaminhao tipoCaminhao;
	
	TipoCaminhao(AbstractTipoCaminhao tipoCaminhao){
		this.tipoCaminhao = tipoCaminhao;
	}
	
	boolean aceitaCarga() {
		return tipoCaminhao.aceitaCarga();
	}
	
	boolean aceitaProduto(Produto produto) {
		return tipoCaminhao.aceitaProduto(produto);
	}

	public static TipoCaminhao getTipo(String name) {
		return valueOf(name);
	}
}
