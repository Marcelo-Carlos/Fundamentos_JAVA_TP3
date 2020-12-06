package dominio;

import exceptions.NomeIncompletoException;

public class Instituicao {
	
	private String nome;
	private String nomeMeio;
	private String ultimoNome;
	
	public void exibir() {
		System.out.println("Nome: " + this.toString());

	}	
	
	@Override
	public String toString() {
		
		return String.format("%s - %s - %s\n",
				this.nome,
				this.nomeMeio,
				this.ultimoNome
				);
	}
	
	public String getNome() throws NomeIncompletoException {
		
		if (this.ultimoNome == null || this.nome == null || this.nomeMeio == null) {
			throw new NomeIncompletoException("EXCEPTION: O campo nome precisa ser preenchido corretamente");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.ultimoNome.toUpperCase().charAt(0));
		sb.append("., ");
		sb.append(this.nome.toUpperCase());
		sb.append(" ");
		sb.append(this.nomeMeio.toLowerCase());
		
		return sb.toString();
	}
	
	public void setNome(String nome) throws NomeIncompletoException {
		
		if (nome.split(" ").length <= 1) {
			throw new NomeIncompletoException("EXCEPTION: É necessário informar um nome com pelo menos duas palavras.");
		}
		
		int posInicial = nome.indexOf(" ");
		int posFinal = nome.indexOf(" ");
		
		this.nome = nome.substring(0, posInicial);
		this.nomeMeio = nome.substring(posInicial, posFinal).trim();
		this.ultimoNome = nome.substring(posFinal).trim();
	}	

}
