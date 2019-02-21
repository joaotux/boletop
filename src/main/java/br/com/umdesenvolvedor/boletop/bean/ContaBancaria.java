package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class ContaBancaria implements Serializable {

	private static final long serialVersionUID = 1L;

	private int numConta;
	private Banco banco;
	private Agencia agencia;
	private Carteira carteira;

	public ContaBancaria(int numConta, Banco banco, Agencia agencia, Carteira carteira) {
		super();
		this.numConta = numConta;
		this.banco = banco;
		this.agencia = agencia;
		this.carteira = carteira;
	}

	public int getNumConta() {
		return numConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public Carteira getCarteira() {
		return carteira;
	}

	@Override
	public String toString() {
		return "ContaBancaria [numConta=" + numConta + ", banco=" + banco + ", agencia=" + agencia + ", carteira="
				+ carteira + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agencia == null) ? 0 : agencia.hashCode());
		result = prime * result + ((banco == null) ? 0 : banco.hashCode());
		result = prime * result + ((carteira == null) ? 0 : carteira.hashCode());
		result = prime * result + numConta;
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
		ContaBancaria other = (ContaBancaria) obj;
		if (agencia == null) {
			if (other.agencia != null)
				return false;
		} else if (!agencia.equals(other.agencia))
			return false;
		if (banco == null) {
			if (other.banco != null)
				return false;
		} else if (!banco.equals(other.banco))
			return false;
		if (carteira == null) {
			if (other.carteira != null)
				return false;
		} else if (!carteira.equals(other.carteira))
			return false;
		if (numConta != other.numConta)
			return false;
		return true;
	}

}
