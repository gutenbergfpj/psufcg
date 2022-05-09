package intropsoft;

public class Produto {
	
	Produto(){
		String id;
		String nomeProduto;
		String fabricante;
	}
	
	public String toString(String id) {
		return nomeProduto + " " + fabricante;
	}

}
