package br.com.umdesenvolvedor.boletop.utils;

/**
 * 
 * @author joao
 * 
 *	Classe responsável pelo cálculo do nosso número
 *
 */
public class GerarNossoNumero {

	/**
	 * 
	 * @param numCoperativa
	 * @param codCliente
	 * @param nossoNum
	 * @return nossoNum + "-" + DV
	 * 
	 */
	public static String getNossoNumero(String numCoperativa, String codCliente, String nossoNum) {
		//guardo o nosso numero para retorná-lo no final
		String nossoNumero = nossoNum;
		String numero = "";
		int[] consCalculo = new int[] {3, 1, 9, 7};
		int soma = 0;
		int resto = 0;
		int dv = 0;
		int aux = 0;

		// completa os valores com zeros a esquerda
		numCoperativa = StringUtils.addZerosEsquerda(numCoperativa, 4);
		codCliente = StringUtils.addZerosEsquerda(codCliente.replace("-", ""), 10);
		nossoNum = StringUtils.addZerosEsquerda(nossoNum, 7);

		//concateno os dados para realizar os cálculos
		numero = numCoperativa + codCliente + nossoNum;
		
		int[] numCalculados = new int[numero.length()];

		//multiplico cada número pelos algarismos da constante 3197
		for (int i = 0; i < numero.length(); i++) {
			numCalculados[i] = Integer.parseInt(String.valueOf(numero.charAt(i))) * consCalculo[aux];

			aux++;

			//se chegou no 7 volto para o 3
			if (aux == 3)
				aux = 0;
		}

		//realizo a soma
		for (int i = 0; i < numCalculados.length; i++) {
			soma += numCalculados[i];
		}

		resto = soma % 11;

		dv = (11 - resto);

		if (resto == 1 || resto == 0)
			dv = 0;

		return nossoNumero + "-" + dv;
	}

}
