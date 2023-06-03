package org.example.orcamento;

import org.example.DomainException;
import org.example.http.HttpAdapter;

import java.util.Map;

import static java.util.Map.of;

public class RegistroDeOrcamento {
    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {


        if(!orcamento.isFInalizado()){
            throw  new DomainException("Orcamento não finalizado!");
        }
        String url = "http://api.externa/orcamento";

        Map<String, Object> dados = of(
                "valor", orcamento.getValor(),
        "quantidadeItens", orcamento.getQuantidadeItens());
        httpAdapter.post(url, dados);
    }
}
