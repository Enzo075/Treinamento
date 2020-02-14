package exec3;

/**
 * Metodos
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.3
 */

public class Produto {

	String nome = "enzo´s";
	int quantidade = 100;
	double custo = 0.10;
	int quantidadeVendida = 50;
	double percentualDeLucro = 30.0;

	public void exibirNome() {
		if (nome != null) {
			System.out.println(nome);
		} else {
			System.out.println("nome nulo");
		}
	}

	public void exibirValor() {
		if (custo > 0 || percentualDeLucro > 0) {
			System.out.println("Lucro total: "
					+ (custo * percentualDeLucro / 100) + custo);
		} else {
			System.out.println("Valor negativo");
		}
	}

	public void exibirLucro() {
		if (custo > 0 || percentualDeLucro > 0) {
			System.out.println(custo * percentualDeLucro / 100);
		} else {
			System.out.println("Valor negativo");
		}
	}

	public void exibirQuantidadeVendida() {
		System.out.println(quantidadeVendida);
	}

	public void exibirTudo() {
		exibirNome();
		exibirValor();
		exibirLucro();
		exibirQuantidadeVendida();
	}

}
