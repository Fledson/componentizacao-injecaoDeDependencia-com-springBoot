package com.zihenx.aulaInjecaoDependencia.services;

import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
    public double calcularImposto(double salarioBruto) {
        return salarioBruto * 0.2;
    }
}
