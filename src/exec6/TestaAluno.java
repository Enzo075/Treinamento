package exec6;

/**
 * Faz os dias corridos
 * 
 * @author eknascimento
 * @since 11/02/2020
 * @version 0.13
 */

import org.joda.time.Days;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import org.joda.time.DateTime;

public abstract class TestaAluno {

	public static void main(String[] args) {

		String dataCompleta = JOptionPane.showInputDialog("Digite sua data de Nascimento: ");
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);
		// o de cima fala para a pessoa digitar o codigo e como é uma String com "/"
		// então
		// ele tira o barra e quebra ele em 3 ano, mes e dia.

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String transFormaEmString = dateFormat.format(date);
		String dataAtual[] = transFormaEmString.split("/");
		int ano2 = Integer.parseInt(dataAtual[2]);
		int mes2 = Integer.parseInt(dataAtual[1]);
		int dia2 = Integer.parseInt(dataAtual[0]);
		// esse fala data atual e

		DateTime dataInicical = new DateTime(ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime(ano2, mes2, dia2, 0, 0);

		int dias = Days.daysBetween(dataInicical, dataFinal).getDays();
		System.out.println(dias);
	}

}
