package exec3;

/**
 * essa classe esta dizendo que é uma instenção do produto e é um metodo falando
 * as variaveis
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.7
 */

public class Carro extends Produto {

	String marca = "astra";
	String cor = "Cinza";
	String modelo = "CDX";
	int ano = 2000;
	String motor = "CDzX";

	public void exibirCarro() {
		System.out.println(marca);
		System.out.println(cor);
		System.out.println(modelo);
		if (ano > 1886) {
			System.out.println(ano);
		} else {
			System.out.println("O ano está errado");
		}
		System.out.println(motor);
		exibirTudo();
	}
}
