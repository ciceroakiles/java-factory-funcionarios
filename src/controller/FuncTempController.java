package controller;

import model.FuncionarioTemporario;

public class FuncTempController extends FuncionarioController {

	public static FuncionarioTemporario initFuncionarioTemp(
			int id, String nome, double salario,
			int dia, int mes, int ano) {
		FuncionarioTemporario f = new FuncionarioTemporario(
			inicializaFuncionario(id, nome, salario)
		);
		f.setDia(dia);
		f.setMes(mes);
		f.setAno(ano);
		return f;
	}
}
