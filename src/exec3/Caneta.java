package exec3;

/**
 * essa classe esta dizendo que é uma instenção do produto e é um metodo falando
 * as variaveis
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.6
 */

public class Caneta extends Produto {

	String cor = "preto";
	String formato = "triangular";
	String marca = "bic";

	public void exibirCaneta() {
		System.out.println(cor);
		System.out.println(formato);
		System.out.println(marca);
		exibirTudo();
	}
}
