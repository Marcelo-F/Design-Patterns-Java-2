package org.example.pedido.acao;

import org.example.Pedido;

public class SalvarPedidoNoBancoDados implements  AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvar pedido no Banco de dados");
    }

}
