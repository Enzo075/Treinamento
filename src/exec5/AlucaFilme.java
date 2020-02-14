package exec5;

import javax.swing.JOptionPane;

/**
 * Testa o metodo caneca
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.12
 */

public class AlucaFilme {

	static double valAl;
	static double valPa;
	static int diasAl = 10;
	static String fil;
	static boolean filIn = true;
	static boolean filSto = true;

	public static boolean verificaDisponibilidade(String fil) {
		fil = JOptionPane.showInputDialog("Digite o numero do filme alugado \n1-In");

		if (fil == "1") {

			if (filIn) {
				return true;
			} else {
				return false;
			}

		} else {
			if (fil == "2") {
				if (filSto) {
					return true;
				} else {
					return false;
				}
			} else {
				if (fil != "1" ||fil != "2") {
					System.out.println("Número Invalido");
			}
		}
	}
		return filIn;
	}

	public static void main(String[] args) {

		if (verificaDisponibilidade(fil)) {
			diasAl = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias que você ira assistir"));
			if (diasAl >= 1) {
				double acum1 = diasAl + valAl;
				valPa = Double.parseDouble(JOptionPane.showInputDialog("Valor aluguel" + acum1 +"\nDigite valor que ira pagar: "));
				if (valPa < acum1) {
					double acum = acum1 - valPa;
					System.out.println("Valor pago insuficiente \n Falta: " + acum);
				} else {
					if (valPa > acum1) {
						double acum = valPa - acum1;
						System.out.println("Filme Alugado com sucesso \n Seu troco: " + acum);
					} else {
						if (valPa == acum1) {
							System.out.println("Filme Alugado com sucesso");
						}
					}
				}
			}
		}
	}
}
