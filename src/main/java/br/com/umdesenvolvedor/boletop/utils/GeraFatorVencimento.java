package br.com.umdesenvolvedor.boletop.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author joao
 *	
 * Classe responsável pelo cálculo do fator de vencimento.
 * 
 */
public class GeraFatorVencimento {

	/**
	 * OBSERVAÇÃO IMPORTANTE 
	 * 
	 * Em 22/02/2025 o Fator de Vencimento deverá retornar
	 * automaticamente para o fator 1000. A data de 22/02/2025 deverá ser adotada
	 * como nova DATA BASE para o cálculo. fator de vencimento = (data de
	 * vencimento) - (22/02/2025) + 1000
	 */
	private static final int year = 2000;
	private static final int moth = 07;
	private static final int day = 03;

	public static long getCalculaFator(LocalDate vencimento) {
		LocalDate referencia = LocalDate.of(year, moth, day);

		long fatorVenc = ChronoUnit.DAYS.between(referencia.plusDays(1000), vencimento);

		return fatorVenc;
	}

}
