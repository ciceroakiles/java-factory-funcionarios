package model;

public class Estagiario extends Funcionario {

	private String instituicaoParceira;
	
	public Estagiario(Funcionario f) {
		this.setId(f.getId());
		this.setNome(f.getNome());
		this.setSalario(f.getSalario());
	}
	
	public String getInstituicaoParceira() {
		return instituicaoParceira;
	}
	
	public void setInstituicaoParceira(String instituicaoParceira) {
		this.instituicaoParceira = instituicaoParceira;
	}
	
	@Override
	public String toString() {
		return (
			this.getId() + " - " + this.getNome() + " - " + this.getSalario()
			+ " - " + this.getInstituicaoParceira()
		);
	}
}
