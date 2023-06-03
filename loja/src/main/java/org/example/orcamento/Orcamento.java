package org.example.orcamento;

import org.example.orcamento.situacao.EmAnalise;
import org.example.orcamento.situacao.Finalizado;
import org.example.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento  implements  Orcavel {
    private BigDecimal valor;

    private List<Orcavel> itens;

    private SituacaoOrcamento situacao;

    public Orcamento(){
    this.valor= BigDecimal.ZERO;
    this.itens = new ArrayList<>();
    this.situacao = new EmAnalise();

    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }




    public BigDecimal getValor() {
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }


    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }


    public boolean isFInalizado(){
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}
