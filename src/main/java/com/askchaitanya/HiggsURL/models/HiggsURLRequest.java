package com.askchaitanya.HiggsURL.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Value;

@Value
@JsonDeserialize(builder = HiggsURLRequest.HiggsURLRequestBuilder.class)
public class HiggsURLRequest {

    @JsonProperty("long_url")
    String longURL;

    @JsonProperty("custom_url_slug")
    String customURLSlug;

    @Builder(toBuilder = true)
    public HiggsURLRequest(@JsonProperty("long_url") String longURL,
                           @JsonProperty("custom_url_slug") String customURLSlug) {
        this.longURL = longURL;
        this.customURLSlug = customURLSlug;
    }
}
