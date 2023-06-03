package org.example;

import org.example.http.JavaHttpCliente;
import org.example.orcamento.Orcamento;
import org.example.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(
                new JavaHttpCliente());

        registroDeOrcamento.registrar(orcamento);
    }
}
