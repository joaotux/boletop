package br.com.umdesenvolvedor.boletop.camposLivres;

import br.com.umdesenvolvedor.boletop.ICamposLivres;
import br.com.umdesenvolvedor.boletop.bean.Boleto;
import br.com.umdesenvolvedor.boletop.utils.GerarNossoNumero;
import br.com.umdesenvolvedor.boletop.utils.StringUtils;

public class CampoLivreSicoob implements ICamposLivres{
	
	private Boleto boleto;
	private String nossoNumero = "";
	private String campoLivre1 = "";
	private String campoLivre2 = "";
	private String campoLivre3 = "";
	
	public CampoLivreSicoob(Boleto boleto, String nossoNumero) {
		this.boleto = boleto;
		this.nossoNumero = nossoNumero;
	}

	public String getCampoLivre1() {
		String codCarteira = String.valueOf(boleto.getCedente().getContaBancaria().getCarteira().getNumero());
		String codAgencia = String.valueOf(boleto.getCedente().getContaBancaria().getAgencia().getNumero());
		
		campoLivre1 = codCarteira + codAgencia;
		
		return campoLivre1;
	}

	public String getCampoLivre2() {
		String modalidade = "55";
		String codBeneficiario = StringUtils.addZerosEsquerda(boleto.getCedente().getCodBeneficiario().toString(), 7);
		String nossoNumero = "1";
		
		campoLivre2 = modalidade + codBeneficiario + nossoNumero;
		
		return campoLivre2;
	}

	public String getCampoLivre3() {
		String codCoperativa = String.valueOf(boleto.getCedente().getContaBancaria().getAgencia().getNumero());
		String codCliente = String.valueOf(boleto.getCedente().getCodBeneficiario());
		
		campoLivre3 = GerarNossoNumero.getNossoNumero(codCoperativa, codCliente, nossoNumero) + StringUtils.addZerosEsquerda(String.valueOf(boleto.getTitulo().getNumParcela()), 3);
		
		return campoLivre3;
	}

}
