package org.example;

import org.example.pedido.GeraPedido;
import org.example.pedido.GeraPedidoHandler;
import org.example.pedido.acao.EnviarEmailPedido;
import org.example.pedido.acao.LogPedido;
import org.example.pedido.acao.SalvarPedidoNoBancoDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {
    public static void main(String[] args) {
        String cliente = "Rodrigo";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens  = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento,quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(new SalvarPedidoNoBancoDados()
        , new EnviarEmailPedido(), new LogPedido()));
        geraPedidoHandler.executa(gerador);
    }
}
