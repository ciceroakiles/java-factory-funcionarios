package controller;

import model.Estagiario;

public class EstagiarioController extends FuncionarioController {

	public static Estagiario initEstagiario(
			int id, String nome, double salario,
			String instituicaoParceira) {
		Estagiario e = new Estagiario(
			inicializaFuncionario(id, nome, salario)
		);
		e.setInstituicaoParceira(instituicaoParceira);
		return e;
	}
}
