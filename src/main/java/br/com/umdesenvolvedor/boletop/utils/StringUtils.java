package br.com.umdesenvolvedor.boletop.utils;

public class StringUtils {
	
	/**
	 * 
	 * @param valor
	 * @param tamanho
	 * @return string formatada com os zeros a esquerda
	 * 
	 * passe o valor em string e o tamanho da mascara.
	 * Ex: valor = "27", tamanho = 5
	 * Retorno = 00027
	 */
	public static String addZerosEsquerda(String valor, int tamanho) {
		tamanho -= valor.length();
		String zeros = "";
		
		for(int i = 0; i < tamanho; i++) {
			zeros += "0";
		}
		
		return zeros + valor;
	}

}
