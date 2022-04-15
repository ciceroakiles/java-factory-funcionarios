package view;

import controller.EstagiarioController;
import controller.FuncTIController;
import controller.FuncTPController;
import controller.FuncTempController;
import model.Estagiario;
import model.FuncionarioTempoIntegral;
import model.FuncionarioTempoParcial;
import model.FuncionarioTemporario;

public class Contratacao {

	public static void main(String[] args) {
		FuncionarioTempoIntegral fun1 = FuncTIController.initFuncionarioTI(1, "João A.", 2000, 10);
		System.out.println(fun1.toString());
		
		FuncionarioTempoParcial fun2 = FuncTPController.initFuncionarioTP(2, "Joana B.", 1700, 9, 17);
		System.out.println(fun2.toString());
		
		FuncionarioTemporario fun3 = FuncTempController.initFuncionarioTemp(3, "Maria C.", 1900, 20, 12, 2019);
		System.out.println(fun3.toString());
		
		Estagiario fun4 = EstagiarioController.initEstagiario(4, "Pedro D.", 500, "Escola Técnica X");
		System.out.println(fun4.toString());
	}
}
