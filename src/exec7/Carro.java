package exec7;

/**
 * Testa o metodo caneca
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.15
 */

public class Carro {
	
	 
	int posicao;
	int velocidadeMaxima;
	double valor;
	String placaCarro;
	String modeloDoCarro;
	String combustivel;
	String cor;
	boolean vendido = false;
	
	public Carro() {

	}

	public Carro(int velocidadeMaxima, double valor, String placaCarro, String modeloDoCarro, String combustivel, String cor, int posicao) {

		this.velocidadeMaxima = velocidadeMaxima;
		this.valor = valor;
		this.placaCarro = placaCarro;
		this.modeloDoCarro = modeloDoCarro;
		this.combustivel = combustivel;
		this.cor = cor;
		this.posicao = posicao;
		
	}

}
