package br.com.caelum.capitulo10;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public double getTotal() {
		return this.total;
	}
	
	public void adiciona(Tributavel t) {
		System.out.println("Adicionando tribut�vel: " + t);
		this.total += t.calculaTributos();                
	}
}
