package org.example.pedido.acao;

import org.example.Pedido;

public class LogPedido implements  AcaoAposGerarPedido{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado " +pedido.getCliente());
    }
}
