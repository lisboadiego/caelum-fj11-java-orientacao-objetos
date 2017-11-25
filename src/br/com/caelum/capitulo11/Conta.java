package br.com.caelum.capitulo11;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public abstract void atualiza(double taxa);
}
