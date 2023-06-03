package org.example.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpCliente implements  HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> dados) {


        try{
            URL urlDaAPi = new URL(url);
            URLConnection connection = urlDaAPi.openConnection();
            connection.connect();
        } catch (Exception e){
            throw new RuntimeException(" Erro ao enviar requisicao HTTP", e);
        }
    }
}
