package com.zihenx.aulaInjecaoDependencia.services;


import org.springframework.stereotype.Service;

@Service
public class PrevicenciaService {
    public double calcularPrevidencia(double salarioBruto) {
        return salarioBruto * 0.1;
    }
}
