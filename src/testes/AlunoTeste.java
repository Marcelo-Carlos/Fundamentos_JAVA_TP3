package testes;

import dominio.Aluno;

public class AlunoTeste {
	
	public static void main(String[] args) {
		
		 Aluno aluno1 = new Aluno();
		 aluno1.setNome("Ana Maria Costa");
		 aluno1.setIdade(21);
		 aluno1.setNotaA(8);
		 aluno1.setNotaB(7);
		 aluno1.exibir();	
		 
		 Aluno aluno2 = new Aluno();
		 aluno2.setNome("André Silva");
		 aluno2.setIdade(12);
		 aluno2.setNotaA(5);
		 aluno2.setNotaB(8);
		 aluno2.exibir();
		 
	}

}
