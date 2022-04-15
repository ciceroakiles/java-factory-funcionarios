package controller;

import model.FuncionarioTempoParcial;

public class FuncTPController extends FuncionarioController {

	public static FuncionarioTempoParcial initFuncionarioTP(
			int id, String nome, double salario,
			int horaEntrada, int horaSaida) {
		FuncionarioTempoParcial f = new FuncionarioTempoParcial(
			inicializaFuncionario(id, nome, salario)
		);
		f.setHoraEntrada(horaEntrada);
		f.setHoraSaida(horaSaida);
		return f;
	}
}
