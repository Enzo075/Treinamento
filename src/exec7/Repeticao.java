package exec7;

import javax.swing.JOptionPane;

public class Repeticao {
	boolean exit = false;
	
	public Repeticao() {
//		while (!exit) {
//			processar();
//		}
		testaWhile();
	}
	public void testaWhile() {
		int i = 10;
		while (i<10) {
			System.out.println(i + "ao cubo � " + ((i*i)*i));
			i = i + 1;	
		}
	}
	
	public void testaDoWhile() {
		int i = 10;
		do {
			System.out.println(i + "ao cubo � " + ((i*i)*i));
			i ++;
		}while (i<10);
	
	}
	
	public void processar() {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do carro: "));
		switch (opcao) {
		case 1:
			JOptionPane.showMessageDialog(null, "op��o 1");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "op��o 2");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "op��o 3");
			break;
		case 9:
			exit = true;
			break;

		default:
			JOptionPane.showMessageDialog(null, "op��o invalida");
			break;
		}
	}
	public static void main(String[] args) {
		new Repeticao();
	}

}
