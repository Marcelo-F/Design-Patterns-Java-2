package org.example.pedido.acao;

import org.example.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("Enviar email com dados do novo pedido");
    }

}
