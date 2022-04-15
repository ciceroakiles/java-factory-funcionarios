package model;

public class FuncionarioTemporario extends Funcionario {

	private int dia;
	private int mes;
	private int ano;
	
	public FuncionarioTemporario(Funcionario f) {
		this.setId(f.getId());
		this.setNome(f.getNome());
		this.setSalario(f.getSalario());
	}

	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return (
			this.getId() + " - " + this.getNome() + " - " + this.getSalario()
			+ " - " + this.getDia() + " - " + this.getMes() + " - " + this.getAno()
		);
	}
}
