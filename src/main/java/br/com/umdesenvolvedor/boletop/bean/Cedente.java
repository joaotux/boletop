package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Cedente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Pessoa pessoa;

	public Cedente(Pessoa pessoa) {
		super();
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	@Override
	public String toString() {
		return "Cedente [pessoa=" + pessoa + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (pessoa == null) {
			if (other.pessoa != null)
				return false;
		} else if (!pessoa.equals(other.pessoa))
			return false;
		return true;
	}

}
