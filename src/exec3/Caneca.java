package exec3;

/**
 * essa classe esta dizendo que é uma instenção do produto e é um metodo falando
 * as variaveis
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.5
 */

public class Caneca extends Produto {

	boolean estampa = true;
	String material = "plastico";
	double medida = 5.0;

	public void exibirCaneca() {
		if (estampa == true) {
			System.out.println("com estampa");
		} else {
			System.out.println("sem estampa");
		}
		System.out.println(material);
		if (medida > 0) {
			System.out.println(medida);
		} else {
			System.out.println("medida invalida");
		}
		exibirTudo();
	}
}
