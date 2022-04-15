package controller;

import model.FuncionarioTempoIntegral;

public class FuncTIController extends FuncionarioController {

	public static FuncionarioTempoIntegral initFuncionarioTI(
			int id, String nome, double salario,
			int bancoHoras) {
		FuncionarioTempoIntegral f = new FuncionarioTempoIntegral(
			inicializaFuncionario(id, nome, salario)
		);
		f.setBancoHoras(bancoHoras);
		return f;
	}
}
