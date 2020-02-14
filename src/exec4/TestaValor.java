package exec4;

/**
 * Testa os calculos basicos 
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.11
 */

public class TestaValor {

	public static void main(String[] args) {
		byte b = (byte) 128;
		String d = "100";
		int i = Integer.parseInt(d);
		String s = i + "";
		System.out.println("O valor de B: " + b + "\n" + i + "\n" + s);
	}
}
