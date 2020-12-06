package testes;

import java.util.Arrays;
import java.util.Scanner;

import auxiliar.Constante;
import dominio.Aluno;
import dominio.Professor;
import negocio.Pessoa;


public class TP2 {
	
	private static Pessoa[] pessoas;	
	
	private static void imprimir(int id) {
		System.out.println(pessoas[id].toString());
	}
	
	private static void imprimir() {
		for (int i = 0; i < Constante.VET; i++) {
			if (pessoas[i] != null) {
				imprimir(i);				
			}
		}
	}
		
	
	public static void main(String[] args){		
		
		pessoas = new Pessoa[Constante.VET];		
		
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int opcao;
		
		do {
			System.out.println("[1] Cadastrar professor.");
			System.out.println("[2] Cadastrar aluno.");
			System.out.println("[3] Consultar situação de um docente/discente.");			
			System.out.println("[4] Sair.");
			System.out.print("Informe a opcao desejada: ");
			opcao = in.nextInt(); 	
			
		
			if(Arrays.asList(Constante.OPCOES).contains(opcao)) {		
				
				switch (opcao) {
				case 1: //Professor
					if(i < Constante.VET) {
						
						Professor prof = new Professor();

						System.out.println("Informe o nome do professor: ");
						prof.setNome(in.next());
						
						System.out.println("Informe a sua idade: ");
						prof.setIdade(in.nextInt());
						
						System.out.println("Informe seu salário: ");
						prof.setSalario(in.nextFloat());
						
						System.out.println("Informe seu bônus: ");
						prof.setBonus(in.nextFloat());
						
						System.out.println("Informe seu desconto: ");
						prof.setDesconto(in.nextFloat());
						
						pessoas[i] = prof;
						
						System.out.println("... Cadastro realizado com sucesso! ...");						
						imprimir(i);
						System.out.println("........................................");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar novo professor!");
					}
					break;
				
				
				case 2: //Aluno
					if(i < Constante.VET) {
						
						Aluno alun = new Aluno();
						
						System.out.println("Informe o nome do aluno: ");
						alun.setNome(in.next());
						
						System.out.println("Informe a sua idade: ");
						alun.setIdade(in.nextInt());						
						
						System.out.println("Informe a nota A: ");
						alun.setNotaA(in.nextFloat());
						
						System.out.println("Informe a nota B: ");
						alun.setNotaB(in.nextFloat());	
						
						pessoas[i] = alun;
						
						System.out.println("... Cadastro realizado com sucesso! ...");						
						imprimir(i);
						System.out.println("........................................");
						
						i++;
					}else {
						System.out.println("Impossivel cadastrar novo aluno!");
					}
					break;
					
				case 3:
					System.out.print("Informe a identificação do pessoa: ");
					int id = in.nextInt();
					
					if(id >= 0 && id < i) {						
						System.out.println("... Pessoa ...");
						imprimir(id);						
						System.out.println(".............");
						
					}else {
						System.out.println("Inpossível encontrar pessoa!");
					}
					break;
				
				case 4:
					System.out.println("... Lista de Pessoas ...");
					imprimir();
					System.out.println("........................");
					break;
				}
			}else {
				System.out.println("Opção Inválida!");
			}
			
		} while (opcao != 4);
		
		System.out.println("Cadastramento finalizado com sucesso!");
		
		in.close();
		
	}
}
