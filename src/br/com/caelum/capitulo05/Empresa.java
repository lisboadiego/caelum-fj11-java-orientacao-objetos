package br.com.caelum.capitulo05;

public class Empresa {
	String nome;
	Funcionario[] empregados;
	String cnpj;
	
	void adiciona(Funcionario f) {
		//boolean arrayCheio = true;
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == null) {
				empregados[i] = f;
				//arrayCheio = false;
				break;
			} if (empregados[empregados.length - 1] != null) {
				System.out.println("Todas as vagas j� foram preenchidas!\nPrecisar� de realoca��o");
//				Funcionario[] arrayMaior = new Funcionario[this.empregados.length + 1];
//				for (int j = 0; j < arrayMaior.length; j++) {
//					arrayMaior[this.empregados.length] = f;
//					empregados = arrayMaior;
//				}
				
				break;
			}
		}
		
	
	}
	
	void mostraEmpregados() {
		for (int i = 0; i < empregados.length; i++) {
			empregados[i].mostra();
		}
	}
	
	boolean contem(Funcionario f) {
		for (int i = 0; i < empregados.length; i++) {
			if (empregados[i] == f) {
				System.out.println(f.nome + " faz parte da empresa " + this.nome);
				return true;
			} 
		}
		System.out.println(f.nome+ " n�o faz parte da empresa " + this.nome);
		return false;
	}
}
