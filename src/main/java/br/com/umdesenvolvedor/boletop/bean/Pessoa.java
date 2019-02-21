package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpfcnpj;
	private Endereco endereco;

	public Pessoa(String nome, String cpfcnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.cpfcnpj = cpfcnpj;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getCpfcnpj() {
		return cpfcnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpfcnpj=" + cpfcnpj + ", endereco=" + endereco + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfcnpj == null) ? 0 : cpfcnpj.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpfcnpj == null) {
			if (other.cpfcnpj != null)
				return false;
		} else if (!cpfcnpj.equals(other.cpfcnpj))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
