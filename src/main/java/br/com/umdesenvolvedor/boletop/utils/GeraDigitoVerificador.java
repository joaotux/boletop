package br.com.umdesenvolvedor.boletop.utils;

public class GeraDigitoVerificador {

	public int getDv10(String numero) {
		int multiplicador = 2;
		StringBuffer algarismos = new StringBuffer();
		int soma = 0;
		int dv = 0;

		for (int i = (numero.length() - 1); i >= 0; i--) {
			int num = Integer.parseInt(String.valueOf(numero.charAt(i)));

			String numMulti = String.valueOf(num * multiplicador);

			for (int aux2 = 0; aux2 < numMulti.length(); aux2++) {
				int algarismoAtual = Integer.parseInt(String.valueOf(numMulti.charAt(aux2)));

				if (algarismoAtual != 0)
					algarismos.append(algarismoAtual);
			}

			multiplicador = multiplicador == 2 ? 1 : 2;
		}

		for (int i = 0; i < algarismos.length(); i++)
			soma += Integer.parseInt(String.valueOf(algarismos.toString().charAt(i)));

		int resto = soma % 10;

		if (resto > 0)
			dv = 10 - resto;

		return dv;
	}
	
	//Módulo 11
	//Conforme o esquema abaixo, para calcular o primeiro dígito verificador, cada dígito do número, 
	//começando da direita para a esquerda (do dígito menos significativo para o dígito mais significativo) 
	//é multiplicado, na ordem, por 2, depois 3, depois 4 e assim sucessivamente, até o primeiro dígito do número. 
	//O somatório dessas multiplicações dividido por 11. O resto desta divisão (módulo 11) é subtraido da base (11), 
	//o resultado é o dígito verificador. Para calcular o próximo dígito, considera-se o dígito anterior como parte 
	//do número e efetua-se o mesmo processo. No exemplo, foi considerado o número 261533:
	//  +---+---+---+---+---+---+   +---+
	//  | 2 | 6 | 1 | 5 | 3 | 3 | - | 9 |
	//  +---+---+---+---+---+---+   +---+
//	    |   |   |   |   |   |
	//   x7  x6  x5  x4  x3  x2
//	    |   |   |   |   |   |
	//   =14 =36  =5 =20  =9  =6 soma = 90
//	    +---+---+---+---+---+-> = (90 / 11) = 8,1818 , resto 2 => DV = (11 - 2) = 9

	public int getDV11(String numero) {
		int multiplicador = 2;
		int[] numerosMult = new int[numero.length()];
		
		System.out.println("Tamanho " + numero.length());
		System.out.println("numero " + numero);

		for (int i = (numero.length() - 1); i >= 0; i--) {
			int numAtual = Integer.parseInt(String.valueOf(numero.charAt(i)));

			numerosMult[i] = numAtual * multiplicador;

			System.out.println("numAtual " + numAtual + " x " + multiplicador + " = " + numerosMult[i]);

			multiplicador++;

			if (multiplicador > 9)
				multiplicador = 2;
		}

		int soma = 0;

		for(int i = 0; i < numerosMult.length; i++) {
			soma += numerosMult[i];
		}

		int resto = soma % 11;
		
		int dv = 11 - resto;
		
		System.out.println("soma " + soma);
		System.out.println("resto " + resto);
		System.out.println("dv " + dv);
		

		if (dv < 2 || dv > 9)
			dv = 1;
		
		return dv;
	}

}
