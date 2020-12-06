package dominio;

import auxiliar.Constante;
import negocio.Pessoa;

public class Professor extends Pessoa{
	
	private float salario;
	private float bonus;
	private float desconto;
	
	public Professor() {
		this.setNome("Professor desconhecido");
	}
	
	public Professor(String nome, int idade) {
		this();
		this.setNome(nome);
		this.setIdade(idade);
	}
	
	public Professor(String nome, int idade, float salario, float bonus, float desconto) {
		this(nome, idade);
		this.setSalario(salario);
		this.setBonus(bonus);
		this.setDesconto(desconto);
	}
	
	public float calcularSalarioLiquido() {
		return this.salario + this.bonus - this.desconto;
	}
	
	@Override
	public String consultarSituacao(float salarioLiquido) {
		
		if(salarioLiquido < Constante.SALARIO_LIMITE_POBRE) {
			return "pobre";
		}else if (salarioLiquido >= Constante.SALARIO_LIMITE_POBRE) {
			return "rico";
		}else {
			return "classe média";
		}
	}
	
	@Override
	public String toString() {
		
		float salarioLiquido = calcularSalarioLiquido();
		
		String situacao = consultarSituacao(salarioLiquido);
		
		return String.format("%s | Salário: %s | Bônus: %s | Desconto: %s | Salário liquido: %.2f | Situação: %s",
				super.toString(),
				this.salario,
				this.bonus,
				this.desconto,
				salarioLiquido,
				situacao);
	}
	
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getBonus() {
		return bonus;
	}
	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	public float getDesconto() {
		return desconto;
	}
	public void setDesconto(float desconto) {
		this.desconto = desconto;
	}
	

}
