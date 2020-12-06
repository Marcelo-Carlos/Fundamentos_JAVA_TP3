package testes;

import dominio.Professor;

public class ProfessorTeste {
	
	public static void main(String[] args) {
		
		Professor prof1 = new Professor();
		prof1.setNome("José Silva Andradre");
		prof1.setIdade(32);
		prof1.setSalario(3220);
		prof1.setBonus(2000);
		prof1.setDesconto(10000);
		prof1.exibir();
		
		Professor prof2 = new Professor();
		prof2.setNome("Maria Andradre Oliveira");
		prof2.setIdade(42);
		prof2.setSalario(320);
		prof2.setBonus(200);
		prof2.setDesconto(100);
		prof2.exibir();
	}

}
