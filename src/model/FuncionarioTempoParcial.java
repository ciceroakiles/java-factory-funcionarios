package model;

public class FuncionarioTempoParcial extends Funcionario {

	private int horaEntrada;
	private int horaSaida;
	
	public FuncionarioTempoParcial(Funcionario f) {
		this.setId(f.getId());
		this.setNome(f.getNome());
		this.setSalario(f.getSalario());
	}
	
	public int getHoraEntrada() {
		return horaEntrada;
	}
	
	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	
	public int getHoraSaida() {
		return horaSaida;
	}
	
	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	@Override
	public String toString() {
		return (
			this.getId() + " - " + this.getNome() + " - " + this.getSalario()
			+ " - " + this.getHoraEntrada() + " - " + this.getHoraSaida()
		);
	}
}
