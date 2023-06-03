package org.example;

import org.example.imposto.CalculadoraDeImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
//        System.out.println(calculadora.calcular(orcamento, new ISS()));
//        System.out.println(calculadora.calcular(orcamento, new ICMS()));

    }
}