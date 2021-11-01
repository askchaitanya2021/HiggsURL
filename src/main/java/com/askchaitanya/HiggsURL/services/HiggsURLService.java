package com.askchaitanya.HiggsURL.services;

import com.askchaitanya.HiggsURL.models.HiggsURLRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class HiggsURLService {

    private final ObjectMapper mapper;

    public HiggsURLService(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public String handleRequest(HiggsURLRequest request) throws JsonProcessingException {
        var requestString = mapper.writeValueAsString(request);
        log.info("Received: {}", requestString);
        return "Request handled successfully";
    }
}
