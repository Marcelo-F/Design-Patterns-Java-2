package org.example;

import org.example.orcamento.ItemOrcamento;
import org.example.orcamento.Orcamento;
import org.example.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestsCOmposicao {

    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem( new ItemOrcamento( new BigDecimal("200")));
        antigo.reprovar();
        Orcamento orcamento = new Orcamento();

        orcamento.adicionarItem( new ItemOrcamento( new BigDecimal("500")));
        orcamento.adicionarItem(antigo);
        orcamento.aprovar();


        OrcamentoProxy orcamentoProxy  = new OrcamentoProxy(orcamento);

        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());
        System.out.println(orcamentoProxy.getValor());

    }
}
