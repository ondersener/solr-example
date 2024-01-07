package com.works.restcontrollers;

import com.works.services.SolrService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SolrController {

    private final SolrService solrService;


    @GetMapping("/solrQuery")
    public String solrQuery(){
        // Solr servisinden gelen verileri döndür.
        return solrService.getSolrData();
    }

}
