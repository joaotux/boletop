package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.umdesenvolvedor.boletop.enumerado.EnumAceite;
import br.com.umdesenvolvedor.boletop.enumerado.EnumEspecieDoc;
import br.com.umdesenvolvedor.boletop.enumerado.EnumMoeda;

public class Titulo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numero;
	private int numParcela;
	private BigDecimal valor;
	private BigDecimal desconto;
	private BigDecimal deducao;
	private BigDecimal mora;
	private BigDecimal valorCobrado;
	private EnumAceite aceite;
	private EnumEspecieDoc especieDocumento;
	private EnumMoeda moeda;
	private LocalDate vencimento;

	public Titulo(int numero, int numParcela, BigDecimal valor, BigDecimal desconto, BigDecimal deducao,
			BigDecimal mora, BigDecimal valorCobrado, EnumAceite aceite, EnumEspecieDoc especieDocumento,
			EnumMoeda moeda, LocalDate vencimento) {
		super();
		this.numero = numero;
		this.numParcela = numParcela;
		this.valor = valor;
		this.desconto = desconto;
		this.deducao = deducao;
		this.mora = mora;
		this.valorCobrado = valorCobrado;
		this.aceite = aceite;
		this.especieDocumento = especieDocumento;
		this.moeda = moeda;
		this.vencimento = vencimento;
	}

	public int getNumero() {
		return numero;
	}

	public int getNumParcela() {
		return numParcela;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public BigDecimal getDeducao() {
		return deducao;
	}

	public BigDecimal getMora() {
		return mora;
	}

	public BigDecimal getValorCobrado() {
		return valorCobrado;
	}

	public EnumAceite getAceite() {
		return aceite;
	}

	public EnumEspecieDoc getEspecieDocumento() {
		return especieDocumento;
	}

	public EnumMoeda getMoeda() {
		return moeda;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	@Override
	public String toString() {
		return "Titulo [numero=" + numero + ", valor=" + valor + ", desconto=" + desconto + ", deducao=" + deducao
				+ ", mora=" + mora + ", valorCobrado=" + valorCobrado + ", aceite=" + aceite + ", especieDocumento="
				+ especieDocumento + ", moeda=" + moeda + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aceite == null) ? 0 : aceite.hashCode());
		result = prime * result + ((deducao == null) ? 0 : deducao.hashCode());
		result = prime * result + ((desconto == null) ? 0 : desconto.hashCode());
		result = prime * result + ((especieDocumento == null) ? 0 : especieDocumento.hashCode());
		result = prime * result + ((moeda == null) ? 0 : moeda.hashCode());
		result = prime * result + ((mora == null) ? 0 : mora.hashCode());
		result = prime * result + numero;
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		result = prime * result + ((valorCobrado == null) ? 0 : valorCobrado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		if (aceite != other.aceite)
			return false;
		if (deducao == null) {
			if (other.deducao != null)
				return false;
		} else if (!deducao.equals(other.deducao))
			return false;
		if (desconto == null) {
			if (other.desconto != null)
				return false;
		} else if (!desconto.equals(other.desconto))
			return false;
		if (especieDocumento != other.especieDocumento)
			return false;
		if (moeda != other.moeda)
			return false;
		if (mora == null) {
			if (other.mora != null)
				return false;
		} else if (!mora.equals(other.mora))
			return false;
		if (numero != other.numero)
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		if (valorCobrado == null) {
			if (other.valorCobrado != null)
				return false;
		} else if (!valorCobrado.equals(other.valorCobrado))
			return false;
		return true;
	}

}
