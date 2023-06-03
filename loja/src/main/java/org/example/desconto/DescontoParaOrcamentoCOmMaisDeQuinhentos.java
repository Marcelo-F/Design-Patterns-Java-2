package org.example.desconto;


import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoCOmMaisDeQuinhentos extends Desconto {

    public DescontoParaOrcamentoCOmMaisDeQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal(0.05));

    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal(500)) > 0;
    }
}
