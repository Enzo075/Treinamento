package exec7;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Testa o metodo caneca
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.16
 */

public class Locadora {

	static Carro vetorCarro[];
	static Carro auxiliar[];

	public Locadora() {
		boolean exit = false;
		try {
			while (!exit) {
				int opcao = Integer.parseInt(JOptionPane.showInputDialog(
						"Informe a opcao: \nOpcção 1 - Pesquisa o modelo do Carro \nOpcção 2 - Pesquisa a Velocidade Maxia do carro \nOpcção 3 - Pesquisa a Quantidade Combustivel que o carro tem \nOpcção 4 - Mostra os carros por ordem de preço \nOpcção 5 - Pesquisa a cor dos carros \nOpcção 6 - Modo Compra \nOpcção 9 - Fim do programa"));

				switch (opcao) {
				case 1:
					pesquisaModelo();
					break;
				case 2:
					pesquisaVelocidade();
					break;
				case 3:
					pesquisaCombustivel();
					break;
				case 4:
					doMairAoMenor();
					break;
				case 5:
					pesquisaCor();
					break;
				case 6:
					modoCompra();
					break;
				case 9:
					exit = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida!");
					break;
				}
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Modelo invalido");
			new Locadora();
		}
	}

	public static void colocaVetor() {
		new Carro();
	}

	public static void main(String[] args) {

		vetorCarro = new Carro[11];
		Carro carrinho1 = new Carro(100, 500000, "CPF - 1234", "KOMBI", "ALCOOL", "AMARELO", 1);
		Carro carrinho2 = new Carro(130, 200000, "RGS - 5678", "FUSCA", "GASOLINA", "AZUL", 2);
		Carro carrinho3 = new Carro(100, 300000, "SEL - 3245", "GOL", "FLEX", "CINZA", 3);
		Carro carrinho4 = new Carro(150, 400000, "OKO - 2797", "LAMBORGHINI", "DIESEL", "ROXO", 4);
		Carro carrinho5 = new Carro(200, 800000, "VOC - 6546", "LAMBORGHINI", "GASOLINA", "VERMELHO", 5);
		Carro carrinho6 = new Carro(100, 600000, "EEO - 4564", "KOMBI", "GASOLINA", "AMARELO", 6);
		Carro carrinho7 = new Carro(350, 900000, "BIX - 5425", "GOL", "FLEX", "LARANJA", 7);
		Carro carrinho8 = new Carro(210, 410000, "AOM - 1534", "UNO", "GASOLINA", "ROSA", 8);
		Carro carrinho9 = new Carro(240, 600000, "ESM - 2341", "UNO", "DIESEL", "MARROM", 9);
		Carro carrinho10 = new Carro(100, 500000, "OOO - 1234", "KOMBI", "DISIEL", "AMARELO", 10);
		vetorCarro[0] = carrinho1;
		vetorCarro[1] = carrinho2;
		vetorCarro[2] = carrinho3;
		vetorCarro[3] = carrinho4;
		vetorCarro[4] = carrinho5;
		vetorCarro[5] = carrinho6;
		vetorCarro[6] = carrinho7;
		vetorCarro[7] = carrinho8;
		vetorCarro[8] = carrinho9;
		vetorCarro[9] = carrinho10;

		new Locadora();
	}

	public void pesquisaModelo() {
		String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ").toUpperCase();
		boolean temCarro = false;
		String listaCarro = "";
		for (int i = 0; i < 10; i++) {
			if (vetorCarro[i].modeloDoCarro.equals(modelo)) {
				if (vetorCarro[i].vendido) {

				} else {

					String valorFormatado = new DecimalFormat("R$#,##0.00").format(vetorCarro[i].valor);
					listaCarro = listaCarro + "Modelo:..............." + vetorCarro[i].modeloDoCarro
							+ "\nPlaca:.................." + vetorCarro[i].placaCarro + "\nCombustível:....."
							+ vetorCarro[i].combustivel + "\nVel. max.::.........." + vetorCarro[i].velocidadeMaxima
							+ "\nValor:..........." + valorFormatado + "\nCor:............." + vetorCarro[i].cor
							+ "\n\n";
					temCarro = true;
				}
			}
		}
		if (!temCarro) {
			JOptionPane.showMessageDialog(null, "Modelo invalido");
		} else {

			JOptionPane.showMessageDialog(null, listaCarro);
		}
	}

	public void pesquisaVelocidade() {
		try {
			int velocidade = Integer
					.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro: ").toUpperCase());
			boolean temCarro = false;
			String listaCarro = "";
			for (int i = 0; i < 10; i++) {
				if (vetorCarro[i].velocidadeMaxima == velocidade) {
					if (vetorCarro[i].vendido) {

					} else {

						String valorFormatado = new DecimalFormat("R$#,##0.00").format(vetorCarro[i].valor);
						listaCarro = listaCarro + "Modelo:..............." + vetorCarro[i].modeloDoCarro
								+ "\nPlaca:.................." + vetorCarro[i].placaCarro + "\nCombustível:....."
								+ vetorCarro[i].combustivel + "\nVel. max.::.........." + vetorCarro[i].velocidadeMaxima
								+ "\nValor:..........." + valorFormatado + "\nCor:............." + vetorCarro[i].cor
								+ "\n\n";
						temCarro = true;
					}
				}
			}
			if (!temCarro) {
				JOptionPane.showMessageDialog(null, "Velocidade invalida");
			} else {

				JOptionPane.showMessageDialog(null, listaCarro);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Modelo invalido");
			pesquisaVelocidade();
		}
	}

	public void pesquisaCombustivel() {
		String combustivel1 = JOptionPane.showInputDialog("Digite o tipo do combustivel do carro: ").toUpperCase();
		boolean temCarro = false;
		String listaCarro = "";
		for (int i = 0; i < 10; i++) {
			if (vetorCarro[i].combustivel.equals(combustivel1)) {
				if (vetorCarro[i].vendido) {

				} else {

					String valorFormatado = new DecimalFormat("R$#,##0.00").format(vetorCarro[i].valor);
					listaCarro = listaCarro + "Modelo:..............." + vetorCarro[i].modeloDoCarro
							+ "\nPlaca:.................." + vetorCarro[i].placaCarro + "\nCombustível:....."
							+ vetorCarro[i].combustivel + "\nVel. max.::.........." + vetorCarro[i].velocidadeMaxima
							+ "\nValor:..........." + valorFormatado + "\nCor:............." + vetorCarro[i].cor
							+ "\n\n";
					temCarro = true;
				}
			}
		}
		if (!temCarro) {
			JOptionPane.showMessageDialog(null, "Combustivel invalido");
		} else {

			JOptionPane.showMessageDialog(null, listaCarro);
		}
	}

	public void doMairAoMenor() {

		for (int i = 0; i < vetorCarro.length - 1; i++) {
			for (int j = i + 1; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					Carro auxiliiar = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = auxiliiar;
				}
			}
		}
		String listaCarro = "";
		for (Carro carro : vetorCarro) {
			if (carro.vendido) {

			} else {

				String valorFormatado = new DecimalFormat("R$#,##0.00").format(carro.valor);
				listaCarro = listaCarro + "Modelo:..............." + carro.modeloDoCarro + "\nPlaca:.................."
						+ carro.placaCarro + "\nCombustível:....." + carro.combustivel + "\nVel. max.::.........."
						+ carro.velocidadeMaxima + "\nValor:..........." + valorFormatado + "\nCor:............."
						+ carro.cor + "\n\n";
			}
		}

		JOptionPane.showMessageDialog(null, listaCarro);
	}

	public void pesquisaCor() {
		String cor1 = JOptionPane.showInputDialog("Digite a cor do carro: ").toUpperCase();
		boolean temCarro = false;
		String listaCarro = "";
		for (int i = 0; i < 10; i++) {
			if (vetorCarro[i].cor.equals(cor1)) {
				if (vetorCarro[i].vendido) {

				} else {

					String valorFormatado = new DecimalFormat("R$#,##0.00").format(vetorCarro[i].valor);
					listaCarro = listaCarro + "Modelo:..............." + vetorCarro[i].modeloDoCarro
							+ "\nPlaca:.................." + vetorCarro[i].placaCarro + "\nCombustível:....."
							+ vetorCarro[i].combustivel + "\nVel. max.::.........." + vetorCarro[i].velocidadeMaxima
							+ "\nValor:..........." + valorFormatado + "\nCor:............." + vetorCarro[i].cor
							+ "\n\n";
					temCarro = true;
				}
			}
		}
		if (!temCarro) {
			JOptionPane.showMessageDialog(null, "Cor invalida");
		} else {

			JOptionPane.showMessageDialog(null, listaCarro);
		}
	}

	public void modoCompra() {

		auxiliar = new Carro[11];

		String escolhaCarro = JOptionPane.showInputDialog("Digite o Carro que você quer comprar").toUpperCase();
		String escolhaCor = JOptionPane.showInputDialog("Digite a cor do carro: ").toUpperCase();
		boolean temCarro = false;
		int cont = 0;
		String listaCarro = "";
		for (int h = 0; h < vetorCarro.length - 1; h++) {
			if (vetorCarro[h].modeloDoCarro.equals(escolhaCarro) && vetorCarro[h].cor.equals(escolhaCor)) {
				
				String valorFormatado = new DecimalFormat("R$#,##0.00").format(vetorCarro[h].valor);
				listaCarro = listaCarro + cont + "Modelo:..............." + vetorCarro[h].modeloDoCarro
						+ "\nPlaca:.................." + vetorCarro[h].placaCarro + "\nCombustível:....."
						+ vetorCarro[h].combustivel + "\nVel. max.::.........." + vetorCarro[h].velocidadeMaxima
						+ "\nValor:..........." + valorFormatado + "\nCor:............." + vetorCarro[h].cor + "\n\n";
				temCarro = true;
				auxiliar[cont] = vetorCarro[h];
				cont++;
			}
		}

		for (int h = 0; h < vetorCarro.length - 1; h++) {
			for (int j = h + 1; j < vetorCarro.length; j++) {
				if (vetorCarro[j].valor < vetorCarro[h].valor) {
					Carro auxiliiar = vetorCarro[h];
					vetorCarro[h] = vetorCarro[j];
					vetorCarro[j] = auxiliiar;
				}
			}
		}
		
		if (temCarro) {
			String opcao = JOptionPane.showInputDialog(listaCarro);
			int num = Integer.parseInt(opcao);
			
			double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor a ser pago:"));
			if (valor == auxiliar[num].valor) {
				//vendo
			}else if (valor < auxiliar[num].valor) {
				//não vendo
			}else {
				//vendo
				
			}
			
			
		}


	}

}