package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Cedente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;
	private ContaBancaria contaBancaria;
	private Long codBeneficiario;

	public Cedente(Pessoa pessoa, ContaBancaria contaBancaria, Long codBeneficiario) {
		super();
		this.pessoa = pessoa;
		this.contaBancaria = contaBancaria;
		this.codBeneficiario = codBeneficiario;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public ContaBancaria getContaBancaria() {
		return contaBancaria;
	}

	public Long getCodBeneficiario() {
		return codBeneficiario;
	}

	@Override
	public String toString() {
		return "Cedente [pessoa=" + pessoa + ", contaBancaria=" + contaBancaria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contaBancaria == null) ? 0 : contaBancaria.hashCode());
		result = prime * result + ((pessoa == null) ? 0 : pessoa.hashCode());
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
		Cedente other = (Cedente) obj;
		if (contaBancaria == null) {
			if (other.contaBancaria != null)
				return false;
		} else if (!contaBancaria.equals(other.contaBancaria))
			return false;
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

}
