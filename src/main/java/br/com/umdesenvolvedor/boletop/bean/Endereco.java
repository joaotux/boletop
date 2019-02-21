package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

import br.com.umdesenvolvedor.boletop.enumerado.EnumUF;

public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	private String localidade;
	private String cep;
	private String bairro;
	private String logradouro;
	private String numero;
	private EnumUF uf;

	public Endereco(String localidade, String cep, String bairro, String logradouro, String numero, EnumUF uf) {
		super();
		this.localidade = localidade;
		this.cep = cep;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.numero = numero;
		this.uf = uf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLocalidade() {
		return localidade;
	}

	public String getCep() {
		return cep;
	}

	public String getBairro() {
		return bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public EnumUF getUf() {
		return uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((localidade == null) ? 0 : localidade.hashCode());
		result = prime * result + ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Endereco [localidade=" + localidade + ", cep=" + cep + ", bairro=" + bairro + ", logradouro="
				+ logradouro + ", numero=" + numero + ", uf=" + uf + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (localidade == null) {
			if (other.localidade != null)
				return false;
		} else if (!localidade.equals(other.localidade))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (uf != other.uf)
			return false;
		return true;
	}

}
