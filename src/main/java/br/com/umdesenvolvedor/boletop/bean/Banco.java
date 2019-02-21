package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Banco implements Serializable {

	private static final long serialVersionUID = 1L;

	private int codCompensacao;
	private String nomeInstituicao;
	private String cnpj;
	private String segmento;

	public Banco(int codCompensacao, String nomeInstituicao, String cnpj, String segmento) {
		super();
		this.codCompensacao = codCompensacao;
		this.nomeInstituicao = nomeInstituicao;
		this.cnpj = cnpj;
		this.segmento = segmento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getCodCompensacao() {
		return codCompensacao;
	}

	public String getNomeInstituicao() {
		return nomeInstituicao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getSegmento() {
		return segmento;
	}

	@Override
	public String toString() {
		return "Banco [codCompensacao=" + codCompensacao + ", nomeInstituicao=" + nomeInstituicao + ", cnpj=" + cnpj
				+ ", segmento=" + segmento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + codCompensacao;
		result = prime * result + ((nomeInstituicao == null) ? 0 : nomeInstituicao.hashCode());
		result = prime * result + ((segmento == null) ? 0 : segmento.hashCode());
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
		Banco other = (Banco) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (codCompensacao != other.codCompensacao)
			return false;
		if (nomeInstituicao == null) {
			if (other.nomeInstituicao != null)
				return false;
		} else if (!nomeInstituicao.equals(other.nomeInstituicao))
			return false;
		if (segmento == null) {
			if (other.segmento != null)
				return false;
		} else if (!segmento.equals(other.segmento))
			return false;
		return true;
	}

}
