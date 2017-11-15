package br.com.caelum.capitulo04;

public class FixandoConhecimentoPorta_4_14_2 {
	boolean aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;
	
	void abre() {
		this.aberta = true;
	}
	
	void fecha() {
		this.aberta = false;
	}
	
	void pinta(String s) {
		this.cor = s;
		System.out.println("A cor da porta �: " + this.cor);
	}
	
	boolean estaAberta() {
		if (this.aberta == true) {
			System.out.println("Est� aberta");
			return true;
		} else {
			System.out.println("Est� fechada");
			return false;
		}
	}
}
