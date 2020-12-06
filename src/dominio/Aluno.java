package dominio;

import negocio.Pessoa;

public class Aluno extends Pessoa{
	
	private float notaA;
	private float notaB;
	
	public Aluno() {
		this.setNome("aluno desconhecido");
	}
	
	public Aluno(String nome, int idade) {
		this();
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public Aluno(String nome, int idade, float notaA, float notaB) {
		this(nome, idade);
		this.notaA = notaA;
		this.notaB = notaB;
	}
	
	
	public String consultarSituacao(float media) {
		if(media < 4) {
			return "Reprovado!";
		}else if(media >= 4 && media < 7) {
			return "Prova final!";
		}else {
			return "Aprovado!";
		}
	}
	
	public float calcularMedia() {
		return(notaA + notaB) / 2;
	}
	
	@Override
	public String toString() {
		
		float media = calcularMedia();
		
		String situacao = consultarSituacao(media);
		
		return String.format(" %s | Nota 1: %s | Nota 2: %s | Média: %s | Situação: %s ",
				super.toString(),
				this.notaA,
				this.notaB,
				media,
				situacao);
	}
	
	
	public float getNotaA() {
		return notaA;
	}
	public void setNotaA(float notaA) {
		this.notaA = notaA;
	}
	public float getNotaB() {
		return notaB;
	}
	public void setNotaB(float notaB) {
		this.notaB = notaB;
	}
	
	
}
