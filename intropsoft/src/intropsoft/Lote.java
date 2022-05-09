package intropsoft;

import java.util.Date;

public class Lote {
	
	Lote(){
		String id;
		Produto produto;
		Date dataFabricacao;
		Date dataValidade;
		int quantidade;
	}
	
	public String toString(String id) {
		return produto.id + " " + dataValidade.id;
	}

}
