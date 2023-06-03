package org.example.pedido;

import org.example.Pedido;
import org.example.orcamento.Orcamento;

import org.example.pedido.acao.AcaoAposGerarPedido;


import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(dados.getCliente(),LocalDateTime.now(), orcamento );

        acoes.forEach(a -> a.executar(pedido));

    }

}
