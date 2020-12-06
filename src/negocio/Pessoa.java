package negocio;


public abstract class Pessoa {
	private String nome;
	private int idade;
		
	public Pessoa() {
		this.setNome("Sem nome");
	}
	
	public Pessoa(String nome, int idade) {
		this();
		this.setNome(nome);
		this.setIdade(idade);		
	}
	
	public void exibir() {
		System.out.println("Pessoa: " + this.toString());
	}
	
	public abstract String consultarSituacao(float valor);
	
	@Override
	public String toString() {
		
		return String.format("Nome: %5s | Idade: %3d anos", 
				this.nome,
				this.idade
				);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	


}
