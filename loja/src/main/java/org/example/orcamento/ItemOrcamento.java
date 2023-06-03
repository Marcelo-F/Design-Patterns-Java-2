package org.example.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements  Orcavel {


    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }

    public ItemOrcamento(BigDecimal valor) {
        this.valor = valor;
    }
}
