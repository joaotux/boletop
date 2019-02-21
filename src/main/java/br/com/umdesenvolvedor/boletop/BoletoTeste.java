package br.com.umdesenvolvedor.boletop;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.umdesenvolvedor.boletop.bean.Agencia;
import br.com.umdesenvolvedor.boletop.bean.Banco;
import br.com.umdesenvolvedor.boletop.bean.Boleto;
import br.com.umdesenvolvedor.boletop.bean.Carteira;
import br.com.umdesenvolvedor.boletop.bean.Cedente;
import br.com.umdesenvolvedor.boletop.bean.ContaBancaria;
import br.com.umdesenvolvedor.boletop.bean.Pessoa;
import br.com.umdesenvolvedor.boletop.bean.Titulo;
import br.com.umdesenvolvedor.boletop.camposLivres.CampoLivreSicoob;
import br.com.umdesenvolvedor.boletop.enumerado.EnumAceite;
import br.com.umdesenvolvedor.boletop.enumerado.EnumEspecieDoc;
import br.com.umdesenvolvedor.boletop.enumerado.EnumMoeda;
import br.com.umdesenvolvedor.boletop.utils.GeraCodigoDigitavel;

public class BoletoTeste {

	public static void main(String args[]) {
		ContaBancaria conta = new ContaBancaria(756, new Banco(756, "Sicoob", "452154545", "Coperativa"), new Agencia(4521, "Teste"), new Carteira(2, "Teste"));

		Pessoa pessoa = new Pessoa("João Rafael", "01550582232", null);
		Cedente cedente = new Cedente(pessoa, conta, 1L);
		
		Titulo titulo = new Titulo(12, 1, new BigDecimal(500.5), new BigDecimal(0), new BigDecimal(0),
				new BigDecimal(0), new BigDecimal(500.0), EnumAceite.N, EnumEspecieDoc.DS, EnumMoeda.R$,
				LocalDate.now());
		
		Boleto boleto = new Boleto("Qualquer banco", "Teste 01", null, cedente, titulo);
		
		CampoLivreSicoob sicoob = new CampoLivreSicoob(boleto, "4587");
		
		GeraCodigoDigitavel codigo = new GeraCodigoDigitavel(boleto, "4587", sicoob);
		String codigoDigitavel = codigo.gerar();
		
		System.out.println(codigoDigitavel);

	}
}
