package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Carteira implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numero;
	private String descricao;

	public Carteira(int numero, String descricao) {
		super();
		this.numero = numero;
		this.descricao = descricao;
	}

	public int getNumero() {
		return numero;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Carteira [numero=" + numero + ", descricao=" + descricao + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + numero;
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
		Carteira other = (Carteira) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
