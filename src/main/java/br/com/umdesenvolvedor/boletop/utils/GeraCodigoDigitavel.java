package br.com.umdesenvolvedor.boletop.utils;

import br.com.umdesenvolvedor.boletop.ICamposLivres;
import br.com.umdesenvolvedor.boletop.bean.Boleto;
import br.com.umdesenvolvedor.boletop.bean.Moeda;
import br.com.umdesenvolvedor.boletop.enumerado.EnumMoeda;

public class GeraCodigoDigitavel {

	private int codBanco;
	private int codMoeda;
	private String camposLivres1;

	private String camposLivres2;

	private String camposLivres3;

	private String vlBoleto;

	private ICamposLivres campo;
	private GeraDigitoVerificador dv;
	private Boleto boleto;

	public GeraCodigoDigitavel(Boleto boleto, String nossoNumero, ICamposLivres camposLivres) {
		this.campo = camposLivres;
		dv = new GeraDigitoVerificador();
		this.boleto = boleto;

		Moeda moeda = new Moeda(9, EnumMoeda.R$);
		codBanco = boleto.getCedente().getContaBancaria().getBanco().getCodCompensacao();
		codMoeda = moeda.getNumero();

	}

	public String gerar() {
		// GERA BLOCO 01
		camposLivres1 = campo.getCampoLivre1();
		String bloco01 = String.valueOf(codBanco) + String.valueOf(codMoeda) + camposLivres1;

		System.out.println(String.valueOf(dv.getDv10(bloco01)));
		bloco01 += String.valueOf(dv.getDv10(bloco01));

		// GERA BLOCO 02
		camposLivres2 = campo.getCampoLivre2();
		String bloco02 = camposLivres2 + String.valueOf(dv.getDv10(camposLivres2));

		// GERA BLOCO 03
		camposLivres3 = campo.getCampoLivre3().replace("-", "");
		System.out.println(camposLivres3);
		String bloco03 = camposLivres3 + String.valueOf(dv.getDv10(camposLivres3));

		// DV GERAL
		String dvGeral = String.valueOf(dv.getDV11(bloco01 + bloco02 + bloco03));

		// GERA BLOCO 04
		vlBoleto = StringUtils.addZerosEsquerda(boleto.getTitulo().getValor().toString().replace(".", ""), 10);
		String bloco04 = GeraFatorVencimento.getCalculaFator(boleto.getTitulo().getVencimento()) + vlBoleto;

		String teste = bloco01 + bloco02 + bloco03 + dvGeral + bloco04;
		System.out.println(teste.length());
		return bloco01 + "." + bloco02 + "." + bloco03 + "." + dvGeral + "." + bloco04;
	}

}
