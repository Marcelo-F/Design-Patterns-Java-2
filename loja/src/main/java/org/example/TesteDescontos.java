package org.example;

import org.example.desconto.CalculadoraDeDesconto;
import org.example.imposto.CalculadoraDeImpostos;
import org.example.imposto.ICMS;
import org.example.imposto.ISS;
import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {

    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        Orcamento segundo = new Orcamento();

        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));

    }
}
