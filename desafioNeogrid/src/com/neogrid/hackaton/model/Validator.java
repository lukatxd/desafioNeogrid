package com.neogrid.hackaton.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.neogrid.hackaton.tiposCaminhao.TipoCaminhao;

public class Validator {

	public static boolean validaCarga(Caminhao caminhao, Produto produto) {
		return caminhao.aceitaCarga() && caminhao.podeAceitarProduto(produto)
		&& caminhao.getDestino().equals(produto.getDestino()) && caminhao.getCapacidade() > produto.getPeso();
	}
	
	public static boolean validaPrimeiraLinha(final File file) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			line = br.readLine();
			boolean primeiraLinha;
			{
				TipoCaminhao tipo = TipoCaminhao.getTipo(line);

				if (tipo == null) {
					primeiraLinha = false;
					throw new Exception();
				} else {
					primeiraLinha = true;
				}
			}
			return primeiraLinha;
		}
	}

	public static boolean validaSegundaLinha(final File file) throws Exception {

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			line = br.readLine();
			line = br.readLine();
			boolean segundaLinha;
			{
				double l = Double.parseDouble(line);
				if (l > 0) {
					segundaLinha = true;
				} else {
					segundaLinha = false;
				}
			}return segundaLinha;
		}
		
	}
	
	public boolean validaTerceiraLinha(final File file) throws IOException {
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			line = br.readLine();
			line = br.readLine();
			line = br.readLine();
			if(line == null) {
				return false;
			}
				return true;
		}
	}
	
}
