package model;

public class FuncionarioTempoIntegral extends Funcionario {

	private int bancoHoras;
	
	public FuncionarioTempoIntegral(Funcionario f) {
		this.setId(f.getId());
		this.setNome(f.getNome());
		this.setSalario(f.getSalario());
	}
	
	public int getBancoHoras() {
		return bancoHoras;
	}
	
	public void setBancoHoras(int bancoHoras) {
		this.bancoHoras = bancoHoras;
	}
	
	@Override
	public String toString() {
		return (
			this.getId() + " - " + this.getNome() + " - " + this.getSalario()
			+ " - " + this.getBancoHoras()
		);
	}
}
