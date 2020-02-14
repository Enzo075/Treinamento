package exec3;

/**
 * essa classe esta dizendo que é uma instenção do produto
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.4
 */

public class Computador extends Produto {

	String processador = "Intel 15";
	String memoria = "32 Gb";
	String tela = "lenovo";
	String hd = "son disk";
	String placaVideo = "xiaome";

	public void exibirComputador() {
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placaVideo);
		exibirTudo();
	}
}
