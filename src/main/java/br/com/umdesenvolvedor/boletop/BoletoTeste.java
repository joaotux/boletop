package br.com.umdesenvolvedor.boletop;

import java.time.LocalDate;

import br.com.umdesenvolvedor.boletop.utils.GeraDigitoVerificador;
import br.com.umdesenvolvedor.boletop.utils.GeraFatorVencimento;
import br.com.umdesenvolvedor.boletop.utils.GerarNossoNumero;
import br.com.umdesenvolvedor.boletop.utils.StringUtils;

public class BoletoTeste {
	
	public static void main(String args[]) {
		GeraDigitoVerificador digito = new GeraDigitoVerificador();
		
		CalculaBase11 base11 = new CalculaBase11();
		//base11.getMod11("75691327101007926005248406001");
		
		//75696000130307615124415074780014
		
		//75691327100100792600752484060018
		
		//System.out.println(digito.getDV11("7569600013030761512441507478001477910000043789"));
		
		//LocalDate vencimento = LocalDate.of(2019, 02, 28);
		//System.out.println(GeraFatorVencimento.getCalculaFator(vencimento));
		
		System.out.println(GerarNossoNumero.getNossoNumero("1", "1-9", "21"));
		
	}
}
