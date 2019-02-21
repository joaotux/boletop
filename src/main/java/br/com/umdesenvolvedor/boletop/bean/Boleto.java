package br.com.umdesenvolvedor.boletop.bean;

import java.io.Serializable;

public class Boleto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String localPagamento;
	private String instrucaoAoPagador;
	private String instrucao1;
	private String instrucao2;
	private String instrucao3;
	private String instrucao4;
	private String instrucao5;
	private String instrucao6;
	private String instrucao7;
	private String instrucao8;
	private String numCodBarra;
	private Sacado sacado;
	private Cedente cedente;
	private Titulo titulo;

	public Boleto(String localPagamento, String instrucaoAoPagador, Sacado sacado, Cedente cedente, Titulo titulo) {
		super();
		this.localPagamento = localPagamento;
		this.instrucaoAoPagador = instrucaoAoPagador;
		this.sacado = sacado;
		this.cedente = cedente;
		this.titulo = titulo;
	}

	public String getLocalPagamento() {
		return localPagamento;
	}

	public String getInstrucaoAoPagador() {
		return instrucaoAoPagador;
	}

	public String getInstrucao1() {
		return instrucao1;
	}

	public void setInstrucao1(String instrucao1) {
		this.instrucao1 = instrucao1;
	}

	public String getInstrucao2() {
		return instrucao2;
	}

	public void setInstrucao2(String instrucao2) {
		this.instrucao2 = instrucao2;
	}

	public String getInstrucao3() {
		return instrucao3;
	}

	public void setInstrucao3(String instrucao3) {
		this.instrucao3 = instrucao3;
	}

	public String getInstrucao4() {
		return instrucao4;
	}

	public void setInstrucao4(String instrucao4) {
		this.instrucao4 = instrucao4;
	}

	public String getInstrucao5() {
		return instrucao5;
	}

	public void setInstrucao5(String instrucao5) {
		this.instrucao5 = instrucao5;
	}

	public String getInstrucao6() {
		return instrucao6;
	}

	public void setInstrucao6(String instrucao6) {
		this.instrucao6 = instrucao6;
	}

	public String getInstrucao7() {
		return instrucao7;
	}

	public void setInstrucao7(String instrucao7) {
		this.instrucao7 = instrucao7;
	}

	public String getInstrucao8() {
		return instrucao8;
	}

	public void setInstrucao8(String instrucao8) {
		this.instrucao8 = instrucao8;
	}

	public String getNumCodBarra() {
		return numCodBarra;
	}

	public Sacado getSacado() {
		return sacado;
	}

	public Cedente getCedente() {
		return cedente;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Boleto [localPagamento=" + localPagamento + ", instrucaoAoPagador=" + instrucaoAoPagador
				+ ", instrucao1=" + instrucao1 + ", instrucao2=" + instrucao2 + ", instrucao3=" + instrucao3
				+ ", instrucao4=" + instrucao4 + ", instrucao5=" + instrucao5 + ", instrucao6=" + instrucao6
				+ ", instrucao7=" + instrucao7 + ", instrucao8=" + instrucao8 + ", numCodBarra=" + numCodBarra
				+ ", sacado=" + sacado + ", cedente=" + cedente + ", titulo=" + titulo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedente == null) ? 0 : cedente.hashCode());
		result = prime * result + ((instrucao1 == null) ? 0 : instrucao1.hashCode());
		result = prime * result + ((instrucao2 == null) ? 0 : instrucao2.hashCode());
		result = prime * result + ((instrucao3 == null) ? 0 : instrucao3.hashCode());
		result = prime * result + ((instrucao4 == null) ? 0 : instrucao4.hashCode());
		result = prime * result + ((instrucao5 == null) ? 0 : instrucao5.hashCode());
		result = prime * result + ((instrucao6 == null) ? 0 : instrucao6.hashCode());
		result = prime * result + ((instrucao7 == null) ? 0 : instrucao7.hashCode());
		result = prime * result + ((instrucao8 == null) ? 0 : instrucao8.hashCode());
		result = prime * result + ((instrucaoAoPagador == null) ? 0 : instrucaoAoPagador.hashCode());
		result = prime * result + ((localPagamento == null) ? 0 : localPagamento.hashCode());
		result = prime * result + ((numCodBarra == null) ? 0 : numCodBarra.hashCode());
		result = prime * result + ((sacado == null) ? 0 : sacado.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Boleto other = (Boleto) obj;
		if (cedente == null) {
			if (other.cedente != null)
				return false;
		} else if (!cedente.equals(other.cedente))
			return false;
		if (instrucao1 == null) {
			if (other.instrucao1 != null)
				return false;
		} else if (!instrucao1.equals(other.instrucao1))
			return false;
		if (instrucao2 == null) {
			if (other.instrucao2 != null)
				return false;
		} else if (!instrucao2.equals(other.instrucao2))
			return false;
		if (instrucao3 == null) {
			if (other.instrucao3 != null)
				return false;
		} else if (!instrucao3.equals(other.instrucao3))
			return false;
		if (instrucao4 == null) {
			if (other.instrucao4 != null)
				return false;
		} else if (!instrucao4.equals(other.instrucao4))
			return false;
		if (instrucao5 == null) {
			if (other.instrucao5 != null)
				return false;
		} else if (!instrucao5.equals(other.instrucao5))
			return false;
		if (instrucao6 == null) {
			if (other.instrucao6 != null)
				return false;
		} else if (!instrucao6.equals(other.instrucao6))
			return false;
		if (instrucao7 == null) {
			if (other.instrucao7 != null)
				return false;
		} else if (!instrucao7.equals(other.instrucao7))
			return false;
		if (instrucao8 == null) {
			if (other.instrucao8 != null)
				return false;
		} else if (!instrucao8.equals(other.instrucao8))
			return false;
		if (instrucaoAoPagador == null) {
			if (other.instrucaoAoPagador != null)
				return false;
		} else if (!instrucaoAoPagador.equals(other.instrucaoAoPagador))
			return false;
		if (localPagamento == null) {
			if (other.localPagamento != null)
				return false;
		} else if (!localPagamento.equals(other.localPagamento))
			return false;
		if (numCodBarra == null) {
			if (other.numCodBarra != null)
				return false;
		} else if (!numCodBarra.equals(other.numCodBarra))
			return false;
		if (sacado == null) {
			if (other.sacado != null)
				return false;
		} else if (!sacado.equals(other.sacado))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
