package com.zihenx.aulaInjecaoDependencia.services;

import com.zihenx.aulaInjecaoDependencia.entities.Funcionario;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalarioService {

    @Autowired
    private ImpostoService impostoService;
    @Autowired
    private PrevicenciaService previcenciaService;

    public double calcularSalario(@NotNull Funcionario funcionario){

        double previdencia = previcenciaService.calcularPrevidencia(funcionario.getSalario());
        double imposto = impostoService.calcularImposto(funcionario.getSalario());

        return funcionario.getSalario() - previdencia - imposto;
    }
}
