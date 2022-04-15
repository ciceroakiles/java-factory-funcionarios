package controller;

import model.Funcionario;

public class FuncionarioController {

	public static Funcionario inicializaFuncionario(int id, String nome, double salario) {
		Funcionario f = new Funcionario();
		f.setId(id);
		f.setNome(nome);
		f.setSalario(salario);
		return f;
	}
}
