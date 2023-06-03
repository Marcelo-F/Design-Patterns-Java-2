package org.example.orcamento.situacao;


import org.example.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }



}
