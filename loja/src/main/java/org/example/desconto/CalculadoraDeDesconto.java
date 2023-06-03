package org.example.desconto;

import org.example.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
    public BigDecimal calcular(Orcamento orcamento){
      Desconto desconto  = new DescontoParaOrcamentoCOmMaisDeCintoItens(
              new DescontoParaOrcamentoCOmMaisDeQuinhentos( new SemDesconto())
      );
        return desconto.efetuarCalculo(orcamento);
    }
}
