package com.askchaitanya.HiggsURL.controllers;

import com.askchaitanya.HiggsURL.models.HiggsURLRequest;
import com.askchaitanya.HiggsURL.services.HiggsURLService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/v1/higgs")
public class HiggsURLController {

    private final HiggsURLService higgsURLService;

    @Autowired
    public HiggsURLController(HiggsURLService higgsURLService) {
        this.higgsURLService = higgsURLService;
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public String shortenURL(@RequestBody HiggsURLRequest request) {
        try {
            return higgsURLService.handleRequest(request);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "JsonProcessingException";
        }
    }

}
