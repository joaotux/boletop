package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

import br.com.umdesenvolvedor.boletop.enumerado.EnumMoeda;

public class Moeda implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numero;
	private EnumMoeda moeda;

	public Moeda(int numero, EnumMoeda moeda) {
		super();
		this.numero = numero;
		this.moeda = moeda;
	}

	public int getNumero() {
		return numero;
	}

	public EnumMoeda getMoeda() {
		return moeda;
	}

	@Override
	public String toString() {
		return "Moeda [numero=" + numero + ", moeda=" + moeda + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((moeda == null) ? 0 : moeda.hashCode());
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
		Moeda other = (Moeda) obj;
		if (moeda != other.moeda)
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}
