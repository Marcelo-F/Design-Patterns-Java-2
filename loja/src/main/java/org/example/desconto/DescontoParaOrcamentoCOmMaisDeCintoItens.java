package org.example.desconto;


import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoCOmMaisDeCintoItens extends Desconto {

    public DescontoParaOrcamentoCOmMaisDeCintoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
