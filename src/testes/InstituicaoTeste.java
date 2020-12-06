package testes;

import dominio.Instituicao;
import exceptions.NomeIncompletoException;

public class InstituicaoTeste {
	
	public static void main(String[] args) {
		
		try {
			Instituicao i1 = new Instituicao();
			i1.setNome("Marcelo Carlos");
			System.out.println(">>> " + i1.getNome());
			
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Instituicao i2 = new Instituicao();
			i2.setNome("Maria Alves Oliveira");
			System.out.println(">>> " + i2.getNome());
			
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
					
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			Instituicao i3 = new Instituicao();
			i3.setNome("Ana Josefa Andrade");
			System.out.println(">>> " + i3.getNome());
			
		} catch (NomeIncompletoException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
