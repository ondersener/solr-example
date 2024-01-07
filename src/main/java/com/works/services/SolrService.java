package com.works.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class SolrService {

    private final RestTemplate restTemplate;

    @Autowired
    public SolrService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    public String getSolrData(){
        //Solr servisinin URL'sini ve sorguyu oluşturur.
        String solrUrl = "http://example/select?q=updatedAt:[2020-01-01T00:00:00Z TO *]";

        //RestTemplate kullanarak Solr Servisine GET isteği gönderir.
        return restTemplate.getForObject(solrUrl,String.class);
    }
}
