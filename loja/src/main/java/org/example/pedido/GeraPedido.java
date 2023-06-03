package org.example.pedido;

import org.example.Pedido;
import org.example.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidades;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidades) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidades = quantidades;
    }


    public void executa(){
        Orcamento orcamento = new Orcamento();
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidades() {
        return quantidades;
    }
}
