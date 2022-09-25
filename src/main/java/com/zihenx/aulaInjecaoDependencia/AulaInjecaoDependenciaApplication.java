package com.zihenx.aulaInjecaoDependencia;

import com.zihenx.aulaInjecaoDependencia.entities.Funcionario;
import com.zihenx.aulaInjecaoDependencia.services.SalarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AulaInjecaoDependenciaApplication implements CommandLineRunner {

	@Autowired
	private SalarioService salarioService;

	public static void main(String[] args) {
		SpringApplication.run(AulaInjecaoDependenciaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Funcionario funcionario = new Funcionario("Fledson", 4000.0);
		double salarioLiquido = salarioService.calcularSalario(funcionario);
		System.out.println("Salario liquido " + salarioLiquido);
	}
}
